package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;

import java.io.PrintStream;

public class App {

    public static void main(String[] args) {
        System.out.println("Sky Hop");
        ProductBasket basket = new ProductBasket();
        // basket.addProduct(new Product("Яблоко", 50));
        Product apple = new Product("Яблоко", 50);
        Product banana = new Product("Банан", 40);
        Product orange = new Product("Апельсин", 100);
        Product kiwi = new Product("Киви", 80);
        Product grape = new Product("Виноград", 50);

        //Добавление продукта в корзину
        basket.addProduct(apple);
        basket.addProduct(banana);
        basket.addProduct(orange);
        basket.addProduct(kiwi);
        System.out.println();


        // Печать содержимого корзины
        basket.printBasketProduct();
        System.out.println();

        //Добавление продукта в заполненную корзину, в которой нет места
        basket.addProduct(grape);
        System.out.println();

        //Проверка наличия продукта в корзине
        basket.contanceProduct("Яблоко");
        System.out.println();

        //Проверка отсутствия продукта в корзине
        basket.contanceProduct("Виноград");
        System.out.println();

        // Очищение корзины
        basket.ClearBasket();
        System.out.println();

        //Печать очищенной корзины
        basket.printBasketProduct();
        System.out.println();

        // Печать стоимости пустой корзины
        System.out.println(basket.getTotalPrice());
        System.out.println();
// Печать содержимого корзины и стоимости с несколькими товарами.
        basket.addProduct(apple);
        basket.addProduct(orange);
        basket.printBasketProduct();




    }
}