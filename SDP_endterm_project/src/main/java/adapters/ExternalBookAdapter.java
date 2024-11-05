package adapters;

import models.Book;

import java.util.List;

// External book class that doesn’t fit with our system
class ExternalBook {
    public int bookId;
    public String bookTitle;
    public String bookAuthor;
    public String[] contentPages;
    public double bookPrice;

    // External book constructor
    public ExternalBook(int bookId, String bookTitle, String bookAuthor, String[] contentPages, double bookPrice) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.contentPages = contentPages;
        this.bookPrice = bookPrice;
    }
}

// Adapter class to convert ExternalBook to Book
public class ExternalBookAdapter extends Book {
    public ExternalBookAdapter(ExternalBook externalBook) {
        super(externalBook.bookId, externalBook.bookTitle, externalBook.bookAuthor,
                List.of(externalBook.contentPages), externalBook.bookPrice);
    }
}
