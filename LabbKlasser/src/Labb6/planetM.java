package Labb6;

public class planetM {
    private String namn;
    private int plats;
    private int manar;
    private int aphelium;
    private int perihelium;
    private String[] manlista = new String[200];
    private int inlagdamanar = 0;



    public planetM(){

    }
    public planetM(String n, int p, int m, int ap, int pe){
        namn = n;
        plats = p;
        manar = m;
        aphelium = ap;
        perihelium = pe;


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

    public String[] getManlista() {
        return manlista;
    }

    public void setManlista(String[] manlista) {
        this.manlista = manlista;
    }
    public void addMane(String m){
        if(inlagdamanar < manar){
            manlista[inlagdamanar] = m;
            inlagdamanar++;
        }

    }
    public String[] showManar(){
        String[] returnLista = new String[inlagdamanar];

        for(int i = 0; i < inlagdamanar; i++){
            returnLista[i] = manlista[i];

        }
        return returnLista;


    }

    public int getInlagdamanar() {
        return inlagdamanar;
    }
}
