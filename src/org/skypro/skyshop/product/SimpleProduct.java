package org.skypro.skyshop.product;

import java.text.ParseException;

public class SimpleProduct extends Product{
    private double price;

    public SimpleProduct (String name, double price){
        super(name);
        if(priceOfProduct<=0){
            throw new ParseException();
        }
        this.priceOfProduct=priceOfProduct;
}
public SimpleProduct(){
        this("f",1);
}

    @Override
    public double getPrice() {
        return priceOfProduct;
    }

    @Override
    public boolean isSpecial() {
        return false;

    }
    @Override
    public String toString(){
        return name+" : "+ priceOfProduct+" рублей";
    }
}
