/*Kurs: 1IK143
Laboration: Labb3:6
Kursdeltagare: Karl Nilros
HT18 och 2018-09-28*/

import java.util.Scanner;

public class uppgift6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Hur stort prisma vill du ha? ");

        int svar = in.nextInt();

        for(int i = 0; i < svar; i++){
            for(int j = 0; j < svar - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2* i + 1); k++){
                    System.out.print("*");
            }
            System.out.println();
        }































    }
}
