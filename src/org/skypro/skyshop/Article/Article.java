package org.skypro.skyshop.Article;

public class Article implements Searchable {
    private String title;
    private String text;

    public Article(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String toString() {
        return title + "\n " + text;
    }

    @Override
    public String getName() {
        return title;
    }


    @Override
    public String getSearchTerm() {
        return title+" "+ text;
    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }

    @Override
    public String getStringRepresentation() {
        return getName() + " — " + getContentType();

    }
}
