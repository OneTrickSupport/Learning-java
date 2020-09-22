package Labb6;

import java.util.Scanner;

public class Uppg4 {
    public static void main(String[] args) {

        int svar;
        int inlagdaP = 0;

        PlanetMedManobjekt[] planetarray = new PlanetMedManobjekt[200];

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("Solsystemet");
            System.out.print("=================");
            System.out.println();
            System.out.println();
            System.out.println("1. Visa inlaggda planeter");
            System.out.println("2. Lägg till planet");
            System.out.println("3. Avsluta");
            System.out.println();
            System.out.print("Gör ditt val --> ");
            svar = Integer.parseInt(scan.next());


            switch (svar) {
                case 1:
                    if (inlagdaP == 0) {
                        System.out.println();
                        System.out.println("Inga planeter inlagda");

                    } else {
                        for (int i = 0; i < inlagdaP; i++) {
                            System.out.println();
                            System.out.println("Planetnamn: " + planetarray[i].getNamn());
                            System.out.println(" Antal månar: " + planetarray[i].getAntalmanar());
                            if (planetarray[i].showManar().length > 0) {
                                for (int j = 0; j < planetarray[i].showManar().length; j++) {
                                    System.out.println(" Måne: " + (j + 1) + ": " + planetarray[i].getManearray()[j].getNamn() + " (" + planetarray[i].getManearray()[j].getDiameter() + "km)");

                                }
                            }
                            System.out.println(" Aphelium: " + planetarray[i].getAphelium());
                            System.out.println(" Perihelium: " + planetarray[i].getPerihelium());
                            System.out.println();
                        }
                    }
                    break;
                case 2:
                    System.out.print("Vad heter planeten? ");
                    String planet = scan.next();
                    PlanetMedManobjekt p1 = new PlanetMedManobjekt();
                    planetarray[inlagdaP] = p1;
                    planetarray[inlagdaP].setNamn(planet);
                    System.out.print("Plats från solen? ");
                    int plats = scan.nextInt();
                    planetarray[inlagdaP].setPlats(plats);
                    System.out.print("Antal månar? ");
                    int manar = scan.nextInt();
                    planetarray[inlagdaP].setAntalmanar(manar);
                    if (manar > 0) {
                        System.out.print("Vill du skriva in månar (J/N)? ");
                        String JN = scan.next();
                        if (JN.equals("J")) {
                            System.out.println("Skriv in månar, avsluta med namnet stopp");
                            for (int i = 0; i < manar; i++) {
                                System.out.print("Namn: ");
                                String manNamn = scan.next();
                                if (manNamn.equalsIgnoreCase("stopp")) {
                                    break;
                                } else {

                                    System.out.print("Ange diametern i km ");
                                    int dia = scan.nextInt();
                                    planetarray[inlagdaP].addMane(new Mane(manNamn, dia));
                                }

                            }
                        }
                    }
                    System.out.print("Ange aphelium ");
                    int app = scan.nextInt();
                    planetarray[inlagdaP].setAphelium(app);
                    System.out.print("Ange Perihelium ");
                    int per = scan.nextInt();
                    planetarray[inlagdaP].setPerihelium(per);
                    inlagdaP++;
                    break;
            }
        } while (svar != 3);

    }


}
