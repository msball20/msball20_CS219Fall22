package Exam1;

import java.util.Scanner;

public class Exam1 {


    public static int count2to7(int n){
        int count = 0;

        while(n>0){
            if(n % 10 > 2 && n % 10 < 7){
                count++;

            }
            n = n /10;

        }
        return count;
    }

    public static int getValid(Scanner s){
     int n = -1;
        while(true){
            System.out.println("Enter a positive integer: ");

            if(s.hasNextInt()){
                n = s.nextInt();
                    if(n >= 0) {
                        return n;
                    }
            }
            else{
                String str = s.next();
                System.out.printf("Error: Unexpected number: You entered \"%s\"\n", str);
            }
            }

        }



    public static void main (String [] args){

        Scanner s = new Scanner(System.in);

        int n = getValid(s);

        System.out.printf("The number of digits between 2 and 7 is %d\n", count2to7(n));
    }
}
