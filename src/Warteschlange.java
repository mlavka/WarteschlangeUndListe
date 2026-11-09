public class Warteschlange {
    Patient anfang;
    Patient ende;

    Warteschlange() {
        this.anfang = null;
        this.ende = null;
    }

    public void einfuegen(Patient patient) {
        if (ende != null) {
            ende.nachfolgerSetzen(patient);
        } else anfang = patient;
        ende = patient;
    }
    public Patient entfernen() {
        Patient p = anfang;
        if (anfang != null) {
            anfang = anfang.nachfolgerGeben();
        }
        if (anfang == null) ende = null;
        return p;
    }

    public void informationAusgeben() {
        Patient current = anfang;
        if (anfang != null) {
            while(current.nachfolgerGeben() != null) {
                System.out.println(current.nameGeben());
                current = current.nachfolgerGeben();
            }
        } else if (ende != null) System.out.println(ende.nameGeben());
        else System.out.println("Keine Patienten in der Warteschlange.");
    }
}
