package models;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private String author;
    private List<String> pages;
    private double price;
    // Constructor for Book class
    public Book(int id, String title, String author, List<String> pages, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }
    // Method to get the first five pages of the book as a preview
    public List<String> getPreview() {
        return pages.subList(0, Math.min(5, pages.size()));
    }
    // Method to get a short annotation about the book
    public String getAnnotation() {
        return "Annotation for " + title + " by " + author;
    }
    public int getId() { return id; }
    public String getTitle() { return title; }
    public double getPrice() { return price; }
}
