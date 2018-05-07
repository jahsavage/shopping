package com.shopping;

public class StockItem {
    StockType mStockType;
    Double mStockCost;

    public StockItem(StockType stockType, Double stockCost) {
        mStockType = stockType;
        mStockCost = stockCost;
    }
    public StockType getStockType() {
        return mStockType;
    }

    public void setStockType(StockType stockType) {
        mStockType = stockType;
    }

    public Double getStockCost() {
        return mStockCost;
    }

    public void setStockCost(Double stockCost) {
        mStockCost = stockCost;
    }
}
