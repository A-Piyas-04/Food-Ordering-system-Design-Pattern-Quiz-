package decorator;

/**
 * Decorator to add Gift Wrap to the order.
 */
public class GiftWrapDecorator extends OrderDecorator {

    public GiftWrapDecorator(Order decoratedOrder) {
        super(decoratedOrder);
    }

    @Override
    public String getDescription() {
        return decoratedOrder.getDescription() + " + Gift Wrap";
    }

    @Override
    public double getCost() {
        return decoratedOrder.getCost() + 5.0; // Gift wrap costs $5.0
    }
}
