package Labb1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class uppg2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane ny = new GridPane();


        for (int i = 0; i < 8 ; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle rec = new Rectangle();
                rec.setWidth(100);
                rec.setHeight(100);
                if((i+j)%2==0){
                    rec.setFill(Color.WHITE);
                }
                GridPane.setRowIndex(rec,i);
                GridPane.setColumnIndex(rec,j);
                ny.getChildren().addAll(rec);

            }

        }

        Scene scene = new Scene(ny, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Schackbräde");
        primaryStage.show();





    }
}
