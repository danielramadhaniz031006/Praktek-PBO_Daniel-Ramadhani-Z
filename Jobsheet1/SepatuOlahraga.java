package Jobsheet1;

public class SepatuOlahraga {
    int ukuran;
    String jenisOlahraga;

    void pakai() {
        System.out.println("Sepatu olahraga dipakai.");
    }

    void bersihkan() {
        System.out.println("Sepatu olahraga dibersihkan.");
    }

    void cetakInformasi() {
        System.out.println("=== Sepatu Olahraga ===");
        System.out.println("Ukuran        : " + ukuran);
        System.out.println("Jenis Olahraga: " + jenisOlahraga);
    }
}