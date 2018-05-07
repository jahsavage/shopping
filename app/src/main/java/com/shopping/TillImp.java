package com.shopping;

import android.support.annotation.NonNull;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TillImp implements Till {

   // private Stock mStock;
    private StockItemWithDiscounts mStockItemWithDiscounts;

    public TillImp(@NonNull StockItemWithDiscounts stockItemWithDiscounts) {
        mStockItemWithDiscounts = stockItemWithDiscounts;
    }

    @Override
    public Double getCost(@NonNull StockType purchases[]) {

        double total = 0d;
        Map<StockType,Integer> sorted = sortPurchases(purchases);
        Iterator<Map.Entry<StockType, Integer>> entrySetIterator = sorted.entrySet().iterator();

        while (entrySetIterator.hasNext()) {
            Map.Entry<StockType, Integer> entry = entrySetIterator.next();
            total = total + mStockItemWithDiscounts.getTotalWithDiscount(entry.getKey(), entry.getValue());
        }

        return new Double(total);
    }

    private Map<StockType,Integer> sortPurchases(@NonNull StockType purchases[]) {
        Map<StockType,Integer> mSorted = new HashMap();

        for (StockType type : purchases) {
            int newValue = 1;
            if (mSorted.containsKey(type)) {
                newValue = mSorted.get(type) + 1;
            }

            mSorted.put(type, newValue);
        }

        return mSorted;
    }


}
