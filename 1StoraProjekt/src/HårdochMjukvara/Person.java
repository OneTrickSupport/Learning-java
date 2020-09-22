package Labb3;


public class Person {

  private String AnställningsID;
  private String FNamn;
  private String Enamn;
  private String Rumsnummer;
  private String Personnummer;


  public Person(String anställningsID, String FNamn, String enamn, String rumsnummer, String personnummer) {
    AnställningsID = anställningsID;
    this.FNamn = FNamn;
    Enamn = enamn;
    Rumsnummer = rumsnummer;
    Personnummer = personnummer;
  }

  public String getAnställningsID() {
    return AnställningsID;
  }

  public void setAnställningsID(String anställningsID) {
    this.AnställningsID = anställningsID;
  }


  public String getFNamn() {
    return FNamn;
  }

  public void setFNamn(String fNamn) {
    this.FNamn = fNamn;
  }


  public String getEnamn() {
    return Enamn;
  }

  public void setEnamn(String enamn) {
    this.Enamn = enamn;
  }


  public String getRumsnummer() {
    return Rumsnummer;
  }

  public void setRumsnummer(String rumsnummer) {
    this.Rumsnummer = rumsnummer;
  }


  public String getPersonnummer() {
    return Personnummer;
  }

  public void setPersonnummer(String personnummer) {
    this.Personnummer = personnummer;
  }

}
