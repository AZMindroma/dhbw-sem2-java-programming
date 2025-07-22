package Testklausur;

public class Start {
    public static void main(String[] args) {
        try {
            Kino kino = KinoFactory.getKino("dummy");
            KinoDateiUtil.saveKino(kino);
        } catch (Exception e) {
            System.err.println("Fehler im Programm: " + e.getMessage());
            e.printStackTrace();
        }
    }
}