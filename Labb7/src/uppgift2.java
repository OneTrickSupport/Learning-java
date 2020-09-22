import java.util.ArrayList;

public class uppgift2 {
    public static void main(String[] args) {
        ArrayList<Djur> lista = new ArrayList<Djur>(3);

        Fagel kungsorn = new Fagel("Kungsörn", "Aquila chrysaetos", 3.6, "kjak", false, true, "träd");
        Daggdjur goldenretriver = new Daggdjur("Golden Retriver", "Avifer aureus", 25.5, "vooof", "vitgul", false);
        Reptil salamander = new Reptil("Salamander", "Salamandridae", 0.12, "spssss", "fuktig", false);


        lista.add(kungsorn);
        lista.add(goldenretriver);
        lista.add(salamander);

        for (int i = 0; i < lista.size() ; i++) {
            System.out.println("En " + lista.get(i).getLatisktNamn() + " väger " + lista.get(i).getVikt() + " och säger " + lista.get(i).getLate());

        }




    }
}
