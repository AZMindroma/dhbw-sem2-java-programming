package Testklausur;

public class KinoFactory {
    public static Kino getKino(String dateiname) {
        // dateiname wird ignoriert, da wir nur Testdaten haben
        return KinoDateiUtil.loadKino();
    }
}