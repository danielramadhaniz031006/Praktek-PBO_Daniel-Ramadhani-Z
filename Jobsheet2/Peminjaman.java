package Jobsheet2;

public class Peminjaman {
    int id;
    String namaMember;
    String namaGame;
    int lamaSewa;
    double harga;

    double hitungHarga() {
        return lamaSewa * harga;
    }

    void tampilData() {
        System.out.println("ID          : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);
        System.out.println("Lama Sewa   : " + lamaSewa + " hari");
        System.out.println("Harga       : Rp" + harga);
        System.out.println("Total Bayar : Rp" + hitungHarga());
    }
}