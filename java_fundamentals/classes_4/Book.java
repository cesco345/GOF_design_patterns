package java_fundamentals.classes_4;

public class Book {
    private String title;
    private String author;
    private int yearOfPublication;

    // Constructor for the Book class
    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    // Getters and setters for Book attributes
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of Publication: " + yearOfPublication);
    }

    public static void main(String[] args) {
        // Create a new Book object using the constructor
        Book myBook = new Book("Java Programming", "John Smith", 2020);

        // Display information about the book
        myBook.displayInfo();
    }
}
