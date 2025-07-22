package Block6_AbstraktionBeziehungen.Aufgabe3_Firmen;

public class Firma extends Fahrzeughalter {
    private final String name;

    public Firma(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String toString() {
        return String.format("Das Fahrzeug von Firma %s ist ein %s mit %d Rädern.", this.name, this.getFahrzeug().gibFahrzeugart(), this.getFahrzeug().gibAnzahlRaeder());
    }
}
