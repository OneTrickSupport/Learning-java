/*Kurs: 1IK143
Laboration: Labb2:1
Kursdeltagare: Karl Nilros
HT18 och 2018-09-19*/

import java.util.Scanner;

public class Uppgift1 {
    public static void main(String[] args) {
        Scanner tagentbord = new Scanner(System.in);

        System.out.println("Vilken Temperatur är det? ");

        int svar = tagentbord.nextInt();

        if(svar <= 15){
            System.out.println("Doktorn fryser!");
        }
        else if (svar > 15){
            System.out.println("Doktorn fryser inte!");
        }



    }
}
