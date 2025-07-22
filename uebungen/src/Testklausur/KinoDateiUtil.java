package Testklausur;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KinoDateiUtil {
    // Simuliertes Eingabearray
    private static final String[] DATEN = {
            "Dr. Schiwago---300",
            "Ghostbusters---104",
            "Toy Story---99",
            "Charade---99",
            "Jenseits von Afrika---238",
            "Die tönende Wochenschau---15"
    };

    public static Kino loadKino() {
        Kino kino = new Kino();
        Pattern p = Pattern.compile("(.+)---(\\d+)");
        for (String zeile : DATEN) {
            Matcher m = p.matcher(zeile);
            if (m.matches()) {
                String titel = m.group(1).trim();
                int dauer = Integer.parseInt(m.group(2));
                kino.addFilm(new Film(titel, dauer));
            }
        }
        return kino;
    }

    public static void saveKino(Kino kino) {
        System.out.println();
        for (Film f : kino.getFilmeNachLaenge()) {
            System.out.println(f);
        }
        System.out.println();
        System.out.println("Information");
        System.out.println("Längste Spieldauer : " + kino.getLaengsterFilm().getTitel()
                + " (" + kino.getLaengsterFilm().getDauer() + " Minuten)");
        System.out.println("Kürzeste Spieldauer: " + kino.getKuerzesterFilm().getTitel()
                + " (" + kino.getKuerzesterFilm().getDauer() + " Minuten)");
        System.out.printf("Durchschnittliche Spieldauer: %.2f Minuten%n",
                kino.getDurchschnittlicheDauer());
    }
}