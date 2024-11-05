package models;
public class User {
    private int id;
    private String name;
    private Cart cart;
    // Constructor for User class with Singleton Cart initialization
    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.cart = Cart.getInstance();  // Singleton pattern for Cart
    }
    public Cart getCart() {
        return cart;
    }
    public String getName() { return name; }
}
