package Jobsheet2;

public class PeminjamanMain {
    public static void main(String[] args) {

        Peminjaman p1 = new Peminjaman();

        p1.id =20;
        p1.namaMember = "Ramadan";
        p1.namaGame = "eFootball";
        p1.lamaSewa = 3;
        p1.harga = 15000;

        p1.tampilData();
    }
}