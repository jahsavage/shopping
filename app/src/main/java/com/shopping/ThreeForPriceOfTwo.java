package com.shopping;

public class ThreeForPriceOfTwo implements Discount {

    private double mUnitCost;

    public ThreeForPriceOfTwo(double unitCost) {
        mUnitCost = unitCost;
    }

    @Override
    public double apply(Integer numberOfItems) {
        if (numberOfItems < 3) {
            return mUnitCost * new Double(numberOfItems).doubleValue();
        } else {
            int numberOfThrees = numberOfItems/3;
            int remainder = numberOfItems % 3;
            int numberCharged = numberOfItems - remainder - numberOfThrees;
            return mUnitCost * new Double(numberCharged).doubleValue();
        }
    }
}
