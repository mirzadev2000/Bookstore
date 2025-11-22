package com.example.bookstoreapp.create;

import com.example.bookstoreapp.Model.Book;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Text;

public class CreateInputPane extends GridPane {

    private Text textTitle;
    private TextField title;
    private Text textAuthor;
    private TextField author;
    private Text textPrice;
    private TextField price;



    private void init(){
        getChildren().addAll(getTextTitle(),getTextAuthor(),getTextPrice(),getPrice(),getTextAuthor(),getTitle());

        ColumnConstraints columnConstraints1 = new ColumnConstraints(300);
        ColumnConstraints columnConstraints2 = new ColumnConstraints(300);

        columnConstraints2.setHgrow(Priority.ALWAYS);

        getColumnConstraints().addAll(columnConstraints1,columnConstraints2);

        int row = 0;
        int column = 0;

        setRowIndex(getTextTitle(),row++);
        setRowIndex(getTitle(),row++);
        setColumnIndex(getTextTitle(),column++);
        setColumnIndex(getTitle(),column++);

        column = 0;
        setRowIndex(getTextAuthor(),row);
        setRowIndex(getAuthor(),row);
        setColumnIndex(getTextAuthor(),column++);
        setColumnIndex(getAuthor(),column++);

        column = 0;
        setRowIndex(getTextPrice(),row);
        setRowIndex(getPrice(),row++);
        setColumnIndex(getTextPrice(),column++);
        setColumnIndex(getPrice(),column);

    }

    public Text getTextTitle() {
        if (textTitle == null){

        }
        return textTitle;
    }
    public Text getTextAuthor(){
        if (textAuthor == null){
            textAuthor = new Text("Author");
        }
        return textTitle;
    }

    public Text getTextPrice(){
        if(textTitle == null){
            textTitle = new Text("Price");
        }
        return textTitle;
    }

    public TextField getTitle() {

        if (title == null){
            textTitle = new Text("");
        }
        return title;
    }

    public TextField getPrice() {

        if (textPrice == null){
            textPrice = new Text("Price");
        }
        return price;
    }

    public TextField getAuthor() {
        return author;
    }

    public Book newBook(){
        return new Book(getTitle().getText(),getAuthor().getText(),getPrice().getText(),Double.parseDouble());
    }
}
