public class Knoten {
    Patient inhalt;
    Knoten nachfolger;

    Knoten(Patient inhalt) {
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
        if(nachfolger != null) nachfolger.informationAusgeben();
    }
    get inhalt
}
