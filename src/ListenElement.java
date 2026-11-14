public abstract class ListenElement {
    abstract ListenElement nachfolgerGeben();
    abstract Datenelement datenelementGeben();
    abstract void informationAusgeben();

    abstract Knoten hintenEinfuegen(Datenelement d);
    abstract Knoten einfuegenVor(Datenelement d, Datenelement vergliech);
    abstract Knoten sortiertEinfuegen(Datenelement d); //warum hier Knoten?
    abstract ListenElement knotenEntfernen(Datenelement d); //warum hier ListenElement?
    abstract Datenelement endeGeben (Datenelement d);
    abstract Datenelement suchen (String s);
    abstract int restLaengeGeben();
}
