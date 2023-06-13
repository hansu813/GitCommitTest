module com.example.workspace {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.workspace to javafx.fxml;
    exports com.example.workspace;
}