package strategy;

import decorator.Order;

/**
 * Express delivery strategy.
 * Higher fee for faster delivery.
 */
public class ExpressDeliveryStrategy implements DeliveryFeeStrategy {
    @Override
    public double calculateFee(Order order) {
        // Flat fee of $10.0 plus 5% of order cost
        return 10.0 + (order.getCost() * 0.05);
    }
}
