import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class uppg4 {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int val= 0;
        File enFil = new File("Djurdokumentet");
        Scanner filScanner = new Scanner(enFil);
        ArrayList<Djur> djurLista = new ArrayList<>();

        filScanner.useDelimiter("[,\\n]");
        try {
            while (filScanner.hasNext()){
                String valObjekt = filScanner.next();
                if (valObjekt.equals("D")) {
                    String namn = filScanner.next();
                    String latin = filScanner.next();
                    double vikt = Double.parseDouble(filScanner.next());
                    String palsFarg = filScanner.next();
                    String harVinterpals = filScanner.next();
                    boolean harVinterPals2 = Boolean.parseBoolean(harVinterpals);
                    String late = filScanner.nextLine();

                    djurLista.add(new Daggdjur(namn, latin, vikt, palsFarg, harVinterPals2, late));
                } else if (valObjekt.equals("F")) {
                    String namn = filScanner.next();
                    String latin = filScanner.next();
                    double vikt = Double.parseDouble(filScanner.next());
                    String arFlyttfagel = filScanner.next();
                    boolean arFlyttfagel2 = Boolean.parseBoolean(arFlyttfagel);
                    String kanflyga = filScanner.next();
                    boolean kanFlyga2 = Boolean.parseBoolean(kanflyga);
                    String redtyp = filScanner.next();
                    String late = filScanner.nextLine();

                    djurLista.add(new Fagel(namn, latin, vikt, arFlyttfagel2, kanFlyga2, redtyp, late));

                } else if (valObjekt.equals("R")) {
                    String namn = filScanner.next();
                    String latin = filScanner.next();
                    double vikt = Double.parseDouble(filScanner.next());
                    String levnadsmiljo = filScanner.next();
                    String giftig = filScanner.next();
                    boolean giftig2 = Boolean.parseBoolean(giftig);
                    String late = filScanner.nextLine();
                    djurLista.add(new Reptil(namn, latin, vikt, levnadsmiljo, giftig2, late));
                }
            }
            java.util.Collections.sort(djurLista);
            //djurLista.sort(Djur::compareTo);


        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        do {
            val = meny();

            if (val == 1) {
                if (enFil.exists()) {
                    for (Djur d : djurLista) {
                        System.out.println(d.toString());
                    }
                }

            } else if (val == 2) {

                scanner2.useDelimiter("\n");
                System.out.println("Vilket slags djur vill du skapa?");
                System.out.println("1. Däggdjur ");
                System.out.println("2. Reptil");
                System.out.println("3. Fagel ");
                int val2 = scan.nextInt();
                if (enFil.exists()) {
                    System.out.print("Skriv namn: ");
                    String namn = scanner2.next();
                    System.out.print("Skriv latinsktnamn: ");
                    String latinsktnamn = scanner2.next();
                    System.out.print("Skriv vikt: ");
                    double vikt = scanner2.nextDouble();
                    if (val2 == 1) {
                        System.out.print("Skriv pälsfärg: ");
                        String palsfarg = scanner2.next();
                        System.out.print("Har den vinterpäls? (J/N): ");
                        boolean vinterpals = true;
                        if (scan.nextLine().equals("J")) {
                        } else if (scan.nextLine().equals("N")) {
                            vinterpals = false;
                        }
                        System.out.print("Skriv late: ");
                        scanner2.nextLine();
                        String ljud = "," + scanner2.nextLine();
                        djurLista.add(new Daggdjur(namn, latinsktnamn, vikt, palsfarg, vinterpals, ljud));
                    } else if (val2 == 2) {

                        System.out.print("Skriv levnadsmiljö: ");
                        String levnadsmiljo = scanner2.next();
                        System.out.print("Är den giftig? (J/N): ");
                        boolean giftig = true;
                        if (scan.nextLine().equals("J")) {
                        } else if (scan.nextLine().equals("N")) {
                            giftig = false;
                        }
                        System.out.print("Skriv late: ");
                        scanner2.nextLine();
                        String ljud = "," + scanner2.nextLine();
                        djurLista.add(new Reptil(namn, latinsktnamn, vikt, levnadsmiljo, giftig, ljud));
                    } else if (val2 == 3) {
                        System.out.println("Är det en flyttfågel?(J/N): ");
                        boolean flytt = true;
                        if (scan.nextLine().equals("J")) {
                        } else if (scan.nextLine().equals("N")) {
                            flytt = false;
                        }
                        System.out.println("Kan den flyga? (J/N): ");
                        boolean flyga = true;
                        if (scan.nextLine().equals("J")) {
                        } else if (scan.nextLine().equals("N")) {
                            flyga = false;
                        }
                        System.out.println("Vad är redtypen?: ");
                        String redtyp = scanner2.next();
                        System.out.print("Skriv late: ");
                        scanner2.nextLine();
                        String ljud = "," + scanner2.nextLine();
                        djurLista.add(new Fagel(namn, latinsktnamn, vikt, flytt, flyga, redtyp, ljud));

                    }
                }
                java.util.Collections.sort(djurLista);
                //djurLista.sort(Djur::compareTo);


            }

        } while (val != 3);
        if (val == 3) {

            try (PrintWriter pw = new PrintWriter(enFil)) {
                for (Djur d : djurLista) {
                    pw.println(d.export());
                }
            } catch (IOException ioe) {
                System.out.println("Fel");
            }

            System.out.println("Du ville avsluta");

        }
    }


    public static int meny() {

        Scanner scan = new Scanner(System.in);
        System.out.println("\n" + "Djurmeny\n=========");

        System.out.println("1. Visa djur i ordning");
        System.out.println("2. Lägg till ett djur");
        System.out.println("3. Avsluta\n");
        System.out.print("Gor ditt val -------->");
        int val = scan.nextInt();
        return val;
    }


}

