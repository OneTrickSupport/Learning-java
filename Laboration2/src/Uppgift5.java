/*Kurs: 1IK143
Laboration: Labb2:5
Kursdeltagare: Karl Nilros
HT18 och 2018-09-19*/

import java.util.Scanner;

public class Uppgift5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ange radien på planeten i km: ");

        int radien = input.nextInt();

        double volym = (4 * Math.PI * Math.pow(radien, 3)) / 3;

        System.out.printf("Volymen blir %1.2e kubikkilometer" , volym);


    }
}
