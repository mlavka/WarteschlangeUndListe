public class Knoten {
    private Datenelement inhalt;
    private Knoten nachfolger;

    Knoten(Datenelement inhalt) {
        this.inhalt = inhalt;
        this.nachfolger = null;
    }
    Knoten(Datenelement inhalt, Knoten nachfolger) {
        this.inhalt = inhalt;
        this.nachfolger = nachfolger;
    }
    public void nachfolgerSetzen(Knoten knoten) {
        this.nachfolger = knoten;
    }
    public Knoten nachfolgerGeben() {
        return this.nachfolger;
    }
    public void informationAusgeben() {
        inhalt.informationAusgeben();
        if(nachfolger != null) nachfolger.informationAusgeben(); //rekursiv
    }
    public Datenelement DatenelementGeben() {
        return this.inhalt;
    }

    public void hintenEinfuegen(Datenelement datenelement) {
        if (nachfolger != null) nachfolger.hintenEinfuegen(datenelement);
        else {
            Knoten knoten = new Knoten(datenelement);
            nachfolger = knoten;
        }
    }
    public Knoten einfuegenVor(Datenelement datenelement, Datenelement vergleich) {
        if (inhalt != vergleich) {
            if (nachfolger != null) nachfolger = nachfolger.einfuegenVor(datenelement, vergleich);
            else hintenEinfuegen(datenelement);
            return this;
        }
        Knoten knoten = new Knoten(datenelement, this);
        return knoten;
    }
    public Knoten sortiertEinfuegen(Datenelement datenelement) {
        if (inhalt.istKleinerAls(datenelement)) {
            if (nachfolger != null) {
                nachfolger = nachfolger.sortiertEinfuegen(datenelement);
            } else hintenEinfuegen(datenelement);
            return this;
        } else {
            Knoten knoten = new Knoten(datenelement, this);
            return knoten;
        }
    }
    public Knoten endeEntfernen() {
        if (nachfolger == null) {
            return null;
        } else {
            nachfolger = nachfolger.endeEntfernen();
            return this;
        }
    }
    public Datenelement endeGeben() {
        if (nachfolger == null) return inhalt;
        else return nachfolger.endeGeben();
    }
    public Knoten knotenEntfernen(Datenelement d) {
        if (this.inhalt == d) {
            return nachfolger;
        } else if (nachfolger != null) {
            nachfolger = nachfolger.knotenEntfernen(d);
            return this;
        } else return this;
    }
    public int restLaengeGeben() {
        if (nachfolger != null) return nachfolger.restLaengeGeben() + 1;
        else return 1;
    }
    public Datenelement suchen(String s) {
        if (inhalt.schluesselIstGleich(s)) {
            return this.inhalt;
        } else if (nachfolger != null) return nachfolger.suchen(s);
        else return null;
    }
}
