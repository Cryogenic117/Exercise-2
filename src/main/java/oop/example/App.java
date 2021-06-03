/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Brandon Knudson
 */

// Takes user input and returns character count
package oop.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        //Get input
        Scanner input = new Scanner(System.in);
        System.out.println("What is the input string? ");
        String userInput = input.nextLine();

        // Input Check
        while(userInput.length() == 0){
            System.out.println("Please input something into the program");
            userInput = input.nextLine();
        }
        // Result
        System.out.printf("%s has %d characters.", userInput, userInput.length());
    }
}
