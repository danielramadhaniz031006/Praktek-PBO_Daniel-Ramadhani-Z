package Jobsheet4;

public class Mobill {
    private String merek;
    private Mesin mesin;

    public Mobill(String merek) {
        this.merek = merek;
        this.mesin = new Mesin();
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }

    public void tampilkanInfo() {
        System.out.println("Mobil: " + merek);
        System.out.println("Mesin: " + mesin.getTipe());
    }
}