package com.shopping;

import android.support.annotation.NonNull;

public class TillImp implements Till {

    private Stock mStock;
    public TillImp(@NonNull Stock stock) {
        mStock = stock;
    }

    @Override
    public Double getCost(@NonNull StockType purchases[]) {

        double total = 0d;

        for (StockType type : purchases) {
            total = total + mStock.getItemCost(type).getStockCost().doubleValue();
        }

        return new Double(total);
    }

}
