package Lektion1;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.ArrayList;


public class Uppg8 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    objekt tradd = new objekt();
    tradd.setNamn("Träd");
    tradd.setImage(new Image("file:Tree_2.png"));
        tradd.setPreserveRatio(true);
        tradd.setFitHeight(400);
        tradd.setFitWidth(200);
        tradd.setX(5);
        tradd.setY(150);

    objekt snoo = new objekt();
    snoo.setNamn("snögubbe");
    snoo.setImage(new Image("file:SnowMan.png"));
        snoo.setPreserveRatio(true);
        snoo.setFitHeight(300);
        snoo.setFitWidth(180);
        snoo.setX(850);
        snoo.setY(200);


    Group group = new Group();
    Image bakgund = new Image("file:Bak.png");
    ImageView vyn = new ImageView(bakgund);
    Image trad = new Image("file:Tree_2.png");
    Image snogubbe = new Image("file:SnowMan.png");
    ImageView tradvy = new ImageView(trad);
    ImageView snogubbevy = new ImageView(snogubbe);

    /*tradvy.setPreserveRatio(true);
    tradvy.setFitHeight(400);
    tradvy.setFitWidth(200);
    tradvy.setX(5);
    tradvy.setY(150);

    snogubbevy.setPreserveRatio(true);
    snogubbevy.setFitHeight(300);
    snogubbevy.setFitWidth(180);
    snogubbevy.setX(850);
    snogubbevy.setY(200);
*/

        Tomte tomte1 = new Tomte();

        ArrayList<Image> arraybilder = new ArrayList<>();
        for (int i = 0; i <11 ; i++) {
            Image bolder = new Image("file:Run (" + (i +1) + ").png");
            arraybilder.add(bolder);
        }

        tomte1.setBildarray(arraybilder);



        tomte1.setPreserveRatio(true);
        tomte1.setFitHeight(250);
        tomte1.setFitWidth(250);
        tomte1.setX(500);
        tomte1.setY(238);

        group.getChildren().addAll(vyn, snoo, tradd);
        group.getChildren().addAll(tomte1);

        Scene scene = new Scene(group, 1024, 506);
        primaryStage.setTitle("Santa Claus");
        primaryStage.setScene(scene);
        primaryStage.show();

       /* if(tomte1.getBoundsInLocal().intersects(tradd.getBoundsInLocal())){
            tomte1.setX_speed(-tomte1.getX_speed());
            tomte1.setScaleX(1);
        }
        if(tomte1.getBoundsInLocal().intersects(snoo.getBoundsInLocal())){
            tomte1.setX_speed(-tomte1.getX_speed());
            tomte1.setScaleX(-1);
        }*/




        KeyFrame k = new KeyFrame(Duration.millis(10), event ->{
            tomte1.move();
            /* if(tomte1.getBoundsInLocal().intersects(tradd.getBoundsInLocal())){
            tomte1.setX_speed(-tomte1.getX_speed());
            tomte1.setScaleX(1);
        }
        if(tomte1.getBoundsInLocal().intersects(snoo.getBoundsInLocal())){
            tomte1.setX_speed(-tomte1.getX_speed());
            tomte1.setScaleX(-1);
        }*/


        });


        Timeline tl = new Timeline(k);
        tl.setCycleCount(Timeline.INDEFINITE);


        tl.play();




    }
}
