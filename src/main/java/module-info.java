module com.programandofodacci.hazescontrapomberos {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.google.gson;
    requires org.slf4j;
    requires okhttp3;

    opens com.programandofodacci.hazescontrapomberos to javafx.fxml;
    exports com.programandofodacci.hazescontrapomberos;
}
