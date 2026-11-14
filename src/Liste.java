public class Liste {
    private ListenElement anfang;

    Liste() {
        Abschluss abschluss = new Abschluss();
        anfang = abschluss;
    }
    public void informationAusgeben() {
        ListenElement aktuell = anfang;
        do {
            aktuell.informationAusgeben();
            aktuell = aktuell.nachfolgerGeben();
        } while (aktuell.datenelementGeben() != null); // falls anfang = abschluss ist, dann wird die Schleife nur einmal ausgeführt
        System.out.println();
    }
    public void vorneEinfuegen(Datenelement datenelement) {
        Knoten knoten = new Knoten(datenelement, anfang);
        anfang = knoten;
    }
    public void hintenEinfuegen(Datenelement datenelement) {
        anfang = anfang.hintenEinfuegen(datenelement);
    }
    public void einfuegenVor(Datenelement d, Datenelement vergleich) {
        anfang = anfang.einfuegenVor(d, vergleich);
    }
    public void sortiertEinfuegen(Datenelement datenelement) {
        anfang.sortiertEinfuegen(datenelement);
    }
    public Datenelement anfangEntfernen() {
        ListenElement l = anfang;
        anfang = anfang.nachfolgerGeben();
        return l.datenelementGeben();
    }
    public Datenelement endeEntfernen() {
        Datenelement d = anfang.endeGeben(null);
        anfang = anfang.knotenEntfernen(d);
        return d;
    }
    public void knotenEntfernen(Datenelement d) {
        anfang = anfang.knotenEntfernen(d);
    }
    public int laengeGeben() {
        return anfang.restLaengeGeben();
    }
    public Datenelement suchen(String s) {
        return anfang.suchen(s);
    }
}
