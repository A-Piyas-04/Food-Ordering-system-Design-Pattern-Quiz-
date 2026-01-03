package com.delivery;

import com.delivery.decorator.ExtraPackagingDecorator;
import com.delivery.decorator.GiftWrapDecorator;
import com.delivery.decorator.Order;
import com.delivery.decorator.PriorityHandlingDecorator;
import com.delivery.factory.OrderFactory;
import com.delivery.strategy.DeliveryFeeStrategy;
import com.delivery.strategy.ExpressDeliveryStrategy;
import com.delivery.strategy.NormalDeliveryStrategy;
import com.delivery.strategy.SurgeDeliveryStrategy;

/**
 * Main class to demonstrate the Online Food Delivery Order Processing System.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Online Food Delivery Order Processing System ===\n");

        // Scenario 1: Fast Food Order with Extra Packaging and Normal Delivery
        System.out.println("--- Scenario 1: Fast Food Order ---");
        Order order1 = OrderFactory.createOrder("fastfood");
        // Decorate with Extra Packaging
        order1 = new ExtraPackagingDecorator(order1);
        
        processAndDisplayOrder(order1, new NormalDeliveryStrategy());


        // Scenario 2: Fine Dining Order with Gift Wrap, Priority Handling and Surge Delivery
        System.out.println("\n--- Scenario 2: Fine Dining Order ---");
        Order order2 = OrderFactory.createOrder("finedining");
        // Decorate with Gift Wrap and Priority Handling
        order2 = new GiftWrapDecorator(order2);
        order2 = new PriorityHandlingDecorator(order2);

        processAndDisplayOrder(order2, new SurgeDeliveryStrategy());


        // Scenario 3: Cloud Kitchen Order with Express Delivery
        System.out.println("\n--- Scenario 3: Cloud Kitchen Order ---");
        Order order3 = OrderFactory.createOrder("cloudkitchen");
        // No decorators
        
        processAndDisplayOrder(order3, new ExpressDeliveryStrategy());
    }

    /**
     * Helper method to process the order and display costs.
     * Demonstrates Template Method (processing) and Strategy Pattern (delivery fee).
     */
    private static void processAndDisplayOrder(Order order, DeliveryFeeStrategy deliveryStrategy) {
        // Process Order (Template Method)
        // This will execute the workflow defined in OrderProcessTemplate
        order.processOrder();

        // Calculate Fees (Strategy Pattern)
        double orderCost = order.getCost();
        double deliveryFee = deliveryStrategy.calculateFee(order);
        double totalCost = orderCost + deliveryFee;

        // Display Details
        System.out.println("Order Details:");
        System.out.println("Description: " + order.getDescription());
        System.out.println(String.format("Subtotal: $%.2f", orderCost));
        System.out.println(String.format("Delivery Fee: $%.2f (%s)", deliveryFee, deliveryStrategy.getClass().getSimpleName()));
        System.out.println(String.format("Total Cost: $%.2f", totalCost));
    }
}
