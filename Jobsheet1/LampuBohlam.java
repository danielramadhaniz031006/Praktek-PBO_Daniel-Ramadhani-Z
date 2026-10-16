package Jobsheet1;

public class LampuBohlam extends Lampu {
    String warnaCahaya;
    String bentuk;

    void gantiBohlam() {
        System.out.println("Bohlam diganti.");
    }

    void aturCahaya() {
        System.out.println("Cahaya lampu bohlam diatur.");
    }

    void cetakInformasi() {
        System.out.println("=== Lampu Bohlam ===");
        System.out.println("Merk          : " + merk);
        System.out.println("Daya          : " + daya + " Watt");
        System.out.println("Warna Cahaya  : " + warnaCahaya);
        System.out.println("Bentuk        : " + bentuk);
    }
}