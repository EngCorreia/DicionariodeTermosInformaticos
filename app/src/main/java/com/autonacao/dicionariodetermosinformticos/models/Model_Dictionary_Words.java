package com.autonacao.dicionariodetermosinformticos.models;

public class Model_Dictionary_Words {

    private String title_words;
    private String description_words;

    public Model_Dictionary_Words() {
    }

    public Model_Dictionary_Words(String title_words, String description_words) {
        this.title_words = title_words;
        this.description_words = description_words;
    }

    public String getTitle_words() {
        return title_words;
    }

    public void setTitle_words(String title_words) {
        this.title_words = title_words;
    }

    public String getDescription_words() {
        return description_words;
    }

    public void setDescription_words(String description_words) {
        this.description_words = description_words;
    }
}
