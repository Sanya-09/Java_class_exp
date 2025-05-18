// Outer class
public class Library {
    // Static nested class
    public static class Book {
    String title;
    String author;
    String ISBN;
    //Constructor
    public Book(String title, String author, String ISBN) {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
    } 
    // Method to display book details
    public void displayDetails() {
    System.out.println("Book Title : " + title);
    System.out.println("Author : " + author);
    System.out.println("ISBN : " + ISBN);
    }
    }
    // Main method
    public static void main(String[] args) {
    // Creating an instance of the static nested class Book
    Library.Book book1 = new Library.Book("The Alchemist", "Paulo Coelho",
    "9780061122415");
    // Calling the method to display book details
    book1.displayDetails();
    }
    }
