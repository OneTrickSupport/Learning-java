package Lektion2;

import java.util.Random;
import java.util.Scanner;

public class uppg7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Ange lägsta tal");
        int min = in.nextInt();

        System.out.println("Ange högsta tal");
        int max = in.nextInt();

        if (min > max) {
            int tmp = min;
            min = max;
            max = tmp;
        }

        int slumptal = rnd.nextInt(max) + min;
        System.out.println("DU fick: " + slumptal);


    }
}
