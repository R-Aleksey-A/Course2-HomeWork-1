package org.skypro.skyshop.product;

import org.skypro.skyshop.exception.BestResultNotFoundException;
import org.skypro.skyshop.exception.DiscountedException;


public class DiscountedProduct extends Product {
    private  double basePrice;
    private  int discountPercent;

    public DiscountedProduct (String name, double basePrice, int discountPercent) {
        super(name);
        if (basePrice<0){
            throw new PriceException();
        }
        if (percentageDiscount<0 || percentageDiscount>100){
            throw new DiscountedException();
        }

        this.basePrice=basePrice;
        this.percentageDiscount = percentageDiscount;
    }

    public int getPriceOfProduct() {
        return basePrice-((basePrice*percentageDiscount)/100.0);
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return name +" : "+ basePrice()+ "рублей : скидка "+ percentageDiscount+ " %)";
    }
}
