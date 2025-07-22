package Block6_AbstraktionBeziehungen.Aufgabe2_AbstrakteKlassen;

public class Motorrad extends Fahrzeug {

    public Motorrad(Fahrzeughalter halter) {
        super(halter,"Motorrad", 2);
    }

    public String toString() {
        return super.toString();
    }
}
