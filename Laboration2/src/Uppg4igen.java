/*Kurs: 1IK143
Laboration: Labb2:4
Kursdeltagare: Karl Nilros
HT18 och 2018-09-19*/


import java.util.Random;
import java.util.Scanner;

public class Uppg4igen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Spela med doktorn");
        System.out.println("=====================\n");
        System.out.print("Redo att spela? (J/N) ");

        int t1 = rnd.nextInt(6) + 1;
        int t2 = rnd.nextInt(6) + 1;
        int summa;
        int doktor;
        String svar1 = input.next();

        if(svar1.equals("J")) {
            System.out.println("Du fick " + t1);
            System.out.println("Vill du slå igen? (J/N)");
        }
        if(svar1.equals("N")){
            System.out.println("Skit i det då!");
        }
        String svar2 = input.next();
        if(svar2.equals("J")){
            System.out.println("Du slog " + t2 + " och har nu totalt " + (t1 +t2));
            summa = (t1 + t2);
        }
        else
            summa = t1;

        int doktor1 = rnd.nextInt(6) + 1;
        int doktor2 = rnd.nextInt(6) + 1;
        System.out.println("Doktorn slog " + doktor1);

        //Inte lönt att doktorn slår igen om spelaren redan är tjock eller doktorn redan vunnit

        if(doktor1 < 4 && doktor1 <= summa && summa < 10){
            System.out.println("Doktorn slår igen och får " + doktor2 + " totalt " + (doktor1 + doktor2));
            doktor = (doktor1 + doktor2);
        }
        else
            doktor = doktor1;

        if(summa > 9){
            System.out.println("Du blev tjock, så doktorn vann!");
        }
        else if(summa > doktor){
            System.out.println("Du vann!");
        }
        else if(doktor > summa){
            System.out.println("Doktorn vann!");
        }
        else if(doktor == summa){
            System.out.println("Det blev lika!");
        }




    }
}
