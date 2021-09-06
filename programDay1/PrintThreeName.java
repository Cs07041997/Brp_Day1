package com.bridgelabz.programDay1;

import java.util.Scanner;

public class PrintThreeName {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Print "Write a message: "
        System.out.println("Write a message: ");

        // Read the string written by the user, and assign it
        // to program memory "String message = (string that was given as input)"
        String message1 = scanner.nextLine();
        // Print the message written by the user
        System.out.println("Hi "+message1);
        String message2 = scanner.nextLine();
        // Print the message written by the user
        System.out.println("Hi"+message2);
        String message3 = scanner.nextLine();
        // Print the message written by the user
        System.out.println("Hi"+message3);

	}

}
