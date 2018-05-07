package com.shopping;

public interface StockItemWithDiscounts {
    double getTotalWithDiscount(StockType stockType, Integer numberOfItems);
}
