/*Kurs: 1IK143
Laboration: Labb2:2
Kursdeltagare: Karl Nilros
HT18 och 2018-09-19*/


import java.util.Scanner;

public class Uppgift2 {
    public static void main(String[] args) {
        Scanner tagentbord = new Scanner(System.in);

        System.out.print("Ange ett år: ");

        int svar = tagentbord.nextInt();

        if (svar < 1963){
            System.out.println("Det var innan Doctor Who");
        }
        else if (svar >= 1963 && svar <= 1989){
            System.out.println("Under den ursprungliga serien");
        }
        else if (svar > 1989 && svar < 2005){
            System.out.println("Inte mycket Doctor Who det året...");
        }
        else if (svar >= 2005 && svar <=2020){
            System.out.println("Den nya serien av Doctor Who visas");
        }
        else if (svar > 2020){
            System.out.println("Vi vet inte men man kan alltid hoppas");
        }



    }
}
