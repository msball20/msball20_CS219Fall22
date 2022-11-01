package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exam {

    public static String [] load_words(String path, int n) {
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
        String [] words = new String[n];
        int i = 0;
        while (s.hasNextLine()) {
            words[i++] = s.nextLine();
        }

        return words;
    }

    public static String reverse(String word) {
        if (word.length() == 0)
            return "";
        else
            return reverse(word.substring(1)) + word.charAt(0);
    }

    public static String [] isPalindrome(String [] words) {
        String [] is_palindrome = new String[words.length];

        for(int i = 0; i < words.length; i++){
            if(words[i].equals(reverse(words[i]))) {

                is_palindrome[i] = reverse(words[i]);
            }

            }
        return is_palindrome;

    }
public static void main (String [] args){
    String [] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt",
            2309);

    System.out.print(isPalindrome(words));

}
}
