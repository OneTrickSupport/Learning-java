/*Kurs: 1IK143
Laboration: Labb2:6
Kursdeltagare: Karl Nilros
HT18 och 2018-09-19*/


import java.util.Scanner;

public class Uppgift6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Vad heter första kompanjonen: ");
        String medhjalpare1 = input.nextLine();

        System.out.print("Den andra?: ");
        String medhjalpare2 = input.nextLine();

        System.out.print("Den tredje?: ");
        String medhjalpare3 = input.nextLine();

        int j1 = medhjalpare1.compareTo(medhjalpare2);
        int j2 = medhjalpare1.compareTo(medhjalpare3);
        int j3 = medhjalpare2.compareTo(medhjalpare3);



        if(j1 < 0 && j3 < 0){
            System.out.println("Ordningen är " + medhjalpare1 + ", " + medhjalpare2 + " och " + medhjalpare3);
        }
        else if(j1 < 0 && j3 > 0 && j2 < 0){
            System.out.println("Ordningen är " + medhjalpare1 + ", " + medhjalpare3 + " och " + medhjalpare2);
        }
        else if(j1 > 0 && j3 < 0){
            System.out.println("Ordningen är " + medhjalpare2 + ", " + medhjalpare1 + " och " + medhjalpare3);
        }
        else if(j3 > 0 && j2 > 0 && j1 < 0){
            System.out.println("Ordningen är " + medhjalpare3 + ", " + medhjalpare1 + " och " + medhjalpare2);
        }
        else if (j3 > 0 && j1 > 0){
            System.out.println("Ordningen är " + medhjalpare3 + ", " + medhjalpare2 + " och " + medhjalpare1);
        }
        else if(j1 < 0 && j3 > 0 && j2 > 0){
            System.out.println("Ordningen är " + medhjalpare2 + ", " + medhjalpare3 + " och " + medhjalpare1);
        }






    }
}
