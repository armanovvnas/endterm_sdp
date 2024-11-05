package strategies;
public class SeasonalDiscount implements DiscountStrategy {
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.9; // 10% seasonal discount
    }
}
