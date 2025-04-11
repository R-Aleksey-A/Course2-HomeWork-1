package org.skypro.skyshop.search;

import org.skypro.skyshop.exception.BestResultNotFoundException;

import java.util.*;


public class SearchEngine {
    private List<Searchable> searchables;

    public SearchEngine() {
        searchables = new ArrayList<>();
    }

    public Map<String, Searchable> search(String searchTerm) throws BestResultNotFoundException {
        Map<String, Searchable> results = new HashMap<>();

        for (Searchable searchable : searchables) {
            if (searchable.getSearchTerm().contains(searchTerm)) {
               String key = searchable.getSearchTerm() + " - " + searchable.getSearchContent();
               results.put(key,searchable);
            }
        }
        Map<String, Searchable> sortedResults = new TreeMap<>(results);
        return sortedResults;
    }

    public void add(Searchable searchable) {
        searchables.add(searchable);
    }
}

