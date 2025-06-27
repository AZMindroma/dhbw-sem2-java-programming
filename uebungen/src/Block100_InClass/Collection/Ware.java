package Block100_InClass.Collection;

public class Ware {
    private final String nummer;
    private final String bezeichnung;
    private double preis;

    public Ware(String nummer, String bezeichnung, double preis) {
        this.nummer = nummer;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    public String getNummer() {
        return this.nummer;
    }

    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public double getPreis() {
        return this.preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
