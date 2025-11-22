package com.example.bookstoreapp.create;

import javafx.scene.layout.BorderPane;

public class CreatePane extends BorderPane {

    private CreateInputPane createInputPane = null;
    private CreateBottomPane createBottomPane = null;

    public CreateInputPane getCreateInputPane() {

        if (createBottomPane == null){

        }
        return createInputPane;
    }

    public CreateBottomPane getCreateBottomPane() {
        return createBottomPane;
    }
}
