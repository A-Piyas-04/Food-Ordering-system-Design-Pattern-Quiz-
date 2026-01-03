package decorator;

/**
 * Interface for the Order.
 * Serves as the Component in the Decorator Pattern.
 */
public interface Order {
    /**
     * Gets the description of the order.
     * @return Order description.
     */
    String getDescription();

    /**
     * Gets the cost of the order (excluding delivery).
     * @return Order cost.
     */
    double getCost();

    /**
     * Processes the order.
     * Defined here to allow decorated orders to be processed.
     */
    void processOrder();
}
