import javax.swing.*;
import java.beans.Beans;
import java.io.IOException;
import java.util.Scanner;


public class FurkaDurka {
    public static void main(String[] args) {

        System.out.println("Please type in your own word");
        String phrase = input.nextLine();
        phrase = phrase.trim();
        phrase = phrase.replaceAll(" ", "  ");
        phrase = phrase.toUpperCase();
        String phrase1 = phrase.replaceAll("[A-Z]", "_ ");
    }

}




