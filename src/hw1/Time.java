package hw1;

public class Time {
    public static void main(String [] args){
        // put the code for Exercise 2.3
        // 3:23 and 20 seconds

        // Question 2:
        int hour = 15;
        int minute = 23;
        int second = 20;

        //Question 3:
        int since_midnight = (15*3600) + (23*60) + (20);

        //Question 4:
        int seconds_left = 86400 - since_midnight;

        // Question 5:
        double percentage = (since_midnight * 100)/ 86400;
        double rounded_percentage = Math.round(percentage);

        System.out.println(hour + ":" + minute + ":" + second + " is " + since_midnight + " seconds since midnight.");
        System.out.println("There are " + seconds_left + " seconds remaining.");
        System.out.println(rounded_percentage + "% of the day has elapsed.");

    }
}