import decorator.ExtraPackagingDecorator;
import decorator.GiftWrapDecorator;
import decorator.Order;
import decorator.PriorityHandlingDecorator;
import factory.OrderFactory;
import strategy.DeliveryFeeStrategy;
import strategy.ExpressDeliveryStrategy;
import strategy.NormalDeliveryStrategy;
import strategy.SurgeDeliveryStrategy;

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
     * @param order The order to process.
     * @param deliveryStrategy The delivery strategy to use.
     */
    private static void processAndDisplayOrder(Order order, DeliveryFeeStrategy deliveryStrategy) {
        // 1. Process the order (Template Method)
        order.processOrder();

        // 2. Calculate Delivery Fee (Strategy Pattern)
        double deliveryFee = deliveryStrategy.calculateFee(order);

        // 3. Display Totals
        System.out.println("Order Description: " + order.getDescription());
        System.out.println("Order Cost: $" + String.format("%.2f", order.getCost()));
        System.out.println("Delivery Fee: $" + String.format("%.2f", deliveryFee));
        System.out.println("Total Cost: $" + String.format("%.2f", (order.getCost() + deliveryFee)));
    }
}
