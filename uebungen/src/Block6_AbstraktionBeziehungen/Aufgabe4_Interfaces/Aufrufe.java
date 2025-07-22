package Block6_AbstraktionBeziehungen.Aufgabe4_Interfaces;

public class Aufrufe {
    public static void main(String[] args) {
        // Test mit Natürlichen Personen
        NatuerlichePerson goliath = new NatuerlichePerson("Riese", "Goliath");
        Fahrzeug f1 = new Fahrzeug(goliath, 16) {}; // anonymes Fahrzeug-Objekt, da Fahrzeug abstract
        System.out.println("Das Fahrzeug von " + goliath + " ist " + f1.toString() + ".");
        System.out.println("Dieses Fahrzeug ist " + f1.toString() + ". Es gehört " + f1.getHalter() + ".");
        System.out.println();

        NatuerlichePerson dagobert = new NatuerlichePerson("Dagobert", "Duck");
        Pkw pkw = new Pkw(dagobert, 4, 5);
        System.out.println("Das Fahrzeug von " + dagobert + " ist " + pkw.toString() + ".");
        System.out.println("Dieses Fahrzeug ist " + pkw.toString() + ". Es gehört " + pkw.getHalter() + ".");
        System.out.println();

        NatuerlichePerson donald = new NatuerlichePerson("Donald", "Duck");
        Motorrad motorrad = new Motorrad(donald);
        System.out.println("Das Fahrzeug von " + donald + " ist " + motorrad.toString() + ".");
        System.out.println("Dieses Fahrzeug ist " + motorrad.toString() + ". Es gehört " + motorrad.getHalter() + ".");
        System.out.println();

        // Test mit Firma
        Firma dagobertInc = new Firma("Dagobert Inc.");
        Pkw firmenPkw = new Pkw(dagobertInc, 4, 5);
        System.out.println("Das Fahrzeug von " + dagobertInc + " ist " + firmenPkw.toString() + ".");
        System.out.println("Dieses Fahrzeug ist " + firmenPkw.toString() + ". Es gehört " + firmenPkw.getHalter() + ".");
    }
}
