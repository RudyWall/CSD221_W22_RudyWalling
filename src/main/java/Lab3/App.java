/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.*;
import java.util.stream.*;

/**
 *
 * @author rudyw
 */
public class App {

    private final int numBooks = 100;
    private final int numMagazines = 100;
    private final int numDiscMag = 100;
    private Publication[] books = new Publication[numBooks];
    private Magazine[] magazines = new Magazine[numMagazines];
    private DiscMag[] discmags = new DiscMag[numDiscMag];
    private int currentBookIndex = 1;
    private int currentMagazineIndex = 1;
    private int currentDiscMagIndex = 1;
    private Scanner input = new Scanner(System.in);
    private String menu = ""
            + "1. Add Book\n"
            + "2. List Books\n"
            + "3. Edit Books\n"
            + "4. Delete Books\n"
            + "5. Add Magazine\n"
            + "6. List Magazine\n"
            + "7. Add Disc Magazine\n"
            + "8. List Disc Magazine\n"
            + "99. quit";

    public void run() {
        for (int i = 0; i < books.length; i++) {
            books[i] = null;
        }
        boolean done = false;
        while (!done) {
            System.out.println(menu);
            System.out.println("\nEnter option: ");
            String myinput = input.nextLine();
            switch (myinput) {
                case "1":
                    addBook();
                    break;
                case "2":
                    listBook();
                    break;
                case "3":
                    editBook();
                    break;
                case "4":
                    deleteBook();
                    break;
                case "5":
                    addMagazine();
                    break;
                case "6":
                    listMagazine();
                    break;
                case "7":
                    addDisc();
                    break;
                case "8":
                    listDisc();
                    break;
                case "99":
                    done = true;
                    break;
                default:
                    System.out.println("Thats not an option. \nPress ENTER to Continue.");
                    input.nextLine();
            }
        }
    }

    public void addBook() {
        System.out.println("Adding new book...\nEnter book author: ");
        Book author = new Book(input.nextLine());
        System.out.println("Enter book Title: ");
        String title = input.nextLine();
        System.out.println("Enter number of books: ");
        int copies = Integer.parseInt(input.nextLine());
        System.out.println("Enter book price: ");
        double price = Double.parseDouble(input.nextLine());
        System.out.println("adding book:\n" + title + "\n" + author + "\n" + copies + "\n" + price);
        books[currentBookIndex] = new Publication(title, copies, price, author);
        currentBookIndex += 1;
    }

    public void listBook() {
        System.out.println("List of all books:\n");
        for (int i = 1; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println("book number " + i + "\n" + books[i] + "\n");
            } else {
                break;
            }
        }
        System.out.println("Press ENTER to return to menu.");
        input.nextLine();
    }

    public void editBook() {
        for (int i = 1; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println("book number " + i + "\n" + books[i] + "\n");
            } else {
                break;
            }
        }
        System.out.println("Enter Book number from List or input '00' to return to menu: ");
        int booknumber = Integer.parseInt(input.nextLine());
        if (booknumber == 00) {
            return;
        } else {
            System.out.println("Re-Enter Book " + booknumber + "\nEnter book author: ");
        }
        Book author = new Book(input.nextLine());
        System.out.println("Enter book Title: ");
        String title = input.nextLine();
        System.out.println("Enter number of books: ");
        int copies = Integer.parseInt(input.nextLine());
        System.out.println("Enter book price: ");
        double price = Double.parseDouble(input.nextLine());
        System.out.println("adding book:\n" + title + "\n" + author + "\n" + copies + "\n" + price);
        books[booknumber] = new Publication(title, copies, price, author);
        currentBookIndex += 1;

    }

    public void deleteBook() {
        for (int i = 1; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println("book number " + i + "\n" + books[i] + "\n");
            } else {
                break;
            }
        }
        System.out.println("Enter Book number to delete: ");
        int booknumber = Integer.parseInt(input.nextLine());
        books[booknumber] = null;
        currentBookIndex -= 1;
        for (int i = booknumber + 1; i < books.length; i++) {
            books[i - 1] = books[i];
        }
    }

    public void addMagazine() {
        System.out.println("Adding new magazine...");
        System.out.println("Enter magazine Title: ");
        String title = input.nextLine();
        System.out.println("Enter number of magazines: ");
        int copies = Integer.parseInt(input.nextLine());
        System.out.println("Enter magazine price: ");
        double price = Double.parseDouble(input.nextLine());
        System.out.println("adding magazine:\n" + title + "\n" + copies + "\n" + price);
        magazines[currentMagazineIndex] = new Magazine(title, copies, price);
        currentMagazineIndex += 1;
            
}
    public void listMagazine() {
        System.out.println("List of all magazines:\n");
        for (int i = 1; i < magazines.length; i++) {
            if (magazines[i] != null) {
                System.out.println("magazine number " + i + "\n" + magazines[i] + "\n");
            } else {
                break;
            }
        }
        System.out.println("Press ENTER to return to menu.");
        input.nextLine();
    }
    public void addDisc() {
        System.out.println("Adding new DiscMagazine...");
        System.out.println("Enter DiscMagazine Title: ");
        String title = input.nextLine();
        System.out.println("Enter number of DiscMagazines: ");
        int copies = Integer.parseInt(input.nextLine());
        System.out.println("Enter DiscMagazine price: ");
        double price = Double.parseDouble(input.nextLine());
        System.out.println("adding DiscMagazine:\n" + title + "\n" + copies + "\n" + price);
        discmags[currentDiscMagIndex] = new DiscMag(title, copies, price);
        currentDiscMagIndex += 1;
    }
    public void listDisc() {
        System.out.println("List of all DiscMagazines:\n");
        for (int i = 1; i < discmags.length; i++) {
            if (discmags[i] != null) {
                System.out.println("DiscMagazines number " + i + "\n" + discmags[i] + "\n");
            } else {
                break;
            }
        }
        System.out.println("Press ENTER to return to menu.");
        input.nextLine();
    }
}
