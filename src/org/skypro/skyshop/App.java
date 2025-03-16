package org.skypro.skyshop;


import org.skypro.skyshop.Article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;

public class App {

    public static void main(String[] args) {
        System.out.println("Sky Hop");
        ProductBasket basket = new ProductBasket();
        // basket.addProduct(new Product("Яблоко", 50));
        SimpleProduct apple = new SimpleProduct("Яблоко", 100);
        SimpleProduct banana = new SimpleProduct("Банан", 40);
        SimpleProduct orange = new SimpleProduct("Апельсин", 100);
        SimpleProduct kiwi = new SimpleProduct("Киви", 80);
        SimpleProduct grape = new SimpleProduct("Виноград", 50);

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
        basket.сlearBasket();
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
        basket.сlearBasket();
        System.out.println();
        // Печать товара со скидкой 50%
        DiscountedProduct discountedApple = new DiscountedProduct("Яблоко со скидкой", 100, 50);
        // Товар с фиксированной ценой
        FixPriceProduct fixPriceOrange = new FixPriceProduct("Апельсин с фиксированной ценой");
        basket.addProduct(discountedApple);
        basket.addProduct(fixPriceOrange);
        basket.printBasketProduct();

        //Поиск по признаку
        SearchEngine searchEngine = new SearchEngine(10);

        searchEngine.add(apple);
        searchEngine.add(orange);
        searchEngine.add(banana);
        searchEngine.add(grape);
        searchEngine.add(kiwi);


        Article article1 = new Article("Название статьи 1", "Текст статьи 1");
        Article article2 = new Article("Название статьи 2", "Текст статьи 2");
        Article article3 = new Article("Название статьи 3", "Текст статьи 3");
        Article article4 = new Article("Название статьи 4", "Текст статьи 4");

        searchEngine.add(article1);
        searchEngine.add(article2);
        searchEngine.add(article3);
        searchEngine.add(article4);

        Searchable[] searchResults = searchEngine.search("PRODUCT");
        for (Searchable result : searchResults) {
            if (result == null) continue;
            System.out.println(result);
        }
        System.out.println();

        searchResults = searchEngine.search("ARTICLE");
        for (Searchable result : searchResults) {
            if (result == null) continue;
            System.out.println(result);
        }
        System.out.println();

        searchResults = searchEngine.search("Банан");
        for (Searchable result : searchResults) {
            if (result == null) continue;
            System.out.println(result);
        }
        System.out.println();


    }


}