package Lektion2;

import java.util.Scanner;

public class uppg2 {
    public static void main(String[] args) {
        Scanner tagentbord = new Scanner(System.in);

        System.out.println("Skriv en siffra: ");
        int tal = tagentbord.nextInt();

        if (tal > 0) {
            System.out.println("Större än 0");
        }
        else if (tal < 0) {
            System.out.println("MIndre än 0");
        }


    }
}
