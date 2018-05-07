package com.shopping;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StockImp implements Stock {

    private Map<StockType,StockItem> mStockTypes;

    public StockImp() {
        mStockTypes = new HashMap<>();
        StockItem appleStock = new StockItem(StockType.APPLE, Costs.APPLE);
        appleStock.setDiscount(new BuyOneGetOneFree(appleStock.getStockCost()));
        StockItem orangeStock = new StockItem(StockType.ORANGE, Costs.ORANGE);
        orangeStock.setDiscount(new ThreeForPriceOfTwo(orangeStock.getStockCost()));
        mStockTypes.put(StockType.APPLE, appleStock);
        mStockTypes.put(StockType.ORANGE, orangeStock);
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
    public StockItem getStockItem(StockType stockType) {
        return mStockTypes.get(stockType);
    }


}
