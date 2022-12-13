package ZipCodeDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//JPanel is the base class
public class GUIPanel extends JPanel {
    private JTextField zipcode;
    private JButton submit;
    private JTextArea output;

    private Database db; //the zipcode database

   //add Jbutton maxlat
    private JButton maxlat;

    public GUIPanel() {
        //this.zipcode refers to zipcode
        this.zipcode = new JTextField("zipcode", 7);
        //this.add is defined inside of the base class (Jpanel)
        this.add(this.zipcode);

        this.submit = new JButton("Submit");
        this.add(this.submit);
        this.submit.addActionListener(new SubmitButtonListener());

        //create the Northernmost button
        this.maxlat = new JButton("Northernmost");
        this.add(this.maxlat);
        this.maxlat.addActionListener(new MaxLatButtonListener());


        this.output = new JTextArea(5, 20);
        this.add(this.output);

        this.db = new Database();
    }

    class SubmitButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //function will get called when the user presses submit
            output.setText("The button was pressed.");

            //get the zipcode out of the text feild
            String code = zipcode.getText();

            Zipcode zc = db.search(code);
            WeatherObservation wob = zc.getWeatherData();

            output.setText(wob.toString());

        }

    }

    //create a new class to create the MaxLat button
    class MaxLatButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e){
            //Northernmost button

            Zipcode zc2 = db.getNorthern();

           output.setText(zc2.toString());

        }
    }
}
