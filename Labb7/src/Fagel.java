public class Fagel extends Djur {
    private boolean arFlyttfagel;
    private boolean kanFlyga;
    private String redestyp;

    public Fagel(){

    }

    public Fagel(String namn, String latisktNamn, double vikt, String late, boolean arFlyttfagel, boolean kanFlyga, String redestyp) {
        super(namn, latisktNamn, vikt, late);
        this.arFlyttfagel = arFlyttfagel;
        this.kanFlyga = kanFlyga;
        this.redestyp = redestyp;
    }

    public Fagel(String namn, String latisktNamn, double vikt, boolean arFlyttfagel, boolean kanFlyga, String redestyp, String late) {
        super(namn, latisktNamn, vikt, late);
        this.arFlyttfagel = arFlyttfagel;
        this.kanFlyga = kanFlyga;
        this.redestyp = redestyp;
    }

    @Override
    public String unikEgenskap() {
        if (arFlyttfagel == true){
            return "är en flyttfågel";
        }
        else return "är inte en flyttfågel";
    }

    public boolean isArFlyttfagel() {
        return arFlyttfagel;
    }

    public void setArFlyttfagel(boolean arFlyttfagel) {
        this.arFlyttfagel = arFlyttfagel;
    }

    public boolean isKanFlyga() {
        return kanFlyga;
    }

    public void setKanFlyga(boolean kanFlyga) {
        this.kanFlyga = kanFlyga;
    }

    public String getRedestyp() {
        return redestyp;
    }

    public void setRedestyp(String redestyp) {
        this.redestyp = redestyp;
    }

    @Override
    public String ljud() {
        return super.ljud();
    }

    public String flyttString() {
        if (isArFlyttfagel() == false) {
            return "är inte en flyttfågel ";
        } else {
            return "är en flyttfågel ";
        }
    }

    public String kanFlygaString() {
        if (isKanFlyga() == false) {
            return "och kan inte flyga samt ";
        } else {
            return "som kan flyga samt ";
        }
    }

    @Override
    public String toString() {
        return super.toString() + " och " + flyttString() +
                kanFlygaString() + "har redestypen " + getRedestyp() + ". Den låter: " + this.ljud().substring(1);
    }
    public String export(){
        String s = new String();
        s = "F,"+this.getNamn() + "," + this.getLatisktNamn() + "," +
                this.getVikt() + "," + this.isArFlyttfagel() + "," + this.isKanFlyga() + "," + getRedestyp() +  this.ljud();
        return s;
    }



}

