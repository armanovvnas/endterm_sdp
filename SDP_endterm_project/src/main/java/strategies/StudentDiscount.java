package strategies;
public class StudentDiscount implements DiscountStrategy {
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.85; // 15% off
    }
}

