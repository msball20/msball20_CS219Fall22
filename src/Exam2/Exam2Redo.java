package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Exam2Redo {

    //check if the string in the array is a palendrome
    public static boolean isPalindrome2(String s) {
        if (s.length() < 2)
            return true;
        else if (s.charAt(0) == s.charAt(s.length() - 1) &&
                isPalindrome2(s.substring(1, s.length() - 1)))
            return true;
        else
            return false;
    }

//reverse the items in the array
    public static String [] reverse(String [] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    //make the items in the array reverse alphebetical order
    public static String [] isnotAlphebetical(String[] s) {
        for (int i = 0; i < s.length-1; i++) {
            if (s[i].compareTo(s[i + 1]) > 0) {
                String temp = s[i+1];
                s[i+1] = s[i];
                s[i] = temp;
            }
        }
        return reverse(s);
    }

        public static String[] load_words (String path, int n){
            // connect to the web page of speeds
            URL url = null;    // null is the "nothing value"
            Scanner s = null;

            try {
                url = new URL(path); // create a URL object for the path
                s = new Scanner(url.openConnection().getInputStream());
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            // create an array of strings
            String[] words = new String[n];
            int i = 0;
            while (s.hasNextLine()) {
                words[i++] = s.nextLine();
            }
            //make a new array "palendrome" with length 9 and add to it
            String [] palendrome = new String[9];
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if (isPalindrome2(words[j])==true) {
                    String value = words[j];
                    palendrome[count] = value;
                    count++;
                }

            }
            return isnotAlphebetical(palendrome);

        }

        public static void main (String [] args){
            System.out.print(Arrays.toString((load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt",
                    2309))));



        }
    }
