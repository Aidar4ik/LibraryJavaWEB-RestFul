package com.example.libraryjavaweb.models;

public class BookModel {

    private int id;
    private String nameOfBook;
    private String descriptionOfBook;

    public BookModel(){}

    public BookModel(int id, String nameOfBook, String descriptionOfBook) {
        this.id = id;
        this.nameOfBook = nameOfBook;
        this.descriptionOfBook = descriptionOfBook;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getDescriptionOfBook() {
        return descriptionOfBook;
    }

    public void setDescriptionOfBook(String descriptionOfBook) {
        this.descriptionOfBook = descriptionOfBook;
    }
}
