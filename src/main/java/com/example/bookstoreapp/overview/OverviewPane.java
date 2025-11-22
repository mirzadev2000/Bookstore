package com.example.bookstoreapp.overview;

import com.example.bookstoreapp.Model.BooksStorage;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

public class OverviewPane extends BorderPane {


    private OverviewTableView overviewTableView= null;
    private OverviewLeftPane overviewLeftPane = null;



    public OverviewPane() {
        initS();
    }

    private void initS(){
        this.setTop(new Text("This table contains book for sale"));

        setPrefWidth(800);
        setPrefHeight(600);
    }


    public OverviewLeftPane getOverviewLeftPane() {

        if (overviewLeftPane == null)
        {
            overviewLeftPane = new OverviewLeftPane(getOverviewTableView());
        }
        return overviewLeftPane;
    }

    public OverviewTableView getOverviewTableView() {

        if (overviewTableView == null){
            overviewTableView = new OverviewTableView(BooksStorage.INSTANCE.observableListBooks());
        }
        return overviewTableView;
    }


    public void refreshData(){
        getOverviewTableView().setItems(BooksStorage.INSTANCE.observableListBooks());
    }
}
