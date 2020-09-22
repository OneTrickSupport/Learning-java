/*Kurs: 1IK143
Laboration: Labb5:5
Kursdeltagare: Karl Nilros
HT18 och 2018-10-12*/

import java.util.Random;

public class uppgift5 {
    public static int Myran() {
        Random rnd = new Random();

        int schakbräde[][] = new int[8][8];

        int x = rnd.nextInt(8);
        int y = rnd.nextInt(8);

        schakbräde[x][y] = 1;

        int steg = 0;
        int total = 1;


        while (total < 64) {
            int slump = rnd.nextInt(4) + 1;
            switch (slump) {
                case 1:
                    if (x + 1 != 8) {
                        x = x + 1;
                    } else steg--;
                    break;
                case 2:
                    if (x - 1 != -1) {
                        x = x - 1;
                    } else steg--;
                    break;
                case 3:
                    if (y + 1 != 8) {
                        y = y + 1;
                    } else steg--;
                    break;
                case 4:
                    if (y - 1 != -1) {
                        y = y - 1;
                    } else steg--;
                    break;
                default:

            }
            steg++;
            if (schakbräde[x][y] != 1) {
                schakbräde[x][y] = 1;
                total += 1;
            } else
                schakbräde[x][y] = 1;
        }

        //for (int i = 0; i < schakbräde.length ; i++) {
        //for (int j = 0; j < schakbräde[i].length ; j++) {
        //  System.out.print(schakbräde[i][j]);
        //System.out.print(" ");
        //}
        //System.out.println();

        //}
        return steg;
    }

    public static void main(String[] args) {
        System.out.println("Myran");
        System.out.println("=====");
        System.out.println();

        for (int i = 1; i < 11; i++) {
            System.out.println("Antal steg i varv " + i + ": " + Myran());

        }
    }

}
