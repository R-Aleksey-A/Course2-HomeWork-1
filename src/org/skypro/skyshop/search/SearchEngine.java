package org.skypro.skyshop.search;

import org.skypro.skyshop.exception.BestResultNotFoundException;


public class SearchEngine {
    Searchable[] searchables;
    int Count = 0;

    public SearchEngine(int quantity) {
        searchables = new Searchable[quantity];
    }

    public Searchable[] search(String searchTerm) throws BestResultNotFoundException {
        Searchable[] results = new Searchable[5];
        int countResult = 0;
        for (int i = 0; i < Count; i++) {
            if (searchables[i].getSearchTerm().contains(searchTerm)) {
                results[countResult++] = searchables[i];
            }
            if (countResult == 5) break;
        }
        if (countResult == 0) {
            throw new BestResultNotFoundException("продукта нет");
        }
        return results;
    }

    public void add(Searchable searchable) {
        searchables[Count++] = searchable;

    }

}
