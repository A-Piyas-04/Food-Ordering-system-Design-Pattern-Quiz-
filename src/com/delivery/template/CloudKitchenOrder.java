package com.delivery.template;

/**
 * Concrete implementation for Cloud Kitchen Order.
 */
public class CloudKitchenOrder extends OrderProcessTemplate {

    @Override
    public String getDescription() {
        return "Cloud Kitchen Order (Mixed Bowl)";
    }

    @Override
    public double getCost() {
        return 12.00;
    }

    @Override
    protected void prepareFood() {
        System.out.println("Step 2: Preparing mixed bowl in shared kitchen (Cloud Kitchen)...");
    }
}
