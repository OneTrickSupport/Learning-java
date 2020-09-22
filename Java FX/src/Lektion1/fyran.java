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

public class fyran extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox layout = new HBox();
        layout.setPadding(new Insets(5));
        layout.setSpacing(5);
        layout.setAlignment(Pos.BASELINE_LEFT);

        TextField vanster = new TextField();
        vanster.setPrefWidth(64);

        Label symbol = new Label("+");

        TextField hoger = new TextField();
        hoger.setPrefWidth(64);

        Button likamed = new Button("=");
        Label svar = new Label();

        likamed.setOnAction(e -> {
            int summa = Integer.parseInt(vanster.getText()) + Integer.parseInt(hoger.getText());
            svar.setText(String.valueOf(summa));
                });



        layout.getChildren().addAll(vanster, symbol, hoger, likamed, svar);
        Scene scene = new Scene(layout, 300, 80);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Räkna plus");
        primaryStage.show();

    }
}
