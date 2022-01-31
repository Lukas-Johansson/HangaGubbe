import javax.swing.*;
import java.beans.Beans;
import java.io.IOException;
import java.util.Scanner;


public class FurkaDurka {
    public static void main(String[] args) {

        String word = JOptionPane.showInputDialog("Do you want to use prewritten words? (Yes/No): ");

        if (word.equalsIgnoreCase("Yes")) {
            String Start = JOptionPane.showInputDialog("Do you want to start?");
        }

        else if (word.equalsIgnoreCase("No")) {
           String Ownword = JOptionPane.showInputDialog("Please type in your own word");

            String DaGuess = JOptionPane.showInputDialog("Please guess the word");
            DaGuess =  DaGuess.toUpperCase();

        }

    }
}



