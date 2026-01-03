package decorator;

/**
 * Abstract Decorator class for Order.
 * Implements Order interface and holds a reference to a decorated Order.
 */
public abstract class OrderDecorator implements Order {
    protected Order decoratedOrder;

    public OrderDecorator(Order decoratedOrder) {
        this.decoratedOrder = decoratedOrder;
    }

    @Override
    public String getDescription() {
        return decoratedOrder.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedOrder.getCost();
    }

    @Override
    public void processOrder() {
        decoratedOrder.processOrder();
    }
}
