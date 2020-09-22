package Lektion2;

import java.util.Scanner;

public class uppg5 {
    public static void main(String[] args) {
        Scanner tagentbord = new Scanner(System.in);

        System.out.println("Ange nytt lösenord" );
        String losen = tagentbord.nextLine();

        if(losen.equals("password")) {
            System.out.println("Vill du verkligen ha det? (J/N) ");
            String svar = tagentbord.nextLine();

            if(svar.equals("J")){
                System.out.println("Idiot");
            } else {
                System.out.println("försök igen: ");
                losen = tagentbord.nextLine();
            }
        }
        System.out.println("Okej, ditt lösenord är " + "\"" + losen + "\"");

    }
}
