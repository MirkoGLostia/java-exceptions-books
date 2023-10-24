package org.lessons.java.library;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // arrays and variables
        int numberOfBooks;
        Books[] listOfBooks;

        System.out.println("How many books do you want to add?");
        numberOfBooks = Integer.parseInt(userInput.nextLine());

        if (numberOfBooks < 0 || numberOfBooks == 0) {
            System.out.println("you need a positive number");
            throw new NullPointerException();
        }

        listOfBooks = new Books[numberOfBooks];

        System.out.println(listOfBooks.length);






        userInput.close();
    }
}
