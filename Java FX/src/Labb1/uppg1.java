package Labb1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class uppg1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Group layout = new Group();

        Circle botten = new Circle(225, 205, 35);
        Circle mitten = new Circle(225, 155, 25);
        Circle top = new Circle(225, 120, 15);
        Circle sol = new Circle(350, 50, 25);

        Circle prick1 = new Circle(225, 155,2);
        Circle prick2 = new Circle(225, 164, 2);
        Circle prick3 = new Circle(225, 146, 2);

        Circle oga1 = new Circle(231, 117, 2);
        Circle oga2 = new Circle(219, 117, 2);

        Rectangle munn = new Rectangle(220,123, 10,2);
        munn.setFill(Color.BLACK);

        oga1.setFill(Color.BLACK);
        oga2.setFill(Color.BLACK);

        prick1.setFill(Color.BLACK);
        prick2.setFill(Color.BLACK);
        prick3.setFill(Color.BLACK);

        botten.setFill(Color.WHITE);
        mitten.setFill(Color.WHITE);
        top.setFill(Color.WHITE);



        sol.setFill(Color.YELLOW);

        layout.getChildren().addAll(sol, botten, mitten, top, prick1, prick2, prick3,oga1,oga2,munn);
        Scene scene = new Scene(layout, 450, 240, Color.LIGHTSKYBLUE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Snögubbe");
        primaryStage.show();



    }
}
