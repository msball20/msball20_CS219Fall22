package HW3;

import java.util.Scanner;

public class Investment {

    public static double investment(double c, double r, int t, int n){

        return c * Math.pow(1+r/n, t * n);
    }

    public static void main(String [] args){

        Scanner kbd = new Scanner(System.in);

        System.out.print("Please enter initial deposit as a decimal: ");
        double c;
        if(kbd.hasNextDouble()){
            c = kbd.nextDouble();
        }
        else{
            System.out.printf("Error: Decimal expected. You entered \"%s\" ", kbd.next());
            return; //exit main
        }
        if(c < 0){
            System.out.printf("Error: Initial deposit should be greater than 0. You entered \"%s\" ", kbd.next());
        }


        System.out.print("Please enter interest rate as a decimal: ");
        double r;
        if (kbd.hasNextDouble()) {
            r = kbd.nextDouble();
        }
        else{
            System.out.printf("Error: Decimal expected. You entered \"%s\" ", kbd.next());
            return; //exit main
        }
        if(r<0 || r>1) {
            System.out.printf("Error: Interest rate should be expressed as an integer between 0 and 1. You entered \"%s\"", kbd.next());


            return; //exit main
        }

        System.out.print("Please enter number of years as an integer: ");
        int t;
        if(kbd.hasNextInt()) {
            t = kbd.nextInt();
        }
        else{
            System.out.printf("Error: Integer expected. You entered \"%s\" ", kbd.next());
            return; //exit main
        }
         if(t < 0) {
             System.out.printf("Error: Initial deposit should be greater than 0. You entered \"%s\" ", kbd.next());

             return;
         }



        System.out.print("Please enter the number of times to compound per year as an integer: ");
        int n;
        if (kbd.hasNextInt()) {
            n = kbd.nextInt();
        }
        else{
            System.out.printf("Error: Integer expected. You entered \"%s\" ", kbd.next());
            return; //exit main
        }
        if(n < 0){
            System.out.printf("Error: Initial deposit should be greater than 0. You entered \"%s\" ", kbd.next());
        }

        System.out.printf("Your investment is worth %.2f", Investment.investment(c,r,t,n));


    }
}




