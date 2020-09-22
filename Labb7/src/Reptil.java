public class Reptil extends Djur {
    private String levnadsmiljö;
    private boolean giftig;

    public Reptil(String levnadsmiljö, boolean giftig) {
        this.levnadsmiljö = levnadsmiljö;
        this.giftig = giftig;
    }

    public Reptil(String namn, String latisktNamn, double vikt, String late, String levnadsmiljö, boolean giftig) {
        super(namn, latisktNamn, vikt, late);
        this.levnadsmiljö = levnadsmiljö;
        this.giftig = giftig;
    }

    public Reptil(String namn, String latisktNamn, double vikt, String levnadsmiljö, boolean giftig,  String late) {
        super(namn, latisktNamn, vikt, late);
        this.levnadsmiljö = levnadsmiljö;
        this.giftig = giftig;
    }

    @Override
    public String unikEgenskap() {
        if (giftig == true){
            return "är en giftig reptil";
        }
          else return "är inte en giftig reptil";
    }



        public String getLevnadsmiljö () {
            return levnadsmiljö;
        }

        public void setLevnadsmiljö (String levnadsmiljö){
            this.levnadsmiljö = levnadsmiljö;
        }

        public boolean isGiftig () {
            return giftig;
        }

        public void setGiftig ( boolean giftig){
            this.giftig = giftig;
        }

        @Override
        public String ljud () {
            return super.ljud();
        }


    public String giftigString(){
        if (isGiftig() == false){
            return "inte giftig. ";
        }else return "giftig. ";
    }

    public String export(){
        String s = new String();
        s = "R,"+this.getNamn() + "," + this.getLatisktNamn() + "," +
                this.getVikt() + "," + this.getLevnadsmiljö() + "," + this.isGiftig() + this.ljud();
        return s;
    }
    @Override
    public String toString() {
        return super.toString() + " bor i " +
                levnadsmiljö + " och är " + giftigString() + "Den låter: " + this.ljud().substring(1);
    }

}


