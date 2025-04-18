package org.skypro.skyshop.product;

import org.skypro.skyshop.exception.NameException;
import org.skypro.skyshop.search.Searchable;

import java.util.Objects;


public abstract class Product implements Searchable {
    final String name;

    public Product(String name) {
        if (name == null || name.isBlank()) {
            throw new NameException();
        }

        this.name = name;
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


    public abstract double getPrice();

    public abstract boolean isSpecial();

    @Override
    public String toString() {
        return name + " : " + getPrice();
    }
    @Override
    public boolean equals(Object o){
        if (this==o) return  true;
        if(!(o instanceof Product)) return false;

        Product other=(Product) o;
        return Objects.equals(this.name, other.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
