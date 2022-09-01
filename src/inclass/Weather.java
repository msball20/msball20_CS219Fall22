package inclass;

import java.util.Scanner;
public class Weather {
    public static double windchill(double t, double v) {

        return 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
    }
        public static void main(String [] args){

            Scanner kbd = new Scanner(System.in);

            System.out.print("Enter temperature in degrees F: ");
            double temperature = kbd.nextDouble();

            System.out.print("Enter a wind velocity in MPH: ");
            double velocity = kbd.nextDouble();

           // System.out.printf("The windchill for " + temperature + " degrees at " + velocity + " MPH is %.1f\n",windchill(temperature, velocity));
            System.out.printf("The windchill for %.1f degrees at %.1f MPH is %.2f\n", temperature, velocity, windchill(temperature, velocity));
            // have to use the \ to escape the end of the quotations
           System.out.println("They said \"Dont do it\"");

    }
}
