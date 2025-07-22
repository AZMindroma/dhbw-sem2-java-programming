package Block6_AbstraktionBeziehungen.Aufgabe3_Firmen;

public class Pkw extends Fahrzeug {
    private int anzahlTueren;

    public Pkw(Fahrzeughalter halter, int anzahlRaeder, int anzahlTueren) {
        super(halter,"Pkw", anzahlRaeder);
        this.anzahlTueren = anzahlTueren;
    }

    public int gibAnzahlTueren() {
        return anzahlTueren;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
