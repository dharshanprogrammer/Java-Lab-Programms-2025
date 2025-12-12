import com.sun.source.tree.LambdaExpressionTree;

import java.util.Scanner;

public class Book {
    String bookname, author;
    int bookid, totalcompies, availablecompies;

    Book(String bookname, String author, int bookid, int totalcopies) {
        this.bookname = bookname;
        this.author = author;
        this.bookid = bookid;
        this.totalcompies = totalcopies;
        this.availablecompies = totalcopies;
    }

    public void getBook() {
        if (availablecompies < 1) {
            System.out.println("Book Not Available :");
        }
        availablecompies += 1;
        display();

    }

    public void giveBook() {
        availablecompies -= 1;
        display();
    }

    public void display() {
        System.out.print("\nBook Name : " + bookname + "\nBook_Id : " + bookid + "\nBook_Author : " + author + "Total Copies : " + totalcompies + "Avilable copies :" + availablecompies);

    }

    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter Book Name");
        String bookname = s.next();
        System.out.println("\nEnter bookAuthor Name: ");
        String author = s.next();
        System.out.print("\nEnter Book_id");
        int book_id = s.nextInt();
        System.out.print("\nEnter Total Copies Of Book : ");
        int total_Copies = s.nextInt();
        Book b = new Book(bookname, author, book_id, total_Copies);
        boolean decision1 = true;
        while (decision1) {
            System.out.print("\nEnter 1 for buyBook : " + "\nEnter 2 for Give Book " + "\nEnter 3 for Book Details");
            int decision2 = s.nextInt();

            switch (decision2) {
                case 1 -> {
                    b.giveBook();
                }
                case 2 -> {
                    b.getBook();

                }
                case 3 -> {
                    b.display();
                }
                default -> {
                    decision1 = false;
                }
            }
        }
    }
}

