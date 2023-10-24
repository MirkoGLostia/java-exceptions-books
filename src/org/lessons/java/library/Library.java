package org.lessons.java.library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // arrays and variables
        int numberOfBooks;
        Books[] listOfBooks;
        String titleBook;
        int numberPagesBook;
        String authorBook;
        String editorBook;

        // set up array
        System.out.println("How many books do you want to add?");
        numberOfBooks = Integer.parseInt(userInput.nextLine());

        if (numberOfBooks < 0 || numberOfBooks == 0) {
            System.out.println("you need a positive number");
            throw new NullPointerException();
        }

        listOfBooks = new Books[numberOfBooks];



        // inserting books into array

        for (int i = 0; i < listOfBooks.length; i++) {

            int number = i + 1;

            try {
                System.out.println("What is the title of the book " + number + "?");
                    titleBook = userInput.nextLine();

                System.out.println("What is the number of pages of the book " + number + "?");
                    numberPagesBook = Integer.parseInt(userInput.nextLine());

                System.out.println("What is the author of the book " + number + "?");
                    authorBook = userInput.nextLine();

                System.out.println("What is the editor of the book " + number + "?");
                    editorBook = userInput.nextLine();

                listOfBooks[i] = new Books(titleBook, numberPagesBook, authorBook, editorBook);
            }catch (IllegalArgumentException e){
                i--;
                System.out.println(e.getMessage());
            }

        }


        for (Books book : listOfBooks) {
            System.out.println(book);
        }


        // BONUS

        // write the array into the file
        FileWriter fileWriter = null;
        try {
            // provo ad aprirlo
            fileWriter = new FileWriter("./bonus/bonus-library");

            for (int i = 0; i < listOfBooks.length; i++) {
                fileWriter.write((i + 1) + ") ");
                fileWriter.write(listOfBooks[i].getTitle() + " ");
                fileWriter.write(listOfBooks[i].getPageNumbers() + " ");
                fileWriter.write(listOfBooks[i].getAuthor() + " ");
                fileWriter.write(listOfBooks[i].getEditor() + " \n");

            }

        } catch (IOException e) {
            System.out.println("Unable to write file");
        } finally {

            try {
                if (fileWriter != null) {
                    System.out.println("Chiudo il file");
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        // read the file
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(new File("./bonus/bonus-library"));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }




        userInput.close();
    }
}
