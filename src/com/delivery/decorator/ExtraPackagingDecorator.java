package com.delivery.decorator;

/**
 * Decorator to add Extra Packaging to the order.
 */
public class ExtraPackagingDecorator extends OrderDecorator {

    public ExtraPackagingDecorator(Order decoratedOrder) {
        super(decoratedOrder);
    }

    @Override
    public String getDescription() {
        return decoratedOrder.getDescription() + " + Extra Packaging";
    }

    @Override
    public double getCost() {
        return decoratedOrder.getCost() + 2.0; // Extra packaging costs $2.0
    }
}
