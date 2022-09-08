// Callie Ballaine

package HW2;

import java.util.Scanner;

public class DayOfWeek {
    public static int dayofweek(int m, int d, int y) {

        int y0 =  y - (14 - m) / 12;
        int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
        int m0 = m +12 * ((14 - m) / 12) - 2;

        return (d + x + (31 * m0) / 12) % 7;
    }


    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        //Prompt user to enter the month
        System.out.print("Please enter the month as an integer: ");
        int m = kbd.nextInt();

        //Prompt user to enter the day
        System.out.print("Please enter a day as an integer: ");
        int d = kbd.nextInt();

        //Prompt user to enter the year
        System.out.print("Enter the year as an integer: ");
        int y = kbd.nextInt();

        //Print the integer
        System.out.print(dayofweek(m,d,y));
    }
}
