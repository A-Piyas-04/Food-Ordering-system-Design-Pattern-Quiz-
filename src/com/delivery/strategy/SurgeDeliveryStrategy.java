package com.delivery.strategy;

import com.delivery.decorator.Order;

/**
 * Surge delivery strategy.
 * Highest fee during high demand.
 */
public class SurgeDeliveryStrategy implements DeliveryFeeStrategy {
    @Override
    public double calculateFee(Order order) {
        // Flat fee of $15.0 plus 10% of order cost
        return 15.0 + (order.getCost() * 0.10);
    }
}
