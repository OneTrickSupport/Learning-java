/*Kurs: 1IK143
Laboration: Labb1:5
Kursdeltagare: Karl Nilros
HT18 och 2018-09-12*/


import java.util.Scanner;

public class Uppgift5 {
    public static void main(String[] args) {
        Scanner tagentbord = new Scanner(System.in);
        double hojd;
        double bredd;

        System.out.print("Hur hög är Asimov boken? ");
        hojd = tagentbord.nextDouble();
        System.out.print("Hur bred är Asimov boken? ");
        bredd = tagentbord.nextDouble();

        System.out.println("Boken har en omkrets på " + ((bredd + bredd + hojd + hojd) / 100) + " decimeter." );
        System.out.println("Arean för boken är " + ((hojd * bredd) / 10000) + " kvadratdecimeter");



    }
}
