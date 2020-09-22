package Lektion1;

import javafx.scene.image.ImageView;

public class objekt extends ImageView {
    private String namn;

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public objekt(){
        super();

    }
}
