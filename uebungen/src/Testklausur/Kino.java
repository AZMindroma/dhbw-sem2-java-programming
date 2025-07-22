package Testklausur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kino {
    private List<Film> filme = new ArrayList<>();

    public void addFilm(Film film) {
        if (film != null) {
            filme.add(film);
        }
    }

    public Film getKuerzesterFilm() {
        return filme.stream().min(Film::compareTo).orElse(null);
    }

    public Film getLaengsterFilm() {
        return filme.stream().max(Film::compareTo).orElse(null);
    }

    public double getDurchschnittlicheDauer() {
        if (filme.isEmpty()) return 0;
        double sum = 0;
        for (Film f : filme) sum += f.getDauer();
        return sum / filme.size();
    }

    public List<Film> getFilmeNachLaenge() {
        List<Film> sorted = new ArrayList<>(filme);
        Collections.sort(sorted);
        return sorted;
    }
}