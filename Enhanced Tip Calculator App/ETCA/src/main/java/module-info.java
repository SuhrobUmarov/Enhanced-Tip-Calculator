module com.example.etca {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.etca to javafx.fxml;
    exports com.example.etca;
}