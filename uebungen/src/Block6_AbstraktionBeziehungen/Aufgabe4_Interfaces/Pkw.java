package Block6_AbstraktionBeziehungen.Aufgabe4_Interfaces;

public class Pkw extends Fahrzeug {
    private int anzahlTueren;

    public Pkw(Fahrzeughalter halter, int anzahlRaeder, int anzahlTueren) {
        super(halter, "Pkw", anzahlRaeder);
        this.anzahlTueren = anzahlTueren;
    }

    public int getAnzahlTueren() {
        return anzahlTueren;
    }

    @Override
    public String toString() {
        return super.toString() + " und " + anzahlTueren + " Türen";
    }
}
