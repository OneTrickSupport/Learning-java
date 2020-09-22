package Lektion1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class tvaa extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox vertical = new VBox();
        vertical.setAlignment(Pos.CENTER);

        HBox horisontal = new HBox();
        horisontal.setAlignment(Pos.CENTER);

        Label helloWorld = new Label("Hello, World!");
        helloWorld.setFont(new Font("IBM Plex Sans", 42));


        horisontal.getChildren().add(helloWorld);
        vertical.getChildren().add(helloWorld);

        Scene scene = new Scene(vertical, 640, 480);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello brave new world");
        primaryStage.show();


    }
}
