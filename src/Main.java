public class Main {
    static void main() {
        Warteschlange warteschlange = new Warteschlange();
        Patient patient2 = new Patient ("John");
        Patient patient3 = new Patient ("Bea");
        Knoten knoten1 = new Knoten(new Patient ("Kate"));
        Patient patient2 = new Patient ("John");
        warteschlange.einfuegen(knoten1);
        warteschlange.einfuegen(patient2);
        warteschlange.einfuegen(patient3);
        System.out.println(warteschlange.entfernen());
    }
}
