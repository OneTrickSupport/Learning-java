/*Kurs: 1IK143
Laboration: Labb1:6
Kursdeltagare: Karl Nilros
HT18 och 2018-09-12*/


import java.util.Scanner;

public class uppgift6 {
    public static void main(String[] args) {
        Scanner tagentbord = new Scanner(System.in);
        int femhundra;
        int hundra;
        int femtio;
        int tjugo;
        int tio;
        int femkrona;
        int tvokrona;
        int enkrona;
        int kostnad;
        int betalt;

        System.out.println("Dyra böcker av Asimov AB");
        System.out.println("=========================");
        System.out.println();
        System.out.println("Hur mycket kostar boken? ");
        kostnad = tagentbord.nextInt();
        System.out.println("Hur mycket betalar du med? ");
        betalt = tagentbord.nextInt();
        int vaxel = (betalt - kostnad);
        System.out.println("Din växel blir " + vaxel + " kronor.");


        femhundra = vaxel / 500;
        vaxel = vaxel % 500;

        hundra = vaxel / 100;
        vaxel = vaxel % 100;

        femtio = vaxel / 50;
        vaxel = vaxel % 50;

        tjugo = vaxel / 20;
        vaxel = vaxel % 20;

        tio = vaxel / 10;
        vaxel = vaxel % 10;

        femkrona = vaxel / 5;
        vaxel = vaxel % 5;

        tvokrona = vaxel / 2;
        vaxel = vaxel % 2;

        enkrona = vaxel;

        System.out.println("Antal 500 kr-sedlar i växel: " + femhundra);
        System.out.println("antal 100 kr-sedlar i växel: " + hundra);
        System.out.println("Antal 50 kr-sedlar i växel: " + femtio);
        System.out.println("Antal 20 kr-sedlar i växel: " + tjugo);
        System.out.println("Antal tiokronor i växel: " + tio);
        System.out.println("Antal femkronor i växel: " + femkrona);
        System.out.println("Antal tvåkronor i växel: " + tvokrona);
        System.out.println("Antal enkronor i växel: " + enkrona);






    }
}
