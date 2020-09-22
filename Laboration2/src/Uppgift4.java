/*Kurs: 1IK143
Laboration: Labb2:4
Kursdeltagare: Karl Nilros
HT18 och 2018-09-19*/


import java.util.Random;
import java.util.Scanner;

public class Uppgift4 {
    public static void main(String[] args) {
        Scanner tagentbord = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Spela med doktorn");
        System.out.println("=====================\n");
        System.out.print("Redo att spela? ");

        String svar1 = tagentbord.next();

        if (svar1.equals("J")) {
            int t1 = rnd.nextInt(6) + 1;
            System.out.println("Du fick: " + t1);
            System.out.println("Vill du slå igen?");

            String svar2 = tagentbord.next();
            if (svar2.equals("J")) {
                int t2 = rnd.nextInt(6) + 1;
                System.out.println("Du slog " + t2 + " och har nu totalt " + (t1 + t2));

                int doktor1 = rnd.nextInt(6) + 1;
                System.out.println("Doktorn slog " + doktor1);
                int spelare = t1 + t2;

                if (doktor1 <= 3){
                    int doktor2 = rnd.nextInt(6) + 1;
                    System.out.println("Doktorn slår igen och får " + doktor2 + " totalt " + (doktor1 + doktor2));

                    int doktor =doktor1 + doktor2;


                    if(spelare < 10 && spelare > doktor){
                        System.out.println("Du vann!");
                    }
                    else if(doktor < 10 && doktor > spelare){
                        System.out.println("Doktorn vann!");
                    }
                    else if(doktor == spelare && doktor < 10 && spelare < 10){
                        System.out.println("Det blev lika!");
                    }
                    else if(spelare < 10 && doktor > 9){
                        System.out.println("Doktorn blev tjock! Du vann!");
                    }
                    else if(doktor < 10 && spelare >9){
                        System.out.println("Du blev tjock! Doktorn vann!");
                    }

                    }
                else if(doktor1 > 3 && spelare < doktor1){
                    System.out.println("Doktorn Vinner!");
                }
                else if (doktor1 > 3 && spelare > doktor1 && spelare < 10){
                    System.out.println("Du vann!");
                }
                else if (doktor1 > 3 && spelare > 9){
                    System.out.println("Du blev tjock! Doktorn vann!");
                }
                else if(doktor1 > 3 && spelare == doktor1){
                    System.out.println("Det blev lika!");
                }



            }else if(svar2.equals("N")){
                int doktor1 = rnd.nextInt(6) + 1;
                System.out.println("Doktorn slog " + doktor1);


                if (doktor1 <= 3){
                    int doktor2 = rnd.nextInt(6) + 1;
                    System.out.println("Doktorn slår igen och får " + doktor2 + " totalt " + (doktor1 + doktor2));

                    int doktor =doktor1 + doktor2;


                    if(t1 < 10 && t1 > doktor){
                        System.out.println("Du vann!");
                    }
                    else if(doktor < 10 && doktor > t1){
                        System.out.println("Doktorn vann!");
                    }
                    else if(doktor == t1 && doktor < 10 && t1 < 10){
                        System.out.println("Det blev lika!");
                    }
                    else if(t1 < 10 && doktor > 9){
                        System.out.println("Doktorn blev tjock! Du vann!");
                    }
                    else if(doktor < 10 && t1 >9){
                        System.out.println("Du blev tjock! Doktorn vann!");
                    }

                }
                else if(doktor1 > 3 && t1 < doktor1){
                    System.out.println("Doktorn Vinner!");
                }
                else if (doktor1 > 3 && t1 > doktor1 && t1 < 10){
                    System.out.println("Du vann!");
                }
                else if (doktor1 > 3 && t1 > 9){
                    System.out.println("Du blev tjock! Doktorn vann!");
                }
                else if(doktor1 > 3 && t1 == doktor1){
                    System.out.println("Det blev lika!");}
            }

            }

        else if (svar1.equals("N")) {
            System.out.println("Skit i det då!");
        }

    }
}
