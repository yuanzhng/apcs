module com.example.ja {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.ja to javafx.fxml;
    exports com.example.ja;
}