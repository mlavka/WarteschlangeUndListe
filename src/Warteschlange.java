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
            entfernt = anfang.getInhalt();
            anfang = anfang.nachfolgerGeben();
        }
        if (anfang == null) ende = null;
        return entfernt;
    }

    public void informationAusgeben() {
        Knoten current = anfang;
        if (anfang != null) {
            while(current.nachfolgerGeben() != null) {
                System.out.println(current.getInhalt().nameGeben());
                current = current.nachfolgerGeben();
            }
        } else System.out.println("Keine Patienten in der Warteschlange.");
    }
}
