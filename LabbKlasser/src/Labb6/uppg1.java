package Labb6;

public class uppg1 {
    public static void main(String[] args) {

        Planet jorden = new Planet("Jorden", 3, 1, 152097701, 147098074);
        Planet Mars = new Planet();

        Mars.setNamn("Mars");
        Mars.setPlats(4);
        Mars.setManar(2);
        Mars.setAphelium(249209300);
        Mars.setPerihelium(206669000);

        System.out.println(jorden.getNamn() + "\n Plats: " + jorden.getPlats() + "\n Månar: " + jorden.getManar() + "\n Aphelium: " + jorden.getAphelium() + " km" + "\n Perihelium: " + jorden.getPerihelium() + " km");
        System.out.println();
        System.out.println(Mars.getNamn() + "\n Plats: " + Mars.getPlats() + "\n Månar: " + Mars.getManar() + "\n Aphelium: " + Mars.getAphelium() + " km" + "\n Perihelium: " + Mars.getPerihelium() + " km");
    }

}
