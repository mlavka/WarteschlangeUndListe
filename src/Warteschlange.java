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
        } else ende = null;
        return p;
    }
}
