package Labb2;

import java.util.NoSuchElementException;

public class uppg1 {
    public static void main(String[] args) throws NoSuchElementException {
        Kedja<String> enKedja = new Kedja<>();
        enKedja.addFirst("Itzamn");
        enKedja.addFirst("Kinich Ahau");
        enKedja.addFirst("Chaac");
        enKedja.addFirst("Bolon Dzacab");
        enKedja.addLast("Bacabs");
        enKedja.addAt(4, "Ek Chuah");
        System.out.println(enKedja.getHuvud());
        System.out.println();
        for(String s: enKedja) {
            System.out.println(s);
        }
        System.out.println("Storlek: " + enKedja.getSize());
        enKedja.removeAt(4);
        System.out.println();
        for (String s: enKedja) {
            System.out.println(s);
        }
        System.out.println("Storlek: " + enKedja.getSize());
    }
}
