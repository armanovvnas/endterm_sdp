package strategies;
public class NoDiscount implements DiscountStrategy {
    public double applyDiscount(double totalPrice) {
        return totalPrice;// No discount applied
    }
}
