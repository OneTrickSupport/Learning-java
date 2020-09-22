/*Kurs: 1IK143
Laboration: Labb3:5
Kursdeltagare: Karl Nilros
HT18 och 2018-09-28*/

import java.util.Random;
import java.util.Scanner;

public class uppgift5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        String abc = "ABCDEFGHJKLMNOPRSTUVWXY";
        String abc2 = "ABCDEFGHJKLMNOPRSTUVWXYZ";

        System.out.print("Hur många registreringsnummer önskas? ");
        int svar = in.nextInt();

        for (int i = 0; i < svar; i++){
            for (int j = 0; j < 2; j++){
                char letter = abc.charAt(rnd.nextInt(abc.length()));
                System.out.print(letter);
            }
            for (int x = 0; x < 2; x++){
                int number = rnd.nextInt(9) + 1;
                System.out.print(number);
            }
            System.out.print(" ");
            for (int y = 0; y < 3; y++){
                char letter = abc2.charAt(rnd.nextInt(abc2.length()));
                System.out.print(letter);
            }
            System.out.println();

        }
    }
}
