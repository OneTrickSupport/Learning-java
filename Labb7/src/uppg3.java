import java.util.ArrayList;

public class uppg3 {
    public static void main(String[] args) {
        ArrayList<Djur> list = new ArrayList<Djur>();

        Fagel kungsorn = new Fagel("Kungsörn", "Aquila chrysaetos", 3.6, "kjak", true, true, "träd");
        Daggdjur goldenretriver = new Daggdjur("Golden Retriver", "Avifer aureus", 25.5, "vooof","vitgul", false);
        Reptil salamander = new Reptil("Salamander", "Salamandridae", 0.12, "spssss",  "fuktig", false);
        Fagel blames = new Fagel("Blåmes", "Cyanistes caeruleus", 0.23, "wiwiwi", true, true, "träd");
        Daggdjur ko = new Daggdjur("Ko", "Bos taurus", 1100.0, "muuu", "vitsvart", false );
        Reptil skoldpadda = new Reptil("Havslädersköldpadda", "Dermochelys corecea", 250.0, "äää", "vatten", false );

        list.add(kungsorn);
        list.add(goldenretriver);
        list.add(salamander);
        list.add(blames);
        list.add(ko);
        list.add(skoldpadda);

        list.sort(Djur::compareTo);

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i).getLatisktNamn() + " " + list.get(i).unikEgenskap());

        }





    }
}
