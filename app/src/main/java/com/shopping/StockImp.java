package com.shopping;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StockImp implements Stock {

    private Map<StockType,StockItem> mStockTypes;

    public StockImp() {
        mStockTypes = new HashMap<>();
        mStockTypes.put(StockType.APPLE, new StockItem(StockType.APPLE, Costs.APPLE));
        mStockTypes.put(StockType.ORANGE, new StockItem(StockType.ORANGE, Costs.ORANGE));
    }
    @Override
    public int getStock() {
        return 1;
    }

    @Override
    public Set<StockType> getStockTypes() {
       return mStockTypes.keySet();
    }

    @Override
    public StockItem getItemCost(StockType stockType) {
        return mStockTypes.get(stockType);
    }


}
