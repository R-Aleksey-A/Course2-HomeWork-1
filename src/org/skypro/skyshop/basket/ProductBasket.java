package org.skypro.skyshop.basket;

import org.skypro.skyshop.Product;

import java.util.Arrays;

public class ProductBasket {
    private final Product[] basket = new Product[4];
    private int counter = 0;

    public void addProduct(Product product) {
        if (counter <= basket.length - 1) {
            basket[counter++] = product;
        } else {
            System.out.println("Не возможно добавить продукт.");
        }

    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (int i = 0; i < counter; i++) {
            totalPrice += basket[i].getPrice();

        }
        return totalPrice;
    }

    public void printBasketProduct() {
        System.out.println("Корзина ");
        if (counter == 0) {
            System.out.println("В корзине пусто");
            return;
        }
        double totalPrice = 0.0;
        for (int i = 0; i < counter; i++) {
            System.out.println(basket[i]);
            totalPrice += basket[i].getPrice();
        }
        System.out.println("Итого: " + totalPrice);

    }

    public boolean contanceProduct(String name) {
        System.out.println("Проверка продукта в корзине");
        for (int i = 0; i < counter; i++) {
            if (basket[i].getName().equals(name)) {
                System.out.println("Данный продукт в корзине есть");
                return true;
            }
        }
        System.out.println("Данного продукта в корзине нет");
        return false;

    }
    public void ClearBasket(){
        System.out.println("Очищение корзины");
        Arrays.fill(basket, null);
        counter=0;
            System.out.println("Корзина очищена");

        }
    }