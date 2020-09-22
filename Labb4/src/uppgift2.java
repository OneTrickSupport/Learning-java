/*Kurs: 1IK143
Laboration: Labb4:2
Kursdeltagare: Karl Nilros
HT18 och 2018-10-05*/


import java.util.Scanner;

public class uppgift2 {
    public static String visaStarWars(){

        return"Star Wars is a current licensed theme introduced in 1999. The theme is based on material from the Star Wars franchise of films, cartoon series,\n" +
                "comic books, video games, and other media. The theme covers all eight main films, along with The Clone Wars movie and TV series,\n" +
                "the Star Wars: Rebels TV series, and anthology films such as Rogue One: A Star Wars Story. Also, some Expanded Universe sets have been released,\n" +
                "with four The Old Republic sets released in the second wave of 2012, the first and second wave of 2013, and one The Force Unleashed set released in 2008.\n" +
                "The current licence for LEGO Star Wars will end in 2022";


    }

    public static String LegoFriends(){
        return "Star Wars is a current licensed theme introduced in 1999. The theme is based on material from the Star Wars franchise of films, cartoon series,\n" +
                "comic books, video games, and other media. The theme covers all eight main films, along with The Clone Wars movie and TV series,\n" +
                "the Star Wars: Rebels TV series, and anthology films such as Rogue One: A Star Wars Story. Also, some Expanded Universe sets have been released,\n" +
                "with four The Old Republic sets released in the second wave of 2012, the first and second wave of 2013, and one The Force Unleashed set released in 2008.\n" +
                "The current licence for LEGO Star Wars will end in 2022";

    }

    public static String legoCity(){
        return"City is the thematic title under which most Town-related System sets were released from 2005 and onward.\n There are numerous sets that are associated with Construction, Police, Fire, Emergency, Train, Airport, Transportation, Cargo, Traffic, Coast Guard, Farm, Great Vehicles, Mining, and Space.\n European catalogs featured another theme called City in the years 1999 to 2000, which was referred to as City Center in American catalogs.";

    }

    public static String mineCraft(){
        return "Minecraft is a licensed theme introduced with the set 21102 Minecraft Microworld (a CUUSOO review qualifier) in June 2012.\n More sets arrived after it in September 2013 with the continuing license agreement between the LEGO Group and Mojang.\n [1] It is based on the popular indie sandbox game Minecraft. This theme introduced a new kind of figure: the Micro Mob.";

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int val = 0;

        do {

            System.out.println();
            System.out.println("Legoteman");
            System.out.println("=================");
            System.out.println();
            System.out.println("1. Star Wars");
            System.out.println("2. Lego Friends");
            System.out.println("3. Lego City");
            System.out.println("4. Minecraft");

            System.out.print("\nDitt val: ");
            val = Integer.parseInt(in.nextLine());

            if (val == 1) {
                System.out.println("\n" + visaStarWars() + "\n");
            } else if (val == 2) {
                System.out.println("\n" + LegoFriends() + "\n");
            } else if (val == 3) {
                System.out.println("\n" + legoCity() + "\n");
            } else if (val == 4){
                System.out.println("\n" + mineCraft() + "\n");
            }

        } while (val != 0);





    }

}
