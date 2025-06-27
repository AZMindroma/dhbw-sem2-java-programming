package Block100_InClass.Collection;

import java.util.Arrays;
import java.util.List;

public class Bestellung {
    private List<Bestellposition> positionen; // Plural nutzen, da es sich um mehrere Bestellpositionen handelt

    public Bestellung() {
        this.positionen = new Bestellposition[0];
    }

    public void nimmAuf(Bestellposition position) {
        Bestellposition[] newArray = Arrays.copyOf(this.positionen, this.positionen.length + 1);
        newArray[newArray.length - 1] = position;
        this.positionen = newArray;
    }

    public void zeigeAn() {
        for (Bestellposition pos : positionen) {
            if (pos == null) {
                continue; // Sicherstellen, dass keine null-Positionen angezeigt werden
            }
            System.out.printf("%s %s, Preis: %.1f EUR, Menge: %d\n", pos.getWare().getNummer(), pos.getWare().getBezeichnung(), pos.getWare().getPreis(), pos.getMenge());
        }
    }
}
