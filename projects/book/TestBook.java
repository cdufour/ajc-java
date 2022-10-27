package project;

import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Scanner sc = null;
        Book[] books = new Book[2];
        for (int i=0; i<books.length; i++) {
            sc = new Scanner(System.in);

            System.out.print("Donner le titre du livre " + (i+1) + ": ");
            String title = sc.nextLine();

            System.out.print("Donner l'auteur du livre " + (i+1) + ": ");
            String author = sc.nextLine();

            System.out.print("Donner le nombre de pages du livre " + (i+1) + ": ");
            int pages = sc.nextInt();

            books[i] = new Book(title, author, pages);
        }
        sc.close();

        // recap
        for (Book book : books)
            System.out.println(book);

        System.out.println("Le nombre de livres est " + Book.count);

    }
}