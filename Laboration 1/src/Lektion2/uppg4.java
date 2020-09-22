package Lektion2;

import java.util.Scanner;

public class uppg4 {
    public static void main(String[] args) {
        Scanner tagentbord = new Scanner(System.in);

        System.out.println("Skriv \"Pink Floyd\": ");
        String svar = tagentbord.nextLine();

        if(svar.equals("Pink Floyd")) {
            System.out.println("Det var rätt");
        }
        else {
            System.out.println("Det var fel!");
        }
    }
}
