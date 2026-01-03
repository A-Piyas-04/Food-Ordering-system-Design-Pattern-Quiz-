package com.delivery.factory;

import com.delivery.decorator.Order;
import com.delivery.template.FastFoodOrder;
import com.delivery.template.FineDiningOrder;
import com.delivery.template.CloudKitchenOrder;

/**
 * Factory class to create different types of orders.
 */
public class OrderFactory {

    /**
     * Creates an order based on the provided type.
     * @param orderType The type of order (fastfood, finedining, cloudkitchen).
     * @return The created Order instance.
     * @throws IllegalArgumentException if the order type is unknown.
     */
    public static Order createOrder(String orderType) {
        if (orderType == null) {
            return null;
        }
        switch (orderType.toLowerCase()) {
            case "fastfood":
                return new FastFoodOrder();
            case "finedining":
                return new FineDiningOrder();
            case "cloudkitchen":
                return new CloudKitchenOrder();
            default:
                throw new IllegalArgumentException("Unknown order type: " + orderType);
        }
    }
}
