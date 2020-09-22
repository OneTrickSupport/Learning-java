/*Kurs: 1IK143
Laboration: Labb4:3
Kursdeltagare: Karl Nilros
HT18 och 2018-10-05*/

import java.util.Scanner;


public class uppg3 {

    public static double konvertera(double summa, String valuta){
        valuta = valuta.toLowerCase();

        if (valuta.equals("svenska")){
            summa = summa * 1.3930;
        }else if (valuta.equals("danska")){
            summa = summa * 0.71778;
        }
        return summa;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String Svarvaluta;
        double kronorsvar;

        System.out.print("Till vilken valuta vill du konvertera? ");
        Svarvaluta = in.nextLine();
        System.out.print("Hur mycket vill du konvertera? ");
        kronorsvar = in.nextDouble();

        Svarvaluta = Svarvaluta.toLowerCase();



        System.out.print("Du kommer få " + konvertera(kronorsvar, Svarvaluta) + " " + Svarvaluta + " kronor ");
    }
}
