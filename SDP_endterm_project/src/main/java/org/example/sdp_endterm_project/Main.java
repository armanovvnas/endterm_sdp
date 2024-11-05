package org.example.sdp_endterm_project;

import controllers.BookController;
import factories.BookFactory;
import models.Book;
import models.Cart;
import models.User;
import services.NotificationService;
import services.ShopFacade;
import strategies.SeasonalDiscount;
import views.BookView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize components
        BookController bookController = new BookController();
        BookView bookView = new BookView();
        NotificationService notificationService = new NotificationService();
        ShopFacade shopFacade = new ShopFacade(bookController, bookView, notificationService);

        User user = new User(1, "Alice");

        // Using Factory to create a book
        Book newBook = BookFactory.createBook(2, "Book Title 2", "Author 2", List.of("Page 1", "Page 2", "Page 3"), 15.0);

        // Display and add book to cart via Facade
        shopFacade.viewBookDetails(1);
        shopFacade.addToCart(user, 1);

        // Set a discount strategy and get the total price in the cart
        Cart cart = user.getCart();
        cart.setDiscountStrategy(new SeasonalDiscount());
        System.out.println("Total Price in Cart with Discount: $" + cart.getTotalPrice());

        // Notify user
        shopFacade.sendNotification("New discounts available!");
    }
}
