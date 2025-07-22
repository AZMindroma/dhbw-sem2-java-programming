package Testklausur;

public class Film implements Comparable<Film> {
    private String titel;
    private int dauer; // Minuten

    public Film(String titel, int dauer) {
        this.titel = titel;
        this.dauer = dauer;
    }

    public String getTitel() {
        return titel;
    }

    public int getDauer() {
        return dauer;
    }

    @Override
    public String toString() {
        return String.format("%-25s : %3d Minuten", titel, dauer);
    }

    // Für Sortierung: erst nach Dauer, dann nach Titel
    @Override
    public int compareTo(Film other) {
        int cmp = Integer.compare(this.dauer, other.dauer);
        if (cmp == 0) {
            cmp = this.titel.compareToIgnoreCase(other.titel);
        }
        return cmp;
    }
}