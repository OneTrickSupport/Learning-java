import java.util.Random;
import java.util.Scanner;

public class lekaMedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        int magisktNummer = rnd.nextInt(100) + 1;
        int Gissning = -1;

        System.out.println("Gissa på ett magiskt tal mellan 0-100");

        while (Gissning != magisktNummer){
            Gissning = input.nextInt();

            if(magisktNummer == Gissning){
                System.out.println("Det var rätt! Det magiska nummret är: " + magisktNummer);
            }
            else if(magisktNummer < Gissning){
                System.out.println("Din gissning var för hög, försök igen med något mindre");
            }
            else
                System.out.println("Din gissning var för låg, försök igen med något större");
        }
    }
}
