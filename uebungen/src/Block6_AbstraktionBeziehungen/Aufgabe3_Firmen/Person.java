package Block6_AbstraktionBeziehungen.Aufgabe3_Firmen;

public class Person extends Fahrzeughalter {
    private final String vorname;
    private final String nachname;

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    @Override
    public String getName() {
        return vorname + " " + nachname;
    }

    public String toString() {
        return String.format("Das Fahrzeug von %s %s ist ein %s mit %d Rädern.", this.vorname, this.nachname, this.getFahrzeug().gibFahrzeugart(), this.getFahrzeug().gibAnzahlRaeder());
    }
}
