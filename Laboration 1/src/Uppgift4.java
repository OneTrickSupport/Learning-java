/*Kurs: 1IK143
Laboration: Labb1:4
Kursdeltagare: Karl Nilros
HT18 och 2018-09-12*/

import java.util.Scanner;

public class Uppgift4 {
    public static void main(String[] args) {
        int svar;
        Scanner tagentbord = new Scanner(System.in);
        System.out.print("Hur många böcker av Isaac Asimov vill du ha? ");

        svar = tagentbord.nextInt();
        System.out.println("Du ville ha " + svar + " böcker.");
    }
}
