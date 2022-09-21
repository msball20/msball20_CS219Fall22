package HW4;

import java.util.Scanner;

public class Investment {
        public static double investment(double c, double r, int t, int n){

        return c * Math.pow(1+r/n, t * n);
    }


        //initial deposit
        public static double getInitialDeposit(Scanner s){
        boolean valid = false;
        double c = 0;

        while(!valid){
            System.out.print("Please enter initial deposit as a decimal: ");
// make sure the user entered a decimal
            if(s.hasNextDouble()){
                c = s.nextDouble();
                if(c < 0){
                    System.out.printf("Error: Initial deposit should be greater than 0. You entered \"%s\" ", c);
                }
                else{
                    valid = true;
                }
            }

            else{
                System.out.printf("Error: Decimal expected. You entered \"%s\" ", s.next());
            }
        }
        return c;
    }


        //interest rate
        public static double getInterestRate(Scanner s) {
        boolean valid = false;
        double r = 0;


        while (!valid) {
            System.out.print("Please enter interest rate as a decimal: ");
            //make sure the user enters a decimal
            if (s.hasNextDouble()) {
                r = s.nextDouble();
                if (r < 0 || r > 1) {
                    System.out.printf("Error: Interest rate should be expressed as an integer between 0 and 1. You entered \"%s\"", r);
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: Decimal expected. You entered \"%s\" ", s.next());
            }
        }
        return r;
    }


        //number of years
        public static int getYears(Scanner s) {
        boolean valid = false;
        int t = 0;


        while (!valid) {
            System.out.print("Please enter number of years as an integer: ");
//make sure the user enters an integer
            if (s.hasNextInt()) {
                t = s.nextInt();
                if (t < 0) {
                    System.out.printf("Error: Initial deposit should be greater than 0. You entered \"%s\" ", t);

                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: Integer expected. You entered \"%s\" ", s.next());
            }

        }
        return t;
    }

        //number of times to compound per year
        public static int getCompound(Scanner s) {
        boolean valid = false;
        int n = 0;

        while (!valid) {
            System.out.print("Please enter the number of times to compound per year as an integer: ");
            //make sure the user enters an integer
            if (s.hasNextInt()) {
                n = s.nextInt();
                if (n < 0) {
                    System.out.printf("Error: Initial deposit should be greater than 0. You entered \"%s\" ", n);

                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: Integer expected. You entered \"%s\" ", s.next());
            }
        }
        return n;
    }




        //main funtion
        public static void main(String []args){

        Scanner kbd = new Scanner(System.in);

        double c = getInitialDeposit(kbd);
        double r = getInterestRate(kbd);
        int t = getYears(kbd);
        int n = getCompound(kbd);


        System.out.printf("Your investment is worth %.2f", Investment.investment(c,r,t,n));


    }
    }

