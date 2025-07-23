import java.io.IOException;
import java.util.Map;

public class Testing {
    public static void main(String[] args) throws IOException {
        Auftrag auftrag = new Auftrag();
        auftrag.leseAuftrag("zeiten.txt");

        gibEinsaetzeAus(auftrag);
        System.out.println("====");
        gibGesamtzeitenAus(auftrag);
    }

    private static void gibEinsaetzeAus(Auftrag auftrag) {
        System.out.println("Einsätze nach Auftragszeit");
        System.out.println();

        for (Einsatz einsatz : auftrag.einsaetzeNachAuftragszeit()) {
            Mitarbeiter mitarbeiter = einsatz.getMitarbeiter();
            System.out.printf("%s %s : %d min%n",
                    mitarbeiter.getVorname(), mitarbeiter.getNachname(),
                    einsatz.getMinuten());
        }
    }

    private static void gibGesamtzeitenAus(Auftrag auftrag) {
        System.out.println("Mitarbeiter mit gesamter Auftragszeit");
        System.out.println();

        Map<Mitarbeiter, Integer> gesamtzeiten = auftrag.mitarbeiterMitGesamtauftragszeit();
        for (Map.Entry<Mitarbeiter, Integer> entry : gesamtzeiten.entrySet()) {
            Mitarbeiter mitarbeiter = entry.getKey();
            int minuten = entry.getValue();
            System.out.printf("%s %s : %d min%n",
                    mitarbeiter.getVorname(), mitarbeiter.getNachname(), minuten);
        }
    }
}
