package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variables
        String text;
        int num;

        //ASk user for input
        System.out.print("Enter a word: ");
        text = input.nextLine();

        System.out.print("Enter a character index number: ");
        num = input.nextInt();

        //Using the length() method
        System.out.println("\nThe size of this word is : " + text.length());

        //Using if statement to make sure index is not out of bounds
        if (num > text.length()) {
            System.out.print("Index is larger than length\n");
        } else {
            System.out.println("The section of word from index 0-" + num + " is : " + text.substring(0, num + 1));
        }
    }

}
