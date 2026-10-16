package Jobsheet2;

public class TugasBarangMain {
    public static void main(String[] args) {

        TugasBarang b1 = new TugasBarang();

        b1.kode = "BRG001";
        b1.namaBarang = "PlayStation 5";
        b1.hargaDasar = 100000;
        b1.diskon = 0.10f;

        b1.tampilData();
    }
}