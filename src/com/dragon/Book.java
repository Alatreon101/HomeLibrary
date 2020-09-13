package com.dragon;

public class Book {

    private final String author;
    private final int year;
    private String name;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}

