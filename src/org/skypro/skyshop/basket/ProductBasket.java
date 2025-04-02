package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.*;

public class ProductBasket {
    private ArrayList<Product> products;

    public ProductBasket() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void printBasketProduct() {
        System.out.println("Корзина:");
        if (products.isEmpty()) {
            System.out.println("В корзине пусто");
            return;
        }
        double totalPrice = 0.0;
        int specialCount = 0;

        for (Product p : products) {
            System.out.println(p.toString());
            totalPrice += p.getPrice();
            if (p.isSpecial()) {
                specialCount++;
            }
        }
        System.out.println("Итого: " + totalPrice);
        System.out.println("Специальных товаров:" + specialCount);
    }

    public boolean containsProduct(String name) {
        System.out.println("Проверка продукта в корзине");
        for (Product p : products) {
            if (p.getName().equals(name)) {
                System.out.println("Данный продукт в корзине");
                return true;
            }
        }
        System.out.println("Данного продукта в корзине нет");
        return false;
    }

    public void clearBasket() {
        System.out.println("Очищение корзины");
        products.clear();
        System.out.println("Корзина очищена");
    }

    public List<Product> removeProductByName(String name) {
        List<Product> removedProducts = new ArrayList<>();
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equals(name)) {
                removedProducts.add(product);
                iterator.remove();
            }
        }
        return removedProducts;
    }
    public ArrayList<Product> getProducts(){
        return products;
    }
}
