package com.shopping;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class BuyOneGetOneFreeTests {

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
    public void checkNoDiscountForOnePurchase() {
        assertEquals(TestCosts.APPLE, new Double(mStockItemWithDiscounts.getTotalWithDiscount(StockType.APPLE, 1)));
    }

    @Test
    public void checkDiscountForTwoPurchases() {
        assertEquals(TestCosts.APPLE, new Double(mStockItemWithDiscounts.getTotalWithDiscount(StockType.APPLE, 2)));
    }

    @Test
    public void checkDiscountForThreePurchases() {
        Double expectedCost = 2.0 * TestCosts.APPLE.doubleValue();
        assertEquals(expectedCost, new Double(mStockItemWithDiscounts.getTotalWithDiscount(StockType.APPLE, 3)));
    }

    @Test
    public void checkDiscountForNinePurchases() {
        Double expectedCost = 5.0 * TestCosts.APPLE.doubleValue();
        assertEquals(expectedCost, new Double(mStockItemWithDiscounts.getTotalWithDiscount(StockType.APPLE, 9)));
    }
}
