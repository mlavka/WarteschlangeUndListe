public class Abschluss extends ListenElement {
    ListenElement nachfolgerGeben() {
        return null;
    }
    Datenelement datenelementGeben() {
        return null;
    }
    void informationAusgeben() {
        System.out.println("Abschluss (Die Liste ist leer).");
    }


    Knoten hintenEinfuegen(Datenelement d) {
        Knoten knoten = new Knoten(d, this);
        return knoten;
    }
    Knoten einfuegenVor(Datenelement d, Datenelement vergleich) {
        return hintenEinfuegen(d);
    }
    Knoten sortiertEinfuegen(Datenelement d) {
        return hintenEinfuegen(d);
    }
    ListenElement knotenEntfernen(Datenelement d) {
        return this;
    }
    Datenelement endeGeben (Datenelement d) {
        return d; //inhalt vom letzen Knoten
    }
    Datenelement suchen (String s) {
        return null;
    }
    int restLaengeGeben() {
        return 0;
    }
}
