package template;

import decorator.Order;

/**
 * Abstract class defining the Template Method for order processing.
 */
public abstract class OrderProcessTemplate implements Order {

    /**
     * The Template Method defining the order processing workflow.
     * This method is final to prevent subclasses from changing the workflow structure.
     */
    @Override
    public final void processOrder() {
        System.out.println("\n--- Processing Order: " + getDescription() + " ---");
        validateOrder();
        prepareFood();
        packageOrder();
        dispatchOrder();
        System.out.println("--- Order Processed Successfully ---");
    }

    /**
     * Common step: Validate order.
     */
    protected void validateOrder() {
        System.out.println("Step 1: Validating order details and payment...");
    }

    /**
     * Abstract step: Prepare food.
     * Must be implemented by concrete order types.
     */
    protected abstract void prepareFood();

    /**
     * Common step: Package order.
     */
    protected void packageOrder() {
        System.out.println("Step 3: Packaging food safely...");
    }

    /**
     * Common step: Dispatch order.
     */
    protected void dispatchOrder() {
        System.out.println("Step 4: Dispatching delivery partner...");
    }
}
