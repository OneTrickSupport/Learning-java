package Labb3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.sql.*;
import java.util.ArrayList;


public class uppg2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        ListView listan = new ListView();
        ListView albumlista = new ListView();
        ArrayList<String> artistarray = new ArrayList();


        BorderPane layout = new BorderPane();
        Label rubrik = new Label("MusikDB");
        rubrik.setFont(new Font(20));
        layout.setTop(rubrik);


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivrutin laddad!");
        } catch (ClassNotFoundException e) {
            System.out.println("Misslyckades att ladda drivrutinen");
        }


        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/musikdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Mammapappa1")) {
            System.out.println("YES!");

            Statement stt = conn.createStatement();
            ResultSet res = stt.executeQuery("SELECT artist.namn from artist");

            while (res.next()) {
                artistarray.add(res.getString(1));
            }
            listan.getItems().addAll(artistarray);


        } catch (SQLException e) {
            System.out.println("Det sekt sig " + e.getMessage());

        }

        listan.getSelectionModel().selectedIndexProperty().addListener(ov -> {

            albumlista.getItems().clear();

            albumlista.getItems().addAll(hamtaalbum(artistarray.get(listan.getSelectionModel().getSelectedIndex())));


        });


        layout.setLeft(listan);
        layout.setRight(albumlista);
        Scene scene = new Scene(layout, 500, 400);
        primaryStage.setTitle("MusikDB");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public ArrayList<String> hamtaalbum(String artist) {
        ArrayList<String> album = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/musikdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Mammapappa1")) {
            System.out.println("YES!");

            Statement stt = conn.createStatement();
            ResultSet res = stt.executeQuery("SELECT album.Namn from album where Artist = " + "'" + artist + "'" + "order by Utgivningsar ASC");

            while (res.next()) {
                album.add(res.getString(1));
            }


        } catch (SQLException e) {
            System.out.println("Det sekt bajs " + e.getMessage());
        }
        return album;
    }
}


