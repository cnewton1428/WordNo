package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some value: ");
        String userInput = input.nextLine();

        while (!userInput.equalsIgnoreCase("no")) { //when user types in value; if not equal to no w.e. inside loop will run
            System.out.println("Enter another word: ");
            userInput = input.nextLine();
            System.out.println("If you want to quit type the word no." + "To continue press any keyboard key.");
            userInput = input.nextLine();
        }
    }
}