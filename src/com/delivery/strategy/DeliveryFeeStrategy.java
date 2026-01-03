package com.delivery.strategy;

import com.delivery.decorator.Order;

/**
 * Strategy Interface for delivery fee calculation.
 */
public interface DeliveryFeeStrategy {
    /**
     * Calculates the delivery fee based on the order.
     * @param order The order to calculate the fee for.
     * @return The calculated delivery fee.
     */
    double calculateFee(Order order);
}
