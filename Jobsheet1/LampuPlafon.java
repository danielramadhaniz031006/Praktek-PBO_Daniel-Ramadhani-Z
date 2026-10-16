package Jobsheet1;

public class LampuPlafon extends Lampu {

    int diameter;
    String jenisCahaya;

    void nyalakanLampu() {
        System.out.println("Lampu plafon dinyalakan.");
    }

    void matikanLampu() {
        System.out.println("Lampu plafon dimatikan.");
    }

    void cetakInformasi() {
        System.out.println("=== Lampu Plafon ===");
        System.out.println("Merk         : " + merk);
        System.out.println("Daya         : " + daya + " Watt");
        System.out.println("Diameter     : " + diameter);
        System.out.println("Jenis Cahaya : " + jenisCahaya);
    }
}