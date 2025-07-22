package Block6_AbstraktionBeziehungen.Aufgabe3_Firmen;

public abstract class Fahrzeughalter {
    private Fahrzeug fz;

    public void setFahrzeug(Fahrzeug fz) {
        this.fz = fz;
    }

    public Fahrzeug getFahrzeug() {
        return fz;
    }

    public abstract String getName();
}
