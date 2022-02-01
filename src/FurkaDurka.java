import javax.swing.*;
import java.beans.Beans;
import java.io.IOException;
import java.util.Scanner;


public class FurkaDurka {
    public static void main(String[] args) {

        System.out.println("Please type in your word");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String[] bert = word.split("");

        for (int potatis2 = 0; potatis2 <= bert.length; potatis2++);
        System.out.println("Please guess your first letter");
        Scanner scanner2 = new Scanner(System.in);
        String letter = scanner.next();
        String hahakort = scanner2.toLowerCase();


        if (letter.equals(bert[potatis2])){

        }
    }

}




