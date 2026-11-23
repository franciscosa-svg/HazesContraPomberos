package com.programandofodacci.hazescontrapomberos;

import com.programandofodacci.hazescontrapomberos.models.Planta;
import com.programandofodacci.hazescontrapomberos.models.plantas.Atacantes;
import com.programandofodacci.hazescontrapomberos.utils.CLADAP;
import com.programandofodacci.hazescontrapomberos.utils.CLADJ;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

/**
 * JavaFX App
 */
public class App extends Application {
    public static final CLADJ cladj = new CLADJ();
    private static final String SO = System.getProperty("os.name");
    private static final String DIR = System.getProperty("user.dir");
    private static ArrayList<Planta> Plantas = new ArrayList<>();
    public static final CLADAP cladap = new CLADAP();
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("menus/menuPrincipal"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
//        String[] arquivos = cladap.pegarNomesArquivos(DIR+"/src/main/resources/com/programandofodacci/hazescontrapomberos/jsons/plantas");

        launch();
    }

}