package com.example.bookstoreapp.overview;

import com.example.bookstoreapp.BookStoreApp;
import com.example.bookstoreapp.BookStoreEvent;
import com.example.bookstoreapp.Model.Book;
import com.example.bookstoreapp.Model.BooksStorage;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.VBox;

import java.util.Optional;

public class OverviewLeftPane extends VBox {

    //Propertisi
    private Button buttonCreateBook = null;
    private Button buttonDeleteBook = null;

    private OverviewTableView overviewTableView;

    //konstruktori
    public OverviewLeftPane(OverviewTableView overviewTableView) {
        this.overviewTableView = overviewTableView;
        initS();
        getChildren().addAll(getButtonCreateBook(),getButtonDeleteBook());
    }

    //privatne metode
    private void initS(){
        this.setSpacing(10);
        this.setPadding(new Insets(5));

    }

    //Public metode


    public Button getButtonCreateBook() {
        if (buttonCreateBook == null){
            buttonCreateBook = new Button("Create Book");
            buttonCreateBook.setOnAction((e) -> {
                fireEvent(new BookStoreEvent(BookStoreEvent.createScene));
            });
        }



        //više funkcija
        return buttonCreateBook;
    }

    public Button getButtonDeleteBook() {

        if (buttonDeleteBook == null){
            buttonDeleteBook = new Button("Delete Book");
            buttonDeleteBook.setOnAction((e)->{
                Book selectedBook = (Book) overviewTableView.getSelectionModel().getSelectedItem();

                if(selectedBook ==null){
                    Alert alert =  new Alert(Alert.AlertType.WARNING);
                    alert.setContentText("Book is not Selected");
                    alert.showAndWait();
                    return;
                }

                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Delete Book");
                alert.setContentText("Are you sure you want delete book");
                alert.setHeaderText(selectedBook.getTitle());


                Optional<ButtonType> buttonType  = alert.showAndWait();

                if (buttonType.get() == ButtonType.OK){
                    BooksStorage.INSTANCE.deleteBook(selectedBook);
                    overviewTableView.setItems(BooksStorage.INSTANCE.observableListBooks());
                }
            });
        }
        return buttonDeleteBook;
    }
}
