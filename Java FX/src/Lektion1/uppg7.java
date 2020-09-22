package Lektion1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.ArrayList;

public class uppg7 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        ArrayList<NordiskGud> gudar = new ArrayList();

        NordiskGud oden = new NordiskGud("Oden", "Ase", "Oden eller Odin, på fornnordiska Óðinn, på fornengelska Wōden, fornsaxiska UUôden,[1], på fornhögtyska Uuodan, från urgermanskans rekonstruerade Wōdanaz, är den äldste, störste och visaste av asagudarna i den nordiska mytologin. Han är också krigsgud, skaldekonstens gud och de dödas gud, och är den främste utövaren av sejdkonsten. Namnet Oden har samma etymologiska grund som Od, Frejas försvunne make. Oden hade också flera andra namn, såsom Gangleri (\"Den färdtrötte\"), se vidare lista över namn på Oden. Under namnet Jolnir (\"Julner\") eller Jolfoðr (\"Julfader\") är Oden känd som julens speciella gud. Några namn har tillkommit genom bruket av kenningar i den forntida diktningen, Oden har över 200 namn och smeknamn. Hos nordborna och anglosaxarna ansågs Oden vara runornas skapare. Oden verkar även varit associerad till nekromantik och läkekonst." );
        NordiskGud tor = new NordiskGud("Tor", "Ase", "Tor (fornnordiska Þórr, svenska dialekter Tor, fornhögtyska Donar, fornengelska Þunor, samtliga avledningar från ett urgermanskt Þunraz* eller möjligen Þundaraz*) var en forngermansk åskgud som dyrkades av germaner i norden och på kontinenten. Han var en av asatrons främsta gudar. Namnet på guden och på åskan som sådan var ursprungligen synonyma ( jämför engelskans \"thunder\", lågtyskans och svenskans \"dunder\" och högtyskans \"donner\").");
        NordiskGud loke = new NordiskGud("Loke", "Ase", "Loke (fornnordiska Loki, svenska dialekter & danska dialekter Locke) är en av asagudarna i nordisk mytologi, trots att han var son till en jätte. I den äldre Poetiska Eddan förekommer Loke i flera av dikterna och är en central figur i några av dem. Namnet Loke har ännu, trots många försök, inte tolkats etymologiskt övertygande.[1] En teori går dock ut på att namnet är kopplat till ett fornnordiskt ord med betydelsen \"stänga\"/\"slutföra\", vilket då skulle kunna hänsyfta på hans roll som den som frambringar undergången och slutet i Ragnarök. Anna Birgitta Rooth menade att Loke från början var en spindel, och hänvisade bland annat till hans dialektala namn \"Locke\" och Lockespindlar[2]. Vissa forskare menar att Loke är identisk med Lodur som också är bror till Oden. Anledningen till detta är att Lodur aldrig nämns i någon annan berättelse än skapelsen av Yggdrasil och människorna. Dock så nämns Loke ofta ihop med Oden och Höner som en trio, som i dikten Reginsmál, berättelsen om Tjatse och den Färöiska folksagan Loka Táttur. I den sistnämnda beskrivs Loke som en positiv (men slug som alltid) figur. Problemet som forskare har med den teorin är att Lokes handlingar längre fram i den Prosaiska Eddan och Loketrätan inte verkar gå ihop med en positiv figur som Lodur. I 1300-talsverket \"Lokrur\" så benämns dock Loke och Lodur som densamme och flera teorier om detta betyder att författarna var bekanta med en likställning från en oral tradition eller dragit slutsatsen från att ha läst Edda dikter finns.[3]");
        NordiskGud balder = new NordiskGud("Balder", "Ase", "Balder (fornnorska/fornisländska Baldr, isländska Baldur), vilket betyder \"den lysande\" eller \"herren\", är en gud i nordisk mytologi. Son till Oden och Frigg, make till Nanna och far till Forsete (\"Forseti\"). Balder bodde i Bredablick.\n" +
                "\n" +
                "Balder sades vara bäst av asar. Det var omöjligt att säga något ont om honom. Han var vacker, ljus, god, vis och omtyckt, men hans domar ägde inte bestånd. De andra gudarna brukade säga, att så länge de hade kvar Balder, kunde det inte gå alltför illa för dem. Därför blev de mycket rädda, när han började drömma mardrömmar om att han skulle bli mördad. Och trots alla deras ansträngningar blev det också så till slut. Efter Ragnarök skall dock Balder komma tillbaka från dödsriket tillsammans med sin bror Höder för att styra den nya världen.");
        NordiskGud frej = new NordiskGud("Frej", "Ase", "Frej tillhörde liksom sin syster och far vanerna, men bodde hos asarna som fredsgisslan efter kriget mellan de båda gudagrupperna. Att hans boning dessutom heter Alfhem tyder på ett samband mellan vaner och alver; båda är dessutom förknippade med fruktbarheten. Jämte Oden och Tor var han främst i kulten.");
        NordiskGud freja = new NordiskGud("Freja", "Ase", "Freja eller Fröja[1] (isländska/fornnordiska Freyja, Svenska dialekter Fröa, färöiska Froya) är en fruktbarhetsgudinna i nordisk mytologi. Hon är valkyriornas ledare samt vanernas viktigaste gudinna och har därför även namnet Vanadis. Hon är dotter till Njord (med språklig anknytning till fem. Nerthus), och syster till Frej (även kallad Frö).\n" +
                "\n" +
                "Hon kallas även \"Valfreja\" av Snorre, alltså \"de stupades Freja\" eller \"de stupades fru\".\n" +
                "\n" +
                "Orden Frej och Freja har betydelsen \"Herren\" (härskaren) och \"Frun\" (härskarinnan) och är ett syskonpar, inte ett gudapar såsom Frigga-Oden eller Gerd–Frej. Det har varit svårt att skilja mellan Freja och Frigg (se nedan) och dessutom har vissa forskare, exempelvis Hilda Ellis Davidson och Britt-Mari Näsström uppmärksammat att andra gestalter i den nordiska mytologin, såsom Gefjon, Gerd och Skade, skulle kunna vara Freja i andra roller.[2] Fröja äktar i Fjolsvinnsmål en inre aspekt av Oden kallad Svipdag vilken kommer till Valhall med segersvärdet vilket senare skänks till Frej. Att Freja—Oden var ett gudapar som firades vid vintersolståndet, det vill säga jul, är möjligt men inte belagt.");
        NordiskGud brynhild = new NordiskGud("Brynhild", "Ase", "Brynhild var en sköldmö i nordisk mytologi. Hon är dotter till sagokungen Budle. Ifrån den tyska medeltidslitteraturens mycket kända verk, Nibelungenlied, är hon främst känd som drottning Brünhilde, Krimhild av Burgunds svägerska.\n" +
                "\n" +
                "Hon har antagits ha historisk bakgrund Brunhilda, drottning av Austrasien.[1]\n" +
                "\n" +
                "I en episod berättas det att hon trotsade Oden genom att välja fel vinnare efter ett slag, varpå Oden lät stänga in henne i ett rum av eld. Sigurd Fafnesbane och Gunnar Gjukesson hade förälskat sig i henne och hon räddas så av Sigurd. Svartsjuka får Brynhild att driva Gunnar och hans bröder till att döda Sigurd (Sigurd var redan gift med Gunnars syster Gudrun Gjukadotter, kallad Krimhild i Nibelungenlied). Brynhild överger sin dödlige make och följer Sigurd genom att sticka ett svärd i sig själv för att sedan förgå med honom på bålet.\n" +
                "\n" +
                "Brynhild fick dottern Aslög tillsammans med Sigurd Fafnesbane. Brynhild hade också en systerson som hette Allsvinn, inte att förblanda med hästen Allsvinn.");
        NordiskGud surt = new NordiskGud("Surt", "Ase", "Surt, på fornisländska Surtr (den svarte, jämför danskans sort), är i nordisk mytologi anfader och den mäktigaste av eldtursar, en jätte i underjorden som är eldens härskare och väktare i Muspelheim, samt på Island förbunden med vulkanisk aktivitet. Namnet Surtsey, \"Surts ö\" kommer från denne eldturs namn. Enligt den isländska traditionen bodde Surt en gång i tiden i grottan Surtshellir. Grottan nämndes för första gången i Landnámabók. Forskaren Rudolf Simek tror att Surt har funnits länge inom den germanska mytologin och att när nordmännen anlände till Island måste vulkanerna fått dem att omedelbart tänka på Surt.[1]\n" +
                "\n" +
                "I eddadikten Völuspá berättas att Surt har ett brinnande svärd som lyser starkare än solen, och när jordens undergång, Ragnarök, är i antågande går han i spetsen mot gudarna i Asgård och möter Frej som har bytt bort sitt beryktade självsvingade svärd mot att få gifta sig med jättinnan Gerd. Surt blir svårt sargad av Frej i striden, ty Frej borrar in sitt vapen, ett hjorthorn, djupt in i Surts ögonhåla. Surt klyver Frej men förgås själv, galen av smärta, i de världsuppslukande vågorna av eld och i det vattenflöde som strömmar när marken rämnar.");


        gudar.add(oden);
        gudar.add(tor);
        gudar.add(loke);
        gudar.add(balder);
        gudar.add(frej);
        gudar.add(freja);
        gudar.add(brynhild);
        gudar.add(surt);


        BorderPane layout = new BorderPane();
        ScrollPane scroll = new ScrollPane();

        Label rubrik= new Label("Nordiska gudar och väsen");
        layout.setTop(rubrik);
        rubrik.setFont(new Font(20));
        rubrik.setStyle("-fx-font-weight: bold");


        ListView<String> lista = new ListView<>();
        lista.setPrefWidth(150);
        lista.getItems().addAll(
                "Oden", "Tor", "Loke", "Balder", "Frej", "Freja", "Brynhild", "Surt"
        );

        layout.setLeft(lista);




        lista.getSelectionModel().selectedIndexProperty().addListener(ov -> {
            Text textnamn = new Text();
            Text textslakte = new Text();
            Text textfakta = new Text();
            textnamn.setFont(Font.font("Helvetica", FontWeight.BOLD, 25));
            textslakte.setFont(Font.font("Arial", FontWeight.BOLD, 17));



            TextFlow textflode = new TextFlow(textfakta);
            textflode.setLineSpacing(2);


            textnamn.setText(gudar.get(lista.getSelectionModel().getSelectedIndex()).getNamn());
            textslakte.setText(gudar.get(lista.getSelectionModel().getSelectedIndex()).getSlakte());
            textfakta.setText(gudar.get(lista.getSelectionModel().getSelectedIndex()).getBeskrivning());




            VBox vbox = new VBox();
            vbox.setPadding(new Insets(0,10,0,10));
            vbox.getChildren().addAll(textnamn,textslakte,textflode);
            layout.setCenter(vbox);
            scroll.setFitToWidth(true);
            scroll.setContent(vbox);
            layout.setCenter(scroll);




        });

        Scene scene = new Scene(layout, 500 ,400);
        primaryStage.setTitle("Nordiska Gudar");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
