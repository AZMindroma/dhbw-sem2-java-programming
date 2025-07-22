package Block6_AbstraktionBeziehungen.Aufgabe4_Interfaces;

public class NatuerlichePerson extends Person implements Fahrzeughalter {
    private Fahrzeug fahrzeug;

    public NatuerlichePerson(String vorname, String nachname) {
        super(vorname, nachname);
    }

    @Override
    public void setFahrzeug(Fahrzeug f) {
        this.fahrzeug = f;
    }

    @Override
    public Fahrzeug getFahrzeug() {
        return fahrzeug;
    }
}
