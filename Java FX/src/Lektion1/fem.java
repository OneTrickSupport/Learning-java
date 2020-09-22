package Lektion1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class fem extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        HBox layout = new HBox();
        layout.setSpacing(10);
        layout.setPadding(new Insets(5));
        layout.setAlignment(Pos.BOTTOM_LEFT);

        TextField vanster = new TextField();
        vanster.setPrefWidth(64);

        ComboBox<String> raknesatt = new ComboBox<>();
        raknesatt.getItems().addAll("+", "-", "*", "/");
        raknesatt.setPrefWidth(64);


        TextField hoger = new TextField();
        hoger.setPrefWidth(64);
        javafx.scene.control.Button likamed = new javafx.scene.control.Button();

        Label svar = new Label();

        Label error = new Label();
        VBox errorlayout = new VBox();
        errorlayout.setPadding(new Insets(5));

        layout.getChildren().addAll(vanster, hoger, likamed);

    }

}
