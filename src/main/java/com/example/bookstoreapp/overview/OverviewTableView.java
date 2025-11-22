package com.example.bookstoreapp.overview;

import com.example.bookstoreapp.Model.Book;
import com.example.bookstoreapp.Model.BooksStorage;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class OverviewTableView extends TableView {

public OverviewTableView(ObservableList<Book> obslist){
    super();
    init();
}
        private void init(){
            TableColumn<Book,String> title = new TableColumn<>();
            title.setCellValueFactory(new PropertyValueFactory<>(""));

            TableColumn<Book,String> author = new TableColumn<>();
            author.setCellValueFactory(new PropertyValueFactory<>(""));

            TableColumn<Book,String> price = new TableColumn<>();
            price.setCellValueFactory(new PropertyValueFactory<>(""));



        }
}
