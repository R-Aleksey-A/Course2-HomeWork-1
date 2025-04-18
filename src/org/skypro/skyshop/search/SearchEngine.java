package org.skypro.skyshop.search;

import org.skypro.skyshop.comparator.SearchableComparator;
import org.skypro.skyshop.exception.BestResultNotFoundException;
import org.skypro.skyshop.product.Product;

import java.util.*;


public class SearchEngine {
    private Set<Searchable> searchables;

    public SearchEngine() {
        searchables = new HashSet<>();
    }

    public Set<Searchable> search(String searchTerm) throws BestResultNotFoundException {
        Set<Searchable> results = new TreeSet<>(new SearchableComparator());

        for (Searchable searchable : searchables) {
            if (searchable.getSearchTerm().contains(searchTerm)) {
               results.add(searchable);
            }
        }
        return results;
    }

    public void add(Searchable searchable) {
        searchables.add(searchable);
    }
   }

