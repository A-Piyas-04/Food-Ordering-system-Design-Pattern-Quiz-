package decorator;

/**
 * Decorator to add Priority Handling to the order.
 */
public class PriorityHandlingDecorator extends OrderDecorator {

    public PriorityHandlingDecorator(Order decoratedOrder) {
        super(decoratedOrder);
    }

    @Override
    public String getDescription() {
        return decoratedOrder.getDescription() + " + Priority Handling";
    }

    @Override
    public double getCost() {
        return decoratedOrder.getCost() + 10.0; // Priority handling costs $10.0
    }
}
