package com.example.bookstoreapp.Model;

import javafx.beans.value.ObservableListValue;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public enum BooksStorage {

    INSTANCE;


    private ArrayList<Book> books = null;


    private ArrayList<Book> getBooks() {

        if (books == null) {
            books = new ArrayList<Book>();
            books.add(new Book("Prokleta Avlija", "Ivo Andric", 25.50));
            books.add(new Book("Ana Karenjina", "Tolstoj", 40));
            books.add(new Book("Ponornica", "Skender Kulenovic", 100));
            books.add(new Book("Crveno i crno", "Stendal", 35));


        }
        return books;
    }

    public ObservableList<Book> observableListBooks() {
        ObservableList<Book> obslist = FXCollections.observableList(getBooks());
        return obslist;
    }

    public void createBook(Book book){
        getBooks().add(book);
    }

    public void deleteBook(Book book){
        getBooks().remove(book);
    }

}


