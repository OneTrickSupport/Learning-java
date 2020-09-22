package Lektion1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class uppg4 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        HBox layout = new HBox();
        layout.setPadding(new Insets(5));
        layout.setSpacing(5);
        layout.setAlignment(Pos.CENTER);

        int nummer = 0;

        Label tryckningar = new Label("0");
        Button knapp = new Button("tryck mig!");


        knapp.setOnAction(e -> {
            int antal = Integer.parseInt(tryckningar.getText());
            antal++;

            tryckningar.setText(String.valueOf(antal));

        });

        layout.getChildren().addAll(knapp, tryckningar);
        Scene scene = new Scene(layout, 300, 80);
        primaryStage.setScene(scene);
        primaryStage.setTitle("tryck på knappen!");
        primaryStage.show();


    }
}
