package Block6_AbstraktionBeziehungen.Aufgabe1_Beziehungen;

public class Aufrufe {
    public static void main(String[] args) {
        Fahrzeughalter halter = new Fahrzeughalter("AZMindroma");
        Fahrzeug fahrzeug = new Fahrzeug(halter, 16);
        halter.setFahrzeug(fahrzeug);

        System.out.println(halter);
        System.out.println(fahrzeug);

        System.out.println();

        halter = new Fahrzeughalter("Dagobert Duck");
        fahrzeug = new Pkw(halter,4, 5);
        halter.setFahrzeug(fahrzeug);

        System.out.println(halter);
        System.out.println(fahrzeug);

        System.out.println();

        halter = new Fahrzeughalter("Donald Duck");
        fahrzeug = new Motorrad(halter);
        halter.setFahrzeug(fahrzeug);

        System.out.println(halter);
        System.out.println(fahrzeug);
    }
}
