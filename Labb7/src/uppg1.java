public class uppg1 {
    public static void main(String[] args) {

        Fagel kungsorn = new Fagel("Kungsörn", "Aquila chrysaetos", 3.6, "kjak", false, true, "träd");
        Daggdjur goldenretriver = new Daggdjur("Golden Retriver", "Avifer aureus", 25.5, "vooof", "vitgul", false);
        Reptil salamander = new Reptil("Salamander", "Salamandridae", 0.12, "spssss", "fuktig", false);


        System.out.println(kungsorn.getNamn() + " säger: " + kungsorn.ljud());
        System.out.println(goldenretriver.getNamn() + " säger: " + goldenretriver.ljud());
        System.out.println(salamander.getNamn() + " säger: " + salamander.ljud());


    }
}
