public class Patient implements Datenelement {
    private String name;
    Patient(String name) {
        this.name = name;
    }
    public void informationAusgeben() {
        System.out.println(this.name);
    }
    public String nameGeben() {
        return this.name;
    }
    public boolean istKleinerAls(Datenelement d) {
        Patient p = (Patient)d;
        return (name.compareTo(p.nameGeben()) < 0);
    }
    public boolean schluesselIstGleich(String s) {
        return name.equals(s);
    }
}
