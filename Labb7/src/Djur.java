public abstract class Djur implements Comparable<Djur>{
    private String namn;
    private String latisktNamn;
    private double vikt;
    private String late;

public Djur(){

}

    public Djur(String namn, String latisktNamn, double vikt, String late) {
        this.namn = namn;
        this.latisktNamn = latisktNamn;
        this.vikt = vikt;
        this.late = late;
    }

    public String unikEgenskap(){
    return unikEgenskap();
    }



    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getLatisktNamn() {
        return latisktNamn;
    }

    public void setLatisktNamn(String latisktNamn) {
        this.latisktNamn = latisktNamn;
    }

    public double getVikt() {
        return vikt;
    }

    public void setVikt(double vikt) {
        this.vikt = vikt;
    }

    public String getLate() {
        return late;
    }

    public void setLate(String late) {
        this.late = late;
    }
    public String ljud(){
    return late;
    }

    @Override
    public int compareTo(Djur o) {
        return this.getLatisktNamn().compareTo(o.getLatisktNamn());
    }

    @Override
    public String toString() {
        return namn + "(" + latisktNamn + ") väger omkrinng " + vikt + "kg";
    }
    public String export(){
        String s= "";
        return s;
    }


}

