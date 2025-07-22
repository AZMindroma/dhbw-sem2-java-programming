package Block6_AbstraktionBeziehungen.Aufgabe4_Interfaces;

public abstract class Fahrzeug {
    private String fahrzeugart;
    private int anzahlRaeder;
    private Fahrzeughalter halter;

    public Fahrzeug(Fahrzeughalter halter, int anzahlRaeder) {
        this.halter = halter;
        this.anzahlRaeder = anzahlRaeder;
        this.fahrzeugart = "allgemeines Fahrzeug";
        halter.setFahrzeug(this);
    }

    public Fahrzeug(Fahrzeughalter halter, String fahrzeugart, int anzahlRaeder) {
        this.halter = halter;
        this.fahrzeugart = fahrzeugart;
        this.anzahlRaeder = anzahlRaeder;
        halter.setFahrzeug(this);
    }

    public Fahrzeughalter getHalter() {
        return halter;
    }

    public String getFahrzeugart() {
        return fahrzeugart;
    }

    public int getAnzahlRaeder() {
        return anzahlRaeder;
    }

    @Override
    public String toString() {
        return "ein " + fahrzeugart + " mit " + anzahlRaeder + " Rädern";
    }
}
