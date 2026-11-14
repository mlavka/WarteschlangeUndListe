public class Main {
    static void main() {
        Liste liste = new Liste();
        Patient patient1 = new Patient ("John");
        Patient patient2 = new Patient ("Kate");
        Patient patient3 = new Patient ("Bea");
        liste.vorneEinfuegen(patient1);
        liste.hintenEinfuegen(patient2);
        // liste.hintenEinfuegen(patient3);
        liste.einfuegenVor(patient3, patient2);
        liste.informationAusgeben();
        System.out.println(liste.laengeGeben());
    }
}
