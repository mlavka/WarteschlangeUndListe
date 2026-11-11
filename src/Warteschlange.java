public class Warteschlange {
    Knoten anfang;
    Knoten ende;

    Warteschlange() {
        this.anfang = null;
        this.ende = null;
    }

    public void einfuegen(Patient patient) {
        Knoten knoten = new Knoten(patient);
        if (ende != null) {
            ende.nachfolgerSetzen(knoten);
        } else anfang = knoten;
        ende = knoten;
    }
    public Patient entfernen() {
        Patient entfernt = null;
        if (anfang != null) {
            entfernt = anfang.
            anfang = anfang.nachfolgerGeben();
        }
        if (anfang == null) ende = null;
        return k;
    }

    public void informationAusgeben() {
        Knoten current = anfang;
        if (anfang != null) {
            while(current.nachfolgerGeben() != null) {
                System.out.println(current.inhalt.nameGeben());
                current = current.nachfolgerGeben();
            }
        } else if (ende != null) System.out.println(ende.inhalt.nameGeben());
        else System.out.println("Keine Patienten in der Warteschlange.");
    }
}
