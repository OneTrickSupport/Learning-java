/*Kurs: 1IK143
Laboration: Labb2:3
Kursdeltagare: Karl Nilros
HT18 och 2018-09-19*/


import java.util.Scanner;

public class Uppgift3 {
    public static void main(String[] args) {
        Scanner tagentbord = new Scanner(System.in);

        System.out.print("Ange nummret på en doktor: ");

        int svar = tagentbord.nextInt();

        switch (svar){
            case 1:
                System.out.println("Doktorn är William Hartnell");
                break;
            case 2:
                System.out.println("Doktorn är Patrick Troughton");
                break;
            case 3:
                System.out.println("Doktorn är Jon Pertwee");
                break;
            case 4:
                System.out.println("Doktorn är Tom Baker");
                break;
            case 5:
                System.out.println("Doktorn är Peter Davison");
                break;
            case 6:
                System.out.println("Doktorn är Colin Baker");
                break;
            case 7:
                System.out.println("Doktorn är Sylvester McCoy");
                break;
            case 8:
                System.out.println("Doktorn är Paul McGann");
                break;
            case 9:
                System.out.println("Doktorn är Christopher Eccleston");
                break;
            case 10:
                System.out.println("Doktorn är David Tennant");
                break;
            case 11:
                System.out.println("Doktorn är Matt Smith");
                break;
            case 12:
                System.out.println("Doktorn är Peter Capaldi");
                break;
            case 13:
                System.out.println("Doktorn är Jodie Whittaker");
                break;
                default:


        }




    }
}
