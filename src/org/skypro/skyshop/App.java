package org.skypro.skyshop;


import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.exception.BestResultNotFoundException;
import org.skypro.skyshop.exception.NameException;
import org.skypro.skyshop.exception.PriceException;
import org.skypro.skyshop.exception.DiscountedException;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        System.out.println("Sky Hop");
        ProductBasket basket = new ProductBasket();
        // basket.addProduct(new Product("Яблоко", 50));
        try {
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


            // Печать содержимого корзины до удаления
            basket.printBasketProduct();
            System.out.println("\n---Удаление продукта---");
            //Удаление существующего продукта из корзины
            List<Product> removedProducts = basket.removeProductByName("Яблоко");
            System.out.println("Удаленные продукты:");
            for (Product product : removedProducts) {
                System.out.println(product);
            }
            // Печать содержимого корзины после удаления
            basket.printBasketProduct();
            System.out.println("\n--- Удаление несуществующего продукта---");

            // Попытка удалить не существующий продукт
            removedProducts = basket.removeProductByName("Груша");
            if (removedProducts.isEmpty()) {
                System.out.println("Список удаленных продуктов пуст");
            }
            //Печать содержимого корзины после попытки удаления несуществующего продукта.
            basket.printBasketProduct();


            //Поиск по признаку
            SearchEngine searchEngine = new SearchEngine();
            System.out.println();
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

            Map<String,Searchable> searchResults = searchEngine.search("PRODUCT");
            System.out.println("Результаты поиска по 'PRODUCT':");
            for (Map.Entry<String, Searchable>entry: searchResults.entrySet()) {
                System.out.println(entry.getKey() + ": "+ entry.getValue());
            }
            System.out.println();


            searchResults = searchEngine.search("ARTICLE");
            System.out.println("Результат поиска по 'ARTICLE':");
            for (Map.Entry<String, Searchable> entry : searchResults.entrySet()){
                System.out.println(entry.getKey()+ ": "+ entry.getValue());
            }
            System.out.println();

            System.out.println("Поиск объекта по совпадению");
            searchResults = searchEngine.search("Хлеб");
            for (Map.Entry<String, Searchable>entry: searchResults.entrySet()) {
                System.out.println(entry.getKey()+": "+ entry.getValue());
            }
            System.out.println();

            // System.out.println(Arrays.toString(searchResults));


            System.out.println("=================================");


        } catch (NameException e) {
            System.out.println("Наименование продукта не может быть пустым!!!");
        } catch (PriceException e) {
            System.out.println("Цена продукта не может быть менее или равна 0 рублей!!!");
        } catch (DiscountedException e) {
            System.out.println("Скидка не может быть менее 0% и более 100% !!!");

        } catch (BestResultNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }


}