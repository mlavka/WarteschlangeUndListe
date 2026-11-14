public class Liste {
    private Knoten anfang;

    Liste() {
        anfang = null;
    }
    public void vorneEinfuegen(Datenelement datenelement) {
        Knoten knoten = new Knoten(datenelement, anfang);
        anfang = knoten;
    }
    public void hintenEinfuegen(Datenelement datenelement) {
        if (anfang != null) anfang.hintenEinfuegen(datenelement);
        else vorneEinfuegen(datenelement);
    }
    public void einfuegenVor(Datenelement datenelement, Datenelement vergleich) {
        if (anfang != null) anfang = anfang.einfuegenVor(datenelement, vergleich);
        else vorneEinfuegen(datenelement);
    }
    public void sortiertEinfuegen(Datenelement datenelement) {
        if (anfang != null) anfang.sortiertEinfuegen(datenelement);
        else vorneEinfuegen(datenelement);
    }
    public Datenelement anfangEntfernen() {
        if (anfang != null) {
            Knoten k = anfang;
            anfang = anfang.nachfolgerGeben();
            return k.DatenelementGeben();
        }
        else return null;
    }
    public Datenelement endeEntfernen() {
        if (anfang != null) {
            Datenelement d = anfang.endeGeben();
            anfang = anfang.endeEntfernen();
            return d;
        } else return null;
    }
    public void knotenEntfernen(Datenelement d) {
        if (anfang != null) anfang = anfang.knotenEntfernen(d);
    }
    public int laengeGeben() {
        if (anfang != null) return anfang.restLaengeGeben();
        else return 0;
    }
    public void informationAusgeben() {
        if (anfang != null) anfang.informationAusgeben();
        else System.out.println("Die Liste ist leer.");
    }
    public Datenelement suchen(String s) {
        if (anfang != null) return anfang.suchen(s);
        else return null;
    }
}
