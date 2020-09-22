package Lektion1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class uppg6 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox hBox = new HBox();
        Label text = new Label("Ange tid:");
        TextField textfalt = new TextField();
        hBox.setPadding(new Insets(5));
        hBox.setSpacing(5);


        VBox vbox = new VBox();
        vbox.setPadding(new Insets(5));
        vbox.setSpacing(5);
        Button knapp = new Button("Beräkna");

        Label h = new Label("h");
        Label m = new Label("m");
        Label s = new Label("s");


        TextField timmar = new TextField();
        timmar.setPrefWidth(60);
        TextField minuter = new TextField();
        minuter.setPrefWidth(60);
        TextField sekunder = new TextField();
        sekunder.setPrefWidth(60);

        knapp.setOnAction(event -> {
            if(timmar.getText().equals("") || minuter.getText().equals("")||sekunder.getText().equals("")){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Meddelande");
                alert.setContentText("Du har inte skrivit in något i alla rutor");
                alert.setHeaderText("Problem");
                alert.show();
            }
            else {
                int timme = Integer.parseInt(timmar.getText()) * 3600;
                int minut = Integer.parseInt(minuter.getText()) * 60;
                int sekund = Integer.parseInt(sekunder.getText());
                int summa = timme + minut + sekund;

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Meddelande");
                alert.setContentText("Det blir " + summa + " sekunder");
                alert.setHeaderText("Beräkna värde");
                alert.show();

            }
        });
        hBox.setAlignment(Pos.BASELINE_CENTER);


        hBox.getChildren().addAll(text,h,timmar,m,minuter,s,sekunder);
        vbox.getChildren().addAll(hBox,knapp);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tidsräknare");
        primaryStage.show();



    }
}
