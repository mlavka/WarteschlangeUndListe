public class Patient {
    String name;
    Patient nachfolger;
    Patient(String name) {
        this.name = name;
        this.nachfolger = null;
    }
    public void nachfolgerSetzen(Patient patient) {
        this.nachfolger = patient;
    }
    public Patient nachfolgerGeben() {
        return this.nachfolger;
    }
    public String nameGeben() {
        return this.name;
    }
}
