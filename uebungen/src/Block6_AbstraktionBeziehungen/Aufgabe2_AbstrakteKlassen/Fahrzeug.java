package Block6_AbstraktionBeziehungen.Aufgabe2_AbstrakteKlassen;

public abstract class Fahrzeug {
    private final Fahrzeughalter halter;

    private final String fahrzeugart;
    private final int anzahlRaeder;

    public Fahrzeug(Fahrzeughalter halter, String fahrzeugart, int anzahlRaeder) {
        this.halter = halter;
        this.fahrzeugart = fahrzeugart;
        this.anzahlRaeder = anzahlRaeder;
    }

    public Fahrzeughalter getHalter() {
        return halter;
    }

    public String gibFahrzeugart() {
        return fahrzeugart;
    }

    public int gibAnzahlRaeder() {
        return anzahlRaeder;
    }

    public String toString() {
        return String.format("Dieses Fahrzeug ist ein %s mit %d Rädern. Es gehört %s.", this.fahrzeugart, this.anzahlRaeder, this.halter.getName());
    }
}
