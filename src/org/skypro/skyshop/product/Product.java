package org.skypro.skyshop.product;

import org.skypro.skyshop.exception.NameException;
import org.skypro.skyshop.search.Searchable;

public abstract class Product implements Searchable {
    final String name;

    public Product(String name)  {
    if (name == null || name.equals("")||name.isBlank()){
        throw  new NameException();
    }

        this.name = name;
    }

    public Product() {
        this("f");
    }

    public String getName() {
        return name;
    }

    @Override
    public String getSearchTerm() {
        return getName() + " : " + getSearchContent();
    }

    @Override
    public String getSearchContent() {
        return "PRODUCT";
    }



    public abstract double getPriceOfProduct();

    public abstract boolean isSpecial();

    @Override
    public String toString() {
        return name + " : " + getPriceOfProduct();
    }
}
