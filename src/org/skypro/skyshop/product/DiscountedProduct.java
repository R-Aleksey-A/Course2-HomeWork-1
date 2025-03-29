package org.skypro.skyshop.product;
import org.skypro.skyshop.exception.DiscountedException;
import org.skypro.skyshop.exception.PriceException;



public class DiscountedProduct extends Product {
    public   double basePrice;
    public   int discountPercent;

    public DiscountedProduct (String name, double basePrice, int discountPercent) {
        super(name);
            if (basePrice<0){
                throw  new PriceException();
        }
            if (discountPercent<0||discountPercent>100){
                throw new DiscountedException();
            }

        this.basePrice=basePrice;
        this.discountPercent = discountPercent;
    }


    public double getPrice() {
        return basePrice*(1-discountPercent/100.0);
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
    @Override
    public String toString() {
        return name +" : "+ getPrice()+ "("+ discountPercent+ " %)";
    }
}
