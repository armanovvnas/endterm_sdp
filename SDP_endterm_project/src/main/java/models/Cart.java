package models;

import strategies.DiscountStrategy;
import strategies.NoDiscount;

import java.util.ArrayList;
import java.util.List;
public class Cart {
    private static Cart instance;
    private List<Book> items;
    private DiscountStrategy discountStrategy; // Added discount strategy
    private Cart() {
        items = new ArrayList<>();
        discountStrategy = new NoDiscount(); // Default strategy
    }
    public static Cart getInstance() {
        if (instance == null) {
            instance = new Cart();
        }
        return instance;
    }
    public void addItem(Book book) {
        items.add(book);
    }
    public void removeItem(int bookId) {
        items.removeIf(book -> book.getId() == bookId);
    }
    public double getTotalPrice() {
        double total = items.stream().mapToDouble(Book::getPrice).sum();
        return discountStrategy.applyDiscount(total);
    }
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    public List<Book> getItems() {
        return items;
    }
}
