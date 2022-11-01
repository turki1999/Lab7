package com.timvisee.hhsbigjava.c4;

import java.util.Scanner;


public class Lab6EX4 {


    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner in = new Scanner(System.in);

        // Ask the user for a word
        System.out.print("Please enter a world: ");
        String str = in.nextLine();

        // Use a string buffer to rverse the string
        StringBuilder buff = new StringBuilder(str);
        str = buff.reverse().toString();

        // Print the resulting string
        System.out.println("Reversed string: " + str);
    }
}