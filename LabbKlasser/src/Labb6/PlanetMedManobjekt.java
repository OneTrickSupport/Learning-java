package Labb6;

import java.util.Arrays;

public class PlanetMedManobjekt {
    private String namn;
    private int antalmanar;
    private int plats;
    private int aphelium;
    private int perihelium;
    private int inlagdamanar = 0;

    private Mane[] manearray = new Mane[200];


   /*public PlanetMedManobjekt(String n, int p, int an, int ap, int pe, Mane[] manearray) {
        namn = n;
        plats = p;
        aphelium = ap;
        perihelium = pe;
        antalmanar = an;
        inlagdamanar = manearray.length;

    }*/

    public PlanetMedManobjekt(String namn, int antalmanar, int plats, int aphelium, int perihelium, Mane[] manearray) {
        this.namn = namn;
        this.antalmanar = antalmanar;
        this.plats = plats;
        this.aphelium = aphelium;
        this.perihelium = perihelium;
        this.manearray = manearray;
        inlagdamanar = manearray.length;
    }

    public int getAntalmanar() {
        return antalmanar;
    }

    public void setAntalmanar(int antalmanar) {
        this.antalmanar = antalmanar;
    }

    public PlanetMedManobjekt() {

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

    public Mane[] getManearray() {
        return manearray;
    }

    public void addMane(Mane m) {
        if (inlagdamanar < antalmanar) {
            manearray[inlagdamanar] = m;
            inlagdamanar++;
        } else {
        }
    }

    public Mane[] showManar() {
        return Arrays.copyOfRange(manearray, 0, inlagdamanar);
    }

    public int getInlagdamanar() {
        return inlagdamanar;
    }
}
