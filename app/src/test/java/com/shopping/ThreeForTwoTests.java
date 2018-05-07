package com.shopping;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class ThreeForTwoTests {

    private StockItemWithDiscounts mStockItemWithDiscounts;

    @Before
    public void init() {
        mStockItemWithDiscounts = new StockItemsWithDiscountsImp(new StockImp());
    }

    @Test
    public void checkStockDiscounts() {
        assertNotNull(mStockItemWithDiscounts);
    }

    @Test
    public void checkNoDiscountForNoPurchases() {
        assertEquals(new Double(0), new Double(mStockItemWithDiscounts.getTotalWithDiscount(StockType.ORANGE, 0)));
    }

    @Test
    public void checkNoDiscountForOnePurchase() {
        assertEquals(TestCosts.ORANGE, new Double(mStockItemWithDiscounts.getTotalWithDiscount(StockType.ORANGE, 1)));
    }

    @Test
    public void checkDiscountForTwoPurchases() {
        Double expectedCost = 2.0 * TestCosts.ORANGE.doubleValue();
        assertEquals(expectedCost, new Double(mStockItemWithDiscounts.getTotalWithDiscount(StockType.ORANGE, 2)));
    }

    @Test
    public void checkDiscountForThreePurchases() {
        Double expectedCost = 2.0 * TestCosts.ORANGE.doubleValue();
        assertEquals(expectedCost, new Double(mStockItemWithDiscounts.getTotalWithDiscount(StockType.ORANGE, 3)));
    }

    @Test
    public void checkDiscountForNinePurchases() {
        Double expectedCost = 6.0 * TestCosts.ORANGE.doubleValue();
        assertEquals(expectedCost, new Double(mStockItemWithDiscounts.getTotalWithDiscount(StockType.ORANGE, 9)));
    }
}
