/*Kurs: 1IK143
Laboration: Labb3:3
Kursdeltagare: Karl Nilros
HT18 och 2018-09-28*/

import java.util.Random;
import java.util.Scanner;

public class uppgift3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int resultat = 0;

        System.out.print("Roger waters frågar, hur många tärningar? ");

        int svar = in.nextInt();

        for (int i = 0; svar > i; i++){
            int kast = rnd.nextInt(6) + 1;
            resultat = resultat + kast;
            System.out.print(kast);

            if (i + 1 < svar){
                System.out.print(" + ");
            }
        }
        System.out.print(" = " + resultat);


    }
}
