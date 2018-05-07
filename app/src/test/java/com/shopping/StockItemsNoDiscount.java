package com.shopping;

import android.support.annotation.NonNull;

public class StockItemsNoDiscount implements StockItemWithDiscounts {

    private Stock mStock;

    public StockItemsNoDiscount(@NonNull Stock stock) {
        mStock = stock;
    }

    @Override
    public double getTotalWithDiscount(StockType stockType, Integer numberOfItems) {
        StockItem stockItem = mStock.getStockItem(stockType);
        return  stockItem.getStockCost() * new Double(numberOfItems).doubleValue();
    }
}
