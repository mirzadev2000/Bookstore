package com.example.bookstoreapp;

import com.example.bookstoreapp.Model.BooksStorage;
import com.example.bookstoreapp.create.CreateScene;
import com.example.bookstoreapp.overview.OverviewScene;
import javafx.application.Application;
import javafx.stage.Stage;

public class BookStoreApp extends Application {



    private OverviewScene overviewScene = null;
    private CreateScene createScene = null;
    private Stage stage;

    @Override
    public void start(Stage stage) throws Exception {
        Stage primaryStage = new Stage();
        this.stage = primaryStage;
        primaryStage.setTitle("BookStore App");
        primaryStage.setScene(getOverviewScene());
        primaryStage.show();
    }

    public OverviewScene getOverviewScene() {
        if (overviewScene == null){
            overviewScene = new OverviewScene();
            overviewScene.addEventFilter(BookStoreEvent.createScene,(e)->{
                stage.setScene(getCreateScene());
            });
        }
        return overviewScene;

    }

    public CreateScene getCreateScene() {

        if (createScene == null){
            createScene = new CreateScene();
            createScene.addEventFilter(BookStoreEvent.createScene,((e)-> {
                overviewScene.refreshData();
                stage.setScene(getOverviewScene());
            }}
        return createScene;
    }

    public static void main(String[] args) {
        launch();
    }
}
