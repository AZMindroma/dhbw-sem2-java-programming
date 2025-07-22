package Block6_AbstraktionBeziehungen.Aufgabe4_Interfaces;

public abstract class JuristischePerson implements Fahrzeughalter {
    private String name;
    private Fahrzeug fahrzeug;

    public JuristischePerson(String name) {
        this.name = name;
    }

    @Override
    public void setFahrzeug(Fahrzeug f) {
        this.fahrzeug = f;
    }

    @Override
    public Fahrzeug getFahrzeug() {
        return fahrzeug;
    }

    @Override
    public String toString() {
        return "Firma " + name;
    }
}
