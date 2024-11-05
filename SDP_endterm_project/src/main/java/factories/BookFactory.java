package factories;

import models.Book;

import java.util.List;

public class BookFactory {
    public static Book createBook(int id, String title, String author, List<String> pages, double price) {
        return new Book(id, title, author, pages, price);
    }
}