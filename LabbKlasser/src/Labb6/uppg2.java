package Labb6;

public class uppg2 {
    public static void main(String[] args) {

        planetM Saturnus = new planetM("Saturnus", 6, 62, 1513325783, 1353572956);
        planetM Jupiter = new planetM("Jupiter", 7, 69, 816520800, 740573600);

        Saturnus.addMane("Titan");
        Saturnus.addMane("Japetus");
        Jupiter.addMane("Europa");
        Jupiter.addMane("Harpalyke");

        System.out.println("Planeten heter " + Jupiter.getNamn() + " och har följande månar:");

        for (int i = 0; i < Jupiter.getInlagdamanar() ; i++) {
            System.out.println("Måne " + (i+1) + " heter " + Jupiter.showManar()[i]);
        }







        //System.out.println();
        //for (int i = 0; i < Saturnus.getInlagdamanar() ; i++) {
        //    System.out.println(Saturnus.showManar()[i]);
        //}









    }
}
