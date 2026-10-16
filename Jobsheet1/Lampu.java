package Jobsheet1;

public class Lampu {
    String merk;
    int daya;

    void nyalakan() {
        System.out.println("Lampu dinyalakan.");
    }

    void matikan() {
        System.out.println("Lampu dimatikan.");
    }

    void cetakInformasi() {
        System.out.println("Merk Lampu : " + merk);
        System.out.println("Daya       : " + daya + " Watt");
    }
}