package com.delivery.template;

/**
 * Concrete implementation for Fine Dining Order.
 */
public class FineDiningOrder extends OrderProcessTemplate {

    @Override
    public String getDescription() {
        return "Fine Dining Order (Steak & Wine)";
    }

    @Override
    public double getCost() {
        return 50.00;
    }

    @Override
    protected void prepareFood() {
        System.out.println("Step 2: Cooking steak to perfection and pouring wine (Fine Dining)...");
    }
}
