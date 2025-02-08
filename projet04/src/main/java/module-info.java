module com.example.projet04 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projet04 to javafx.fxml;
    exports com.example.projet04;
}