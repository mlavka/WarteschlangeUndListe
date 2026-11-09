public class Main {
    static void main() {
        Warteschlange warteschlange = new Warteschlange();
        Patient patient1 = new Patient ("Kate");
        Patient patient2 = new Patient ("John");
        Patient patient3 = new Patient ("Bea");
        warteschlange.einfuegen(patient1);
        warteschlange.einfuegen(patient2);
        warteschlange.einfuegen(patient3);
        System.out.println(warteschlange.entfernen());
    }
}
