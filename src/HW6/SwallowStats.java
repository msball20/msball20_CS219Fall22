package HW6;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class SwallowStats {

    public static void swallow_stats() {

        // connect to the web page of speeds
        URL url = null;    // null is the "nothing value"
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        double sum = 0.0;
        int count = 0;

        // read each line of the web file
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        while (true) {

            if (!s.hasNextLine())
                break;

            String line = s.nextLine();  // read a line of the website

            if(line.equals("")){
                continue;
            }


            if (line.indexOf("#") == -1) {   // modify condition
                sum = sum + Double.parseDouble(line);
                count++;
                if(Double.parseDouble(line) < min){
                    min = Double.parseDouble(line);
                }
                if (Double.parseDouble(line) > max) {
                    max = Double.parseDouble(line);
                }
            }


        }

        System.out.printf("Average swallow speeds is %.2f\n", sum / count);
        System.out.printf("Maximum swallow speeds is %.2f\n", max);
        System.out.printf("Minimum swallow speeds is %.2f\n", min);
    } // swallow_stats

    public static void main(String [] args) {
        swallow_stats();
    }
}