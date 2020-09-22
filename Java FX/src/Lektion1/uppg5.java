package Lektion1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class uppg5 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox hBox = new HBox();
        Label text = new Label("Ange antal sekunder:");
        TextField textfalt = new TextField();
        hBox.setPadding(new Insets(5));
        hBox.setSpacing(5);


        VBox vbox = new VBox();
        vbox.setPadding(new Insets(5));
        vbox.setSpacing(5);
        Button knapp = new Button("Beräkna");
        Label ett = new Label("Timmar");
        Label tva = new Label("Minuter");
        Label tre = new Label("Seknuder");

        HBox ettan = new HBox();
        ettan.setSpacing(5);
        ettan.setPadding(new Insets(5));
        Label timmar = new Label();
        HBox tvan = new HBox();
        tvan.setPadding(new Insets(5));
        tvan.setSpacing(5);
        Label minuter = new Label();
        HBox trean = new HBox();
        trean.setSpacing(5);
        trean.setPadding(new Insets(5));
        Label sekunder = new Label();


        knapp.setOnAction(event -> {
            int sek = Integer.parseInt(textfalt.getText());
            timmar.setText(String.valueOf((sek/3600)));
            sek = sek%3600;
            minuter.setText(String.valueOf((sek/60)));
            sek = sek % 60;
            sekunder.setText(String.valueOf(sek));

        });


        ettan.getChildren().addAll(ett,timmar);
        tvan.getChildren().addAll(tva,minuter);
        trean.getChildren().addAll(tre,sekunder);
        hBox.getChildren().addAll(text,textfalt);
        vbox.getChildren().addAll(hBox,knapp,ettan,tvan,trean);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tidsräknare");
        primaryStage.show();


    }
}
