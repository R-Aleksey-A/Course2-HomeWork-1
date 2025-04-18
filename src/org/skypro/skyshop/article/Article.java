package org.skypro.skyshop.article;

import org.skypro.skyshop.search.Searchable;

import java.util.Objects;

public class Article implements Searchable {
    private final String article;
    private final String text;

    public Article(String article, String text) {
        this.article = article;
        this.text = text;
    }

    public String getArticle() {
        return article;
    }

    public String getText() {
        return text;
    }

    public String toString() {
        return article + "\n " + text;
    }

    @Override
    public String getSearchTerm() {
        return article + "\nТип - ARTICLE\n";
    }

    @Override
    public String getSearchContent() {
        return "ARTICLE";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article)) return false;

        Article other = (Article) o;
        return Objects.equals(this.article, other.article);
    }

    @Override
    public int hashCode() {
        return Objects.hash(article);

    }

}
