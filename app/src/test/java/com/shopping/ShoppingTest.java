package com.shopping;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static junit.framework.Assert.assertEquals;

public class ShoppingTest {

    private Stock mStock;
    private Double mAppleItemCost;
    private Double mOrangeItemCost;

    @Before
    public void init() {
        mStock = new StockImp();
        mAppleItemCost = .6d;
        mOrangeItemCost = .25d;
    }

    @Test
    public void checkStock() {
        Assert.assertNotNull(mStock);
        Assert.assertTrue(mStock.getStock() > 0);
    }

    @Test
    public void checkStockType() {

        Assert.assertNotNull(mStock.getStockTypes());
        Assert.assertEquals(2, mStock.getStockTypes().size());

        Iterator<StockType> stockTypesIterator = mStock.getStockTypes().iterator();
        StockType firstItem = stockTypesIterator.next();
        StockType secondItem = stockTypesIterator.next();

        Assert.assertNotEquals(firstItem, secondItem);
        Assert.assertTrue(StockType.APPLE == firstItem || StockType.APPLE == secondItem);
        Assert.assertTrue(StockType.ORANGE == firstItem || StockType.ORANGE == secondItem);
    }

    @Test
    public void checkStockCosts() {
        assertEquals(mAppleItemCost, mStock.getItemCost(StockType.APPLE).getStockCost());
        assertEquals(mOrangeItemCost, mStock.getItemCost(StockType.ORANGE).getStockCost());
    }
}