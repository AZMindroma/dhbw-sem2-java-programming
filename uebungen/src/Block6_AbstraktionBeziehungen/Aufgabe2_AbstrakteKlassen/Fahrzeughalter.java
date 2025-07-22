package Block6_AbstraktionBeziehungen.Aufgabe2_AbstrakteKlassen;

public class Fahrzeughalter {
    private Fahrzeug fz;
    private final String name;

    public Fahrzeughalter(String name) {
        this.name = name;
    }

    public void setFahrzeug(Fahrzeug fz) {
        this.fz = fz;
    }

    public Fahrzeug getFahrzeug() {
        return fz;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("Das Fahrzeug von %s ist ein %s mit %d Rädern.", name, fz.gibFahrzeugart(), fz.gibAnzahlRaeder());
    }

}
