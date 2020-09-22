package Lektion2;

import java.util.Scanner;

public class Uppg1 {
    public static void main(String[] args) {
        Scanner tagentbord = new Scanner(System.in);

        System.out.println("Skriv in en siffra: ");
        int nummer = tagentbord.nextInt();

        if (nummer == 64)
            System.out.println("Bra gjort!");

    }
}
