package com.shopping;

public class StockItem {
    StockType mStockType;
    Double mStockCost;
    Discount mDiscount;

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

    public Discount getDiscount() {
        return mDiscount;
    }

    public void setDiscount(Discount discount) {
        mDiscount = discount;
    }

    public boolean hasDiscount() {
        return mDiscount != null;

    }
}
