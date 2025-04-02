package org.skypro.skyshop.search;

import org.skypro.skyshop.exception.BestResultNotFoundException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class SearchEngine {
    private List<Searchable> searchables;

    public SearchEngine() {
        searchables = new ArrayList<>();
    }

    public List<Searchable> search(String searchTerm) throws BestResultNotFoundException {
        List<Searchable> results = new ArrayList<>();
        for (Searchable searchable : searchables) {
            if (searchable.getSearchTerm().contains(searchTerm)) {
                results.add(searchable);
            }
        }
        if (results.isEmpty()) {
            throw new BestResultNotFoundException("продукта нет");
        }
        return results;
    }

    public void add(Searchable searchable) {
        searchables.add(searchable);
    }
}

