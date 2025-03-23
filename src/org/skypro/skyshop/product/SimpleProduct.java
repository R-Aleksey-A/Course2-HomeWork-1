package org.skypro.skyshop.product;

import org.skypro.skyshop.exception.PriceException;


public class SimpleProduct extends Product {
    final double price;

    public SimpleProduct(String name, double price) {
        super(name);
        if (price <= 0) {
            throw new PriceException();
        }

        this.price = price;
    }

    public SimpleProduct() {
        this("f", 1);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isSpecial() {
        return false;

    }

    @Override
    public String toString() {
        return name + " : " + price + " рублей";
    }
}
