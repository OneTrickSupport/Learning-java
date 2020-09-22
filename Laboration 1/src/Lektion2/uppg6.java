package Lektion2;

import java.util.Random;
import java.util.Scanner;

public class uppg6 {
    public static void main(String[] args) {
        Scanner tagentbord = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("1, 2 eller 3 SLumptal?");
        int antal = tagentbord.nextInt();

        switch (antal){
            case 1:
                int slump = rnd.nextInt(100 ) + 1;
                System.out.println(slump);
                break;
            case 2:
                System.out.println(1 + rnd.nextInt(100));
                System.out.println(1 + rnd.nextInt(100));
                break;
            case 3:
                System.out.println(1 + rnd.nextInt(100));
                System.out.println(1 + rnd.nextInt(100));
                System.out.println(1 + rnd.nextInt(100));
                break;
                default:
                    System.out.println("Det blev fel");
        }
    }
}
