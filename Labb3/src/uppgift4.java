/*Kurs: 1IK143
Laboration: Labb3:4
Kursdeltagare: Karl Nilros
HT18 och 2018-09-28*/

import java.util.Random;

public class uppgift4 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int ett = 0;
        int tva = 0;
        int tre = 0;
        int fyr = 0;
        int fem = 0;
        int sex = 0;

        for (int i = 0; i < 500; i++){
            int slag = rnd.nextInt(6) + 1;

            if (slag == 1){
                ett++;
            }
            else if (slag == 2){
                tva++;
            }
            else if (slag == 3){
                tre++;
            }
            else if (slag == 4){
                fyr++;
            }
            else if (slag == 5){
                fem++;
            }
            else {
                sex++;
            }

        }
        System.out.print("Ettor: (" + ett + "):");
        for (int j = 0; j < ett; j++){
            System.out.print("*");
        }
        System.out.print("\nTvåor: (" + tva + "):");
        for (int k = 0; k < tva; k++){
            System.out.print("*");
        }
        System.out.print("\nTreor: (" + tre +"):" );
        for (int x = 0; x < tre; x++){
            System.out.print("*");
        }
        System.out.print("\nFyror: (" + fyr +"):" );
        for (int y = 0; y < fyr; y++){
            System.out.print("*");
        }
        System.out.print("\nFemmor:(" + fem +"):" );
        for (int z = 0; z < fem; z++){
            System.out.print("*");
        }
        System.out.print("\nSexor: (" + sex +"):" );
        for (int q = 0; q < sex; q++){
            System.out.print("*");
        }
    }
}
