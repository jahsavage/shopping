package com.shopping;

import java.util.Set;

public interface Stock {
    int getStock();
    Set<StockType> getStockTypes();
    StockItem getStockItem(StockType stockType);
}
