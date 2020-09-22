/*Kurs: 1IK143
Laboration: Labb5:3
Kursdeltagare: Karl Nilros
HT18 och 2018-10-12*/

import java.util.Scanner;

public class uppgift3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ange hur många tal som ska läsas in ");
        int svar = scan.nextInt();
        int[] tal = new int[svar];


        for (int i = 0; i < tal.length; i++) {
            System.out.print("Ange tal " + (i +1) + " av " + svar +" ");
            tal[i] = scan.nextInt();
        }

        int[] baklanges = new int[svar];

        for(int j = 0, x = svar; j < tal.length; j++, x--){
            baklanges[x-1] = tal[j];
        }
        System.out.print("Talen i omvänd ordning blir: ");
        for(int z = 0; z < baklanges.length;z++){
            if(z > 0){
                System.out.print(", ");
            }
            System.out.print(baklanges[z]);
        }
    }
}
