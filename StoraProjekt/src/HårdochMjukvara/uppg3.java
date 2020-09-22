package Labb3;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.css.Size;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.sql.*;
import java.util.ArrayList;

public class uppg3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivrutin laddad!");
        } catch (ClassNotFoundException e) {
            System.out.println("Misslyckades att ladda drivrutinen");
        }

        VBox layout = new VBox();
        ObservableList<String> lista = FXCollections.observableArrayList();


        Label rubrik = new Label("Musik DB Insättare");
        rubrik.setFont(new Font(20));


        ComboBox<String> rullbox = new ComboBox<>();
        Button nyartist = new Button("Skapa ny artist");
        HBox box1 = new HBox();
        box1.setSpacing(10);
        box1.getChildren().addAll(rullbox, nyartist);

        Label namn = new Label("Namn: ");
        TextField namntextfalt = new TextField();
        HBox box2 = new HBox();
        box2.getChildren().addAll(namn, namntextfalt);
        box2.setSpacing(54);

        Label utgivningsar = new Label("Utgivningsår: ");
        TextField utgivningsfalt = new TextField();
        HBox box3 = new HBox();
        box3.setSpacing(19);
        box3.getChildren().addAll(utgivningsar, utgivningsfalt);

        HBox box4 = new HBox();
        Label genre = new Label("Genre: ");
        TextField genrefalt = new TextField();
        box4.setSpacing(54);
        box4.getChildren().addAll(genre, genrefalt);
        box4.setVisible(false);

        Button laggtill = new Button("Lägg till");
        laggtill.setVisible(false);

        Button avbryt = new Button("Avbryt");
        avbryt.setVisible(false);


        Button sattin = new Button("Sätt in");
        HBox box5 = new HBox(sattin, laggtill, avbryt);
        box5.setSpacing(5);


        box1.setPadding(new Insets(5));
        box2.setPadding(new Insets(5));
        box3.setPadding(new Insets(5));
        box4.setPadding(new Insets(5));
        box5.setPadding(new Insets(5));

        layout.setPadding(new Insets(5));
        layout.getChildren().addAll(rubrik, box1, box2, box3, box4, box5);


        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/musikdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Mammapappa1")) {
            System.out.println("YES!");

            Statement stt = conn.createStatement();
            ResultSet res = stt.executeQuery("SELECT Namn from artist");

            while (res.next()) {
                lista.add(res.getString(1));
            }

            rullbox.getItems().addAll(lista);

        } catch (SQLException e) {
            System.out.println("Det sekt sig " + e.getMessage());

        }
        Alert info = new Alert(Alert.AlertType.INFORMATION);
        info.setTitle("Lyckades!");



        nyartist.setOnAction(event -> {

            laggtill.setVisible(true);
            sattin.setVisible(false);
            box4.setVisible(true);
            avbryt.setVisible(true);
            utgivningsar.setText("Bildades: ");
            box3.setSpacing(42);
            namntextfalt.clear();
            utgivningsfalt.clear();
            genrefalt.clear();


        });
        avbryt.setOnAction(event -> {
            laggtill.setVisible(false);
            sattin.setVisible(true);
            box4.setVisible(false);
            avbryt.setVisible(false);
            utgivningsar.setText("Utgivningsår: ");
            box3.setSpacing(19);
            namntextfalt.clear();
            utgivningsfalt.clear();
            genrefalt.clear();
        });

        Alert alert2 = new Alert(Alert.AlertType.ERROR);
        alert2.setTitle("Tomma fält");
        alert2.setContentText("Fyll i textfälten");

        Alert alert3 = new Alert(Alert.AlertType.ERROR);
        alert3.setHeaderText("Något blev fel");
        alert3.setContentText("Se till att artisten eller albumet inte redan finns i databsen!");

        sattin.setOnAction(event -> {

            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/musikdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Mammapappa1")) {


                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Ingen artist vald");
                alert.setContentText("Lägg till artist eller välj en befintlig");


                if (rullbox.getSelectionModel().isEmpty()) {
                    alert.show();
                } else if (namntextfalt.getText().isEmpty() || utgivningsfalt.getText().isEmpty()) {
                    alert2.show();
                } else {

                    PreparedStatement insert = conn.prepareStatement("INSERT into album VALUES (?, ?, ?)");

                    insert.setString(1, namntextfalt.getText());
                    insert.setInt(2, Integer.parseInt(utgivningsfalt.getText()));
                    insert.setString(3, rullbox.getSelectionModel().getSelectedItem().toString());

                    insert.executeUpdate();

                    info.setContentText("insättning klar");
                    info.setHeaderText("Album tillagt");
                    info.show();

                    namntextfalt.clear();
                    utgivningsfalt.clear();
                    genrefalt.clear();


                }


            } catch (SQLException e) {
                alert3.show();

            }


        });

        laggtill.setOnAction(event -> {
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/musikdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Mammapappa1")) {


                if (namntextfalt.getText().isEmpty() || utgivningsfalt.getText().isEmpty() || genrefalt.getText().isEmpty()) {
                    alert2.show();
                } else {


                    PreparedStatement artist = conn.prepareStatement("INSERT into artist VALUES (?, ?, ?)");

                    artist.setString(1, namntextfalt.getText());
                    artist.setInt(2, Integer.parseInt(utgivningsfalt.getText()));
                    artist.setString(3, genrefalt.getText());

                    artist.executeUpdate();



                    info.setContentText("Insättning klar");
                    info.setHeaderText("Artist tillagd");
                    info.show();

                    namntextfalt.clear();
                    utgivningsfalt.clear();
                    genrefalt.clear();

                    lista.clear();
                    rullbox.getItems().clear();

                    Statement stt = conn.createStatement();
                    ResultSet res = stt.executeQuery("SELECT Namn from artist");

                    while (res.next()) {
                        lista.add(res.getString(1));
                    }

                    rullbox.getItems().addAll(lista);


                }

            } catch (SQLException e) {
                alert3.show();


            }
        });


        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Insättning");
        primaryStage.show();


    }


}

