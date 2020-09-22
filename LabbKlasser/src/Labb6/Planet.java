package Labb6;

public class Planet {
    private String namn;
    private int plats;
    private int manar;
    private int aphelium;
    private int perihelium;

    public Planet(){

    }
    public Planet(String n, int p, int m, int ahel, int phel){
        namn = n;
        plats = p;
        manar = m;
        aphelium = ahel;
        perihelium = phel;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public int getPlats() {
        return plats;
    }

    public void setPlats(int plats) {
        this.plats = plats;
    }

    public int getManar() {
        return manar;
    }

    public void setManar(int manar) {
        this.manar = manar;
    }

    public int getAphelium() {
        return aphelium;
    }

    public void setAphelium(int aphelium) {
        this.aphelium = aphelium;
    }

    public int getPerihelium() {
        return perihelium;
    }

    public void setPerihelium(int perihelium) {
        this.perihelium = perihelium;
    }
}
