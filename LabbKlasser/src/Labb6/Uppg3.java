package Labb6;

public class Uppg3 {
    public static void main(String[] args) {

        PlanetMedManobjekt jupiter = new PlanetMedManobjekt("Jupiter", 5, 79, 223234, 123124,
                new Mane[]{new Mane("Europa", 3234), new Mane("Callisto", 4900)});


        PlanetMedManobjekt saturnus = new PlanetMedManobjekt();
        saturnus.setNamn("Saturnus");
        saturnus.setAphelium(151325783);
        saturnus.setPerihelium(1353572956);
        saturnus.setPlats(6);
        saturnus.setAntalmanar(62);

        saturnus.addMane(new Mane("Titan", 5132));
        saturnus.addMane(new Mane("Mimas", 396));

       System.out.println("Planeten heter " + jupiter.getNamn() + " och har följande månar:");

       for (int i = 0; i < jupiter.getInlagdamanar() ; i++) {
            System.out.println("Måne " + (i+1) + " heter " + jupiter.showManar()[i].getNamn());

        }
        System.out.println("Planeten heter " + saturnus.getNamn() + " och har följande månar:");

        for (int i = 0; i < saturnus.getInlagdamanar() ; i++) {
            System.out.println("Måne " + (i+1) + " heter " + saturnus.showManar()[i].getNamn());

        }

    }
}
