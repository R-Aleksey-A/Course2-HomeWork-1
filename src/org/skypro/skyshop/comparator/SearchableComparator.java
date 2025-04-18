package org.skypro.skyshop.comparator;

import org.skypro.skyshop.search.Searchable;

import java.util.Comparator;

public class SearchableComparator implements Comparator<Searchable> {
    @Override
    public int compare(Searchable s1, Searchable s2) {
        int lengthComparison = Integer.compare(s1.getSearchTerm().length(), s2.getSearchTerm().length());
        if (lengthComparison != 0)
            return lengthComparison;
        else
            return s1.getSearchTerm().compareTo(s2.getSearchTerm());
    }
}
