module com.example.bookstoreapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.bookstoreapp to javafx.fxml;
    exports com.example.bookstoreapp;
}