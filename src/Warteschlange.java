/* public class Warteschlange {
    Knoten anfang;
    Knoten ende;

    Warteschlange() {
        this.anfang = null;
        this.ende = null;
    }

    public void einfuegen(Datenelement datenelement) {
        Knoten knoten = new Knoten(datenelement);
        if (ende != null) {
            ende.nachfolgerSetzen(knoten);
        } else anfang = knoten;
        ende = knoten;
    }
    public Datenelement entfernen() {
        Datenelement entfernt = null;
        if (anfang != null) {
            entfernt = anfang.DatenelementGeben();
            anfang = anfang.nachfolgerGeben();
            if (anfang == null) ende = null;
        }
        return entfernt;
    }

    public void informationAusgeben() {
        if (anfang != null) anfang.informationAusgeben(); // ruft die Knoten-Methode auf
        else System.out.println("Keine Patienten in der Warteschlange.");
    }
}
*/