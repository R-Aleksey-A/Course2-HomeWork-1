package org.skypro.skyshop.product;

import org.skypro.skyshop.Article.Searchable;

public class FixPriceProduct extends Product implements Searchable {
    private static final double FIXED_PRICE = 100.0;

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public double getPrice() {
        return FIXED_PRICE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    public String toString() {
        return name + ": Фиксированная цена " + FIXED_PRICE;
    }

    @Override
    public String getSearchTerm() {
        return getName();
    }

    @Override
    public String getContentType() {
        return "PRODUCT";
    }

    @Override
    public String getName(){
        return super.getName();
    }

    @Override
    public String getStringRepresentation() {
        return getName()+" - " + getContentType();
    }
}
