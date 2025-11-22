package com.example.bookstoreapp.create;

import com.example.bookstoreapp.BookStoreEvent;
import com.example.bookstoreapp.Model.BooksStorage;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

import static java.util.Collections.addAll;

public class CreateButtonPane  extends HBox {

    private Button ok = null;
    private Button cancel = null;
    private CreateInputPane createInputPane;

    public void CreateBottonPane(CreateInputPane createInputPane){
        this.createInputPane = createInputPane;
        init();

    }

    private void init(){
        getChildren(),addAll(getOkbutton(), getCancelButton());
    }


    public Button getOkbutton() {
        if (ok == null){
            ok = new Button("OK");
            ok.setOnAction((e) ->{
                BooksStorage.INSTANCE.createBook(this.createInputPane.newBook());
                fireEvent(new BookStoreEvent(BookStoreEvent.overviewScene));
            });
        }
        return ok;

    }

    public Button getCancel() {
        if (cancel == null){
            cancel = new Button("Cancel");
            cancel.setOnAction(( e )->{
                BooksStorage.INSTANCE.createBook(this.createInputPane.newBook());
                fireEvent(new BookStoreEvent(BookStoreEvent.overviewScene));
                )}

        }
        return cancel;

    }

}
