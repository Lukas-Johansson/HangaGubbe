import javax.swing.*;
import java.beans.Beans;
import java.io.IOException;
import java.util.Scanner;


public class FurkaDurka {
    public static void main(String[] args) {

        int guessCount = 0;
        int correctGuess = 0;

        System.out.println("Please type in your word");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] ordtillsak = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            ordtillsak[i] = '_';
        }

        System.out.println("Your word to guess is");
        System.out.println(ordtillsak);
        System.out.println("Please guess your first letter");


    }
}




