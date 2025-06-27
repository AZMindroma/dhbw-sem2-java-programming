package Block3_KlassenObjekte.Aufgabe1_Warenbestellungen;

public class Bestellposition {
    private final Ware ware;
    private final int menge;

    public Bestellposition(Ware ware, int menge) {
        this.ware = ware;
        this.menge = menge;
    }

    public Ware getWare() {
        return ware;
    }

    public int getMenge() {
        return menge;
    }
}
