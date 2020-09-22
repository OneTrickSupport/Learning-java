/*Kurs: 1IK143
Laboration: Labb4:5
Kursdeltagare: Karl Nilros
HT18 och 2018-10-05*/


import java.util.Scanner;

public class uppg5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String losenord;

       do {
           System.out.println("Ange ett tänkt lösenord, eller \"avsluta\" för att avsluta: ");

           losenord = in.nextLine();
           if (losenKontroll(losenord))
               System.out.println("Godkänt!");
           else
               System.out.println("Ej godkänt!");
       } while (!losenord.equals("avsluta"));
    }



    public static boolean losenKontroll(String losen){

        int siffror = 0; //minst 4
        int andratecken = 0; // minst 2
        int versaler = 0; //minst 2
        char c;

        if(losen.length() < 8){
            return false;
        }
        for(int i = 0; i < losen.length(); i++){
            c = losen.charAt(i);
            if(!Character.isDigit(c)){
                siffror ++;
            }
            if(c > 32 && c < 47 || c == 64){
                andratecken++;
            }
            if(Character.isUpperCase(c)){
                versaler++;
            }

        }
        if(siffror > 3 && andratecken > 1 && versaler > 1){
            return true;
        }else return false;
    }
}
