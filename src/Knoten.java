public class Knoten extends ListenElement {
    private Datenelement inhalt;
    private ListenElement nachfolger;

    Knoten(Datenelement inhalt, ListenElement nachfolger) {
        this.inhalt = inhalt;
        this.nachfolger = nachfolger;
    }
    public void nachfolgerSetzen(ListenElement l) {
        this.nachfolger = l;
    }
    public ListenElement nachfolgerGeben() {
        return this.nachfolger;
    }
    public void informationAusgeben() {
        inhalt.informationAusgeben();
    }
    public Datenelement datenelementGeben() {
        return this.inhalt;
    }


    public Knoten hintenEinfuegen(Datenelement d) {
        nachfolger = nachfolger.hintenEinfuegen(d);
        return this;
    }
    public Knoten einfuegenVor(Datenelement d, Datenelement vergleich) {
        if (inhalt != vergleich) {
            nachfolger = nachfolger.einfuegenVor(d, vergleich);
            return this;
        } else {
            Knoten knoten = new Knoten(d, this);
            return knoten;
        }
    }
    public Knoten sortiertEinfuegen(Datenelement datenelement) {
        if (inhalt.istKleinerAls(datenelement)) {
            nachfolger = nachfolger.sortiertEinfuegen(datenelement);
            return this;
        } else {
            Knoten knoten = new Knoten(datenelement, this);
            return knoten;
        }
    }
    public Datenelement endeGeben(Datenelement d) {
        return nachfolger.endeGeben(inhalt);
    }
    public ListenElement knotenEntfernen(Datenelement d) {
        if (this.inhalt == d) {
            return nachfolger;
        } else {
            nachfolger = nachfolger.knotenEntfernen(d);
            return this;
        }
    }
    public int restLaengeGeben() {
        return nachfolger.restLaengeGeben() + 1;
    }
    public Datenelement suchen(String s) {
        if (inhalt.schluesselIstGleich(s)) {
            return this.inhalt;
        } else return nachfolger.suchen(s);
    }
}
