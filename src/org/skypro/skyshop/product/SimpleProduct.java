package org.skypro.skyshop.product;

public class SimpleProduct extends Product{
    public SimpleProduct (String name, double price){
        super(name, price);
}

    @Override
    public boolean isSpecial() {
        return false;
    }

    @Override
    public String toString(){

        return getName()+ " : "+ getPrice();
    }
}
