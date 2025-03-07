package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private int discountPercent;

    public DiscountedProduct(String name, double basePrice, int discountPercent) {
        super(name, basePrice*(1-((double)discountPercent/100)));
        this.discountPercent = discountPercent;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return getName() +" : "+ getPrice()+ "("+ discountPercent+ " %)";
    }
}
