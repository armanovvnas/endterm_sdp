package controllers;

import models.Book;

import java.util.ArrayList;
import java.util.List;
public class BookController {
    private List<Book> books;
    // Constructor to initialize the book list
    public BookController() {
        books = new ArrayList<>();
        books.add(new Book(1, "Book Title 1", "Author 1", List.of("Page 1", "Page 2", "Page 3", "Page 4", "Page 5", "Page 6"), 10.0));
        // Additional books can be added as needed
    }
    // Method to retrieve book details by ID
    public Book getBookDetails(int bookId) {
        return books.stream().filter(book -> book.getId() == bookId).findFirst().orElse(null);
    }
    // Method to retrieve a preview of the book (first five pages)
    public List<String> getBookPreview(int bookId) {
        Book book = getBookDetails(bookId);
        return (book != null) ? book.getPreview() : null;
    }
}
