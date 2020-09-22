package Labb1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class uppg3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Image bilden = new Image("file:sotkatt.jpg");
        ImageView vyn = new ImageView(bilden);

        Group root = new Group();
        root.getChildren().addAll(vyn);
        Scene scene = new Scene(root);
        primaryStage.setTitle("sötkatt");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
