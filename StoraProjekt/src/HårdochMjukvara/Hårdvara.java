package Labb3;


public class Hårdvara {

  private String typ;
  private String serienummer;
  private String hNamn;
  private String märke;

  public Hårdvara() {
  }

  public Hårdvara(String hNamn) {
    this.hNamn = hNamn;
  }

  public String getTyp() {
    return typ;
  }

  public void setTyp(String typ) {
    this.typ = typ;
  }


  public String getSerienummer() {
    return serienummer;
  }

  public void setSerienummer(String serienummer) {
    this.serienummer = serienummer;
  }


  public String getHNamn() {
    return hNamn;
  }

  public void setHNamn(String hNamn) {
    this.hNamn = hNamn;
  }


  public String getMärke() {
    return märke;
  }

  public void setMärke(String märke) {
    this.märke = märke;
  }

}
