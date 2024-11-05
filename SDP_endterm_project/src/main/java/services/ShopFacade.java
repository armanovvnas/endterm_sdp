package services;

import controllers.BookController;
import models.Book;
import models.User;
import views.BookView;

public class ShopFacade {
    private BookController bookController;
    private BookView bookView;
    private NotificationService notificationService;

    public ShopFacade(BookController bookController, BookView bookView, NotificationService notificationService) {
        this.bookController = bookController;
        this.bookView = bookView;
        this.notificationService = notificationService;
    }

    public void viewBookDetails(int bookId) {
        Book book = bookController.getBookDetails(bookId);
        if (book != null) {
            bookView.showBookPreview(book);
            bookView.showAnnotation(book);
        } else {
            System.out.println("Book not found!");
        }
    }

    public void addToCart(User user, int bookId) {
        Book book = bookController.getBookDetails(bookId);
        if (book != null) {
            user.getCart().addItem(book);
            System.out.println("Added to cart: " + book.getTitle());
        }
    }

    public void sendNotification(String message) {
        notificationService.notify(message);
    }
}
