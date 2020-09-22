package Lektion2;

import java.util.Scanner;

public class uppg3 {
    public static void main(String[] args) {
        Scanner tagentbor = new Scanner(System.in);

        System.out.println("Skriv in en siffra");
        int svar = tagentbor.nextInt();

        if(svar >= 0 && svar <= 9) {
            System.out.println("Mellan 1 och 9");
        }
        else if(svar >=10 && svar <= 19) {
            System.out.println("Mellan 10 och 19");
        }
        else if(svar >= 20){
            System.out.println("över 20");
        }
        else if(svar < 0){
            System.out.println("mindre än 0");
        }
    }
}
