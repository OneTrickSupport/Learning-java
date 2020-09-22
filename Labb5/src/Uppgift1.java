/*Kurs: 1IK143
Laboration: Labb5:1
Kursdeltagare: Karl Nilros
HT18 och 2018-10-12*/

import java.util.Scanner;

public class Uppgift1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] talen = new int[4];
        int summa = 0;

        System.out.print("Skriv in fyra heltal ");
        for(int i = 0; i < talen.length;i++){
            talen[i] = scan.nextInt();
            summa += talen[i];

        }
        System.out.println(summa);

    }
}
