package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.*;

public class ProductBasket {
    private Map<String, List<Product>> products;

    public ProductBasket() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        String name = product.getName();
        if (!products.containsKey(name)) {
            products.put(name, new ArrayList<>(Arrays.asList(product)));
        } else {
            products.get(name).add(product);
        }
    }

    public void printBasketProduct() {
        System.out.println("Корзина:");
        if (products.isEmpty()) {
            System.out.println("В корзине пусто");
            return;
        }
        double totalPrice = 0.0;
        int specialCount = 0;

        for (Map.Entry<String, List<Product>> entry : products.entrySet()) {
            String key = entry.getKey();
            List<Product> value = entry.getValue();

            System.out.println(key + ": ");
            for (Product p : value) {
                System.out.println(p.toString());

                totalPrice += p.getPrice();
                if (p.isSpecial()) {
                    specialCount++;
                }
            }
        }
        System.out.println("Итого: " + totalPrice);
        System.out.println("Специальных товаров:" + specialCount);
    }

    public boolean containsProduct(String name) {
        System.out.println("Проверка продукта в корзине");
        if (products.containsKey(name)) {
            System.out.println("Данный продукт в корзине");
            return true;
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
        if (products.containsKey(name)) {
            removedProducts.addAll(products.get(name));
            products.remove(name);
        }
        return removedProducts;
    }

    public ArrayList<Product> getProducts() {
        ArrayList<Product> allProducts = new ArrayList<>();
        for (List<Product> list : products.values()) {
            allProducts.addAll(list);
        }
        return allProducts;
    }
}