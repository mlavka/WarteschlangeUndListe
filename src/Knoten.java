public class Knoten {
    private Datenelement inhalt;
    private Knoten nachfolger;

    Knoten(Datenelement inhalt) {
        this.inhalt = inhalt;
        this.nachfolger = null;
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
}
