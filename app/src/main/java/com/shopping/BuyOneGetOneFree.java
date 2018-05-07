package com.shopping;

public class BuyOneGetOneFree implements Discount {

    private double mUnitCost;

    public BuyOneGetOneFree(double unitCost) {
        mUnitCost = unitCost;
    }
    @Override
    public double apply(Integer numberOfItems) {
        if (numberOfItems < 2) {
            return mUnitCost * new Double(numberOfItems).doubleValue();
        } else {
            int numberOfPairs = numberOfItems/2;
            int remainder = numberOfItems % 2;
            return mUnitCost * new Double(numberOfPairs).doubleValue() + mUnitCost * new Double(remainder);
        }
    }
}
