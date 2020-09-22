/*Kurs: 1IK143
Laboration: Labb5:2
Kursdeltagare: Karl Nilros
HT18 och 2018-10-12*/

import java.util.Scanner;

public class uppgift2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int summa = 0;
        int[] hastighter = new int[5];
        System.out.println("Bilhastigheter i Km.");
        System.out.println();

        for(int i = 0; i < hastighter.length;i++){
            System.out.print("Ange hastigheten i km : ");
            hastighter[i] =  in.nextInt();
        }
        for(int j = 0; j < hastighter.length; j++){
            summa += hastighter[j];
        }

        int hogsta = 0;

        for (int k = 0; k < hastighter.length ; k++) {
            if(hastighter[k] > hogsta){
                hogsta = hastighter[k];
            }

        }
        int minsta = hastighter[0];
        for (int x = 0; x < 5 ; x++) {
            if(hastighter[x] < minsta){
                minsta = hastighter[x];
            }
        }

        System.out.println("Högsta hastigheten är " + hogsta);
        System.out.println("Lägsta hastigheten är " + minsta);
        System.out.println("Medelhastigheten är " + (summa / 5));


    }
}
