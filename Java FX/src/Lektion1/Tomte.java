package Lektion1;

import javafx.geometry.BoundingBox;
import javafx.geometry.Bounds;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.Objects;

public class Tomte extends ImageView {
    private ArrayList<Image> bildarray;
    private double x_speed;

    public Tomte(){
        super();
        this.x_speed = 4;

    }

    public ArrayList<Image> getBildarray() {
        return bildarray;
    }




    public void setBildarray(ArrayList<Image> bildarray) {
        this.bildarray = bildarray;
    }

    public Image enbild(int x){
        return bildarray.get(x);
    }


    public double getX_speed() {
        return x_speed;
    }

    public void setX_speed(double x_speed) {
        this.x_speed = x_speed;
    }



int i = 0;
int c = 0;
    public void move() {

        this.setImage(enbild(i));

       /* if(this.getBoundsInLocal().intersects(this.getLayoutBounds())){
            System.out.println("bajs");
            if (getScaleX()==1){
                this.x_speed = -this.x_speed;
                setScaleX(1);
            }else {
                this.x_speed = -this.x_speed;
                setScaleX(-1);
            }
        }*/

        if (super.getX() <= 30) {
            super.setX(30);
            this.x_speed = -this.x_speed;
            this.setScaleX(1);
        }
        if (super.getX() >= 950 - this.getFitWidth()) {
            super.setX(950 - this.getFitWidth());
            this.x_speed = -this.x_speed;
            this.setScaleX(-1);
        }






        super.setX(super.getX() + this.x_speed);





        if(c==5){
            i++;
        }
        if(c==10){
            i++;
        }
        if(c==15){
            i++;
        }
        if(c==20){
            i++;
        }
        if(c==25){
            i++;
        }
        if(c==30){
            i++;
        }
        if(c==35){
            i++;
        }
        if(c==40){
            i++;
        }
        if(c==45){
            i++;
        }
        if(c==50){
            i++;
            c = c - 50;
        }
        if(i==10){
            i= i -10;
        }
        c++;


    }
}
