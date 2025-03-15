package org.skypro.skyshop.product;

import org.skypro.skyshop.Article.Searchable;

public class SimpleProduct extends Product implements Searchable {
    private double price;

    public SimpleProduct(String name, double price) {
        super(name);
        this.price = price;
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
    public String getContentType() {
        return "PRODUCT";
    }
    public String getSearchTerm(){
        return getName();
    }
    public String getName(){
        return super.getName();
    }

}
