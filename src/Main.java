public class Main {
    static void main() {
        Warteschlange warteschlange = new Warteschlange();
        Patient patient2 = new Patient ("Kate");
        Patient patient3 = new Patient ("Bea");
        Patient patient1 = new Patient ("John");
        warteschlange.einfuegen(patient1);
        warteschlange.einfuegen(patient2);
        warteschlange.einfuegen(patient3);
        System.out.println(warteschlange.entfernen());
    }
}
