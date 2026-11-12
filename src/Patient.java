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
}
