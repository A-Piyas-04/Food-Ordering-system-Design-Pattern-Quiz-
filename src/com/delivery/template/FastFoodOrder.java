package com.delivery.template;

/**
 * Concrete implementation for Fast Food Order.
 */
public class FastFoodOrder extends OrderProcessTemplate {

    @Override
    public String getDescription() {
        return "Fast Food Order (Burger & Fries)";
    }

    @Override
    public double getCost() {
        return 15.00;
    }

    @Override
    protected void prepareFood() {
        System.out.println("Step 2: Assembling burger and frying fries (Fast Food)...");
    }
}
