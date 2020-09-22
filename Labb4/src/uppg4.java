/*Kurs: 1IK143
Laboration: Labb4:4
Kursdeltagare: Karl Nilros
HT18 och 2018-10-05*/

import java.util.Scanner;

public class uppg4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int knopplangd = 1;
        String antalStreck;

        while (knopplangd != 0) {
            System.out.println();
            System.out.print("Ange antal knoppar i sidled (0 för att avsluta): ");
            knopplangd = in.nextInt();
            if(knopplangd == 0){
                break;
            }
            System.out.print("Antal knoppar i höjdled: ");
            int knopphojd = in.nextInt();
            Legobyggare(knopplangd, knopphojd);


        }
    }
    public static void Legobyggare(int langd, int hojd){
        for(int i = 0; i < (langd * 2) + 1; i++) {
            System.out.print("-");
        }

        for(int j = 0; j < hojd; j++){

                System.out.print("\n|");


            for(int k = 0; k < langd; k++){
                System.out.print("O");
                if(k + 1 < langd){
                    System.out.print(" ");
                }

                if(k + 1 == langd){
                    System.out.print("|");
                }
            }


        }
        System.out.println();
            for(int x = 0; x < (langd * 2) + 1; x++){
            System.out.print("-");
        }
    }
}



