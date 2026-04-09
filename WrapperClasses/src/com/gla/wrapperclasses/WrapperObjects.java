package com.gla.wrapperclasses;
 import java.util.ArrayList;
 import java.util.Collections;
public class WrapperObjects {
    public static void main(String[] args)
    {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> priceList = new ArrayList<>();
        for (int i=0;i<prices.length;i++)
        {
            priceList.add(prices[i]);
        }
        double highest=Collections.max(priceList);
        double sum =0;
        for (int i=0;i<priceList.size();i++)
        {
            sum += priceList.get(i);
        }
        double average = sum / priceList.size();
        System.out.println("Prices: " + priceList);
        System.out.println("Highest Price: " + highest);
        System.out.println("Average Price: " + average);
    }
}
