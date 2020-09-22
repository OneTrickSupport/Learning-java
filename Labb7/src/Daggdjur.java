public class Daggdjur extends Djur {
    private String palsfarg;
    private boolean harVinterPals;


    public Daggdjur(String palsfarg, boolean harVinterPals) {
        this.palsfarg = palsfarg;
        this.harVinterPals = harVinterPals;
    }

    @Override
    public String unikEgenskap() {
        return "har en " + palsfarg + " pälsfärg";
    }

    public Daggdjur(String namn, String latisktNamn, double vikt,String late, String palsfarg, boolean harVinterPals) {
        super(namn, latisktNamn, vikt, late);
        this.palsfarg = palsfarg;
        this.harVinterPals = harVinterPals;
    }



    public Daggdjur(String namn, String latisktNamn, double vikt, String palsfarg, boolean harVinterPals, String late) {
        super(namn, latisktNamn, vikt, late);
        this.palsfarg = palsfarg;
        this.harVinterPals = harVinterPals;
    }

    public String getPalsfarg() {
        return palsfarg;
    }

    public void setPalsfarg(String palsfarg) {
        this.palsfarg = palsfarg;
    }

    public boolean isHarVinterPals() {
        return harVinterPals;
    }

    public void setHarVinterPals(boolean harVinterPals) {
        this.harVinterPals = harVinterPals;
    }

    @Override
    public String ljud() {
        return super.ljud();
    }


    @Override
    public String toString() {
        return super.toString() + " och har en päls som är " + palsfarg +
                this.vinterpalsString() + " Den låter: " + this.ljud().substring(1);
    }
    public String vinterpalsString() {
        if (harVinterPals == false) {
            return " men har ingen vinterpäls.";

        } else {
            return " och har vinterpäls. ";
        }

    }
    public String export(){
        String s = new String();
        s = "D,"+ this.getNamn() + "," + this.getLatisktNamn() + "," +
                this.getVikt() + "," + this.getPalsfarg() + "," + this.isHarVinterPals() + this.ljud();
        return s;
    }

}

