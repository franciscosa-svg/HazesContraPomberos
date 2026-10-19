module com.programandofodacci.hazescontrapomberos {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.programandofodacci.hazescontrapomberos to javafx.fxml;
    exports com.programandofodacci.hazescontrapomberos;
}
