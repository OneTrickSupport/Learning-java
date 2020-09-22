package Lektion1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class trean extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group layout = new Group();

        Rectangle chasi = new Rectangle(70, 100, 200, 50);
        chasi.setFill(Color.RED);

        Rectangle roof = new Rectangle(100, 70, 100, 30);
        roof.setFill(Color.RED);

        Circle framhjul = new Circle(125, 150, 25);
        Circle bakhjul = new Circle(225, 150, 25);

        layout.getChildren().addAll(chasi, roof, framhjul, bakhjul);
        Scene scene = new Scene(layout, 320, 240);
        primaryStage.setScene(scene);
        primaryStage.setTitle("En bil");
        primaryStage.show();

    }
}
