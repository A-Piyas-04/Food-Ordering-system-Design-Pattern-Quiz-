package strategy;

import decorator.Order;

/**
 * Normal delivery strategy.
 * Standard delivery fee.
 */
public class NormalDeliveryStrategy implements DeliveryFeeStrategy {
    @Override
    public double calculateFee(Order order) {
        // Flat fee of $5.0
        return 5.0;
    }
}
