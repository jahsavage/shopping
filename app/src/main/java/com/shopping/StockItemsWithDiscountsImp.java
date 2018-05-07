package com.shopping;

import android.support.annotation.NonNull;

public class StockItemsWithDiscountsImp implements StockItemWithDiscounts {

    private Stock mStock;

    public StockItemsWithDiscountsImp(@NonNull Stock stock) {
        mStock = stock;
    }

    @Override
    public double getTotalWithDiscount(StockType stockType, Integer numberOfItems) {
        StockItem stockItem = mStock.getStockItem(stockType);

        if (stockItem.hasDiscount()) {
            return stockItem.getDiscount().apply(numberOfItems);
        } else {
            return  stockItem.getStockCost() * new Double(numberOfItems).doubleValue();
        }
    }

}
