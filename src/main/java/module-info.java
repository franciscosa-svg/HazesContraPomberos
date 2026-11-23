module com.programandofodacci.hazescontrapomberos {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires org.slf4j;
    requires org.fxmisc.undo;
    requires jamepad;
    requires okhttp3;
    requires org.apache.logging.log4j;

    opens com.programandofodacci.hazescontrapomberos to javafx.fxml;
    opens com.programandofodacci.hazescontrapomberos.models to com.programandofodacci.hazescontrapomberos, com.google.gson;
    exports com.programandofodacci.hazescontrapomberos;
    exports com.programandofodacci.hazescontrapomberos.models;
}