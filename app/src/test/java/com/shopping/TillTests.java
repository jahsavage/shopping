package com.shopping;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class TillTests {

    private Till mTill;

    @Before
    public void init() {
        StockImp stockImp = new StockImp();
        mTill = new TillImp(new StockItemsNoDiscount(stockImp));
    }

    @Test
    public void checkTill() {
        assertNotNull(mTill);
    }

    @Test
    public void checkNoPurchasedItems() {
        assertEquals(new Double(0), mTill.getCost(new StockType[0]));
    }


    @Test
    public void addupSingleApple() {
        StockType purchaseList[] = {StockType.APPLE};
        assertEquals(TestCosts.APPLE, mTill.getCost(purchaseList));
    }

    @Test
    public void addupSingleOrange() {
        StockType purchaseList[] = {StockType.ORANGE};
        assertEquals(TestCosts.ORANGE, mTill.getCost(purchaseList));
    }

    @Test
    public void addUpPurchasedItems() {
        StockType purchaseList[] = {StockType.APPLE, StockType.APPLE, StockType.ORANGE, StockType.APPLE};
        Double expectedCost = new Double(2.05d);
        assertEquals(expectedCost, mTill.getCost(purchaseList));
    }

}
