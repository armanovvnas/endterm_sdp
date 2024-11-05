package strategies;

public interface DiscountStrategy {
    //Calculates the discount for a given price.
    double applyDiscount(double totalPrice);
}
