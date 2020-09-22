package Labb2;

public class Maya implements Comparable<Maya>  {
    private String namn;
    private String typ;
    private String beskrivning;

    Maya(String namn){
        this.namn = namn;
    }

    public Maya(String namn, String typ, String beskrivning) {
        this.namn = namn;
        this.typ = typ;
        this.beskrivning = beskrivning;
    }

    @Override
    public int hashCode() {
       return this.getNamn().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Maya)) return false;
        return ((Maya) obj).getNamn().equals(this.getNamn());
        }



    @Override
    public String toString() {
        return this.getNamn();
    }

    @Override
    public int compareTo(Maya o) {
        return this.getNamn().compareTo(o.getNamn());
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getBeskrivning() {
        return beskrivning;
    }

    public void setBeskrivning(String beskrivning) {
        this.beskrivning = beskrivning;
    }
}


