package Block6_AbstraktionBeziehungen.Aufgabe3_Firmen;

public class Aufrufe {
    public static void main(String[] args) {
        Person person = new Person("AZ", "Mindroma");
        Pkw pkw = new Pkw(person, 4, 5);
        person.setFahrzeug(pkw);

        System.out.println(person);
        System.out.println(pkw);

        System.out.println();

        Firma firma = new Firma("Mindroma GmbH");
        Motorrad motorrad = new Motorrad(firma);
        firma.setFahrzeug(motorrad);

        System.out.println(firma);
        System.out.println(motorrad);
    }
}
