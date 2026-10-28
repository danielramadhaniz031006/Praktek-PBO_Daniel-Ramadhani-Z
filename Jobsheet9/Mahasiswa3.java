package Jobsheet9;

public class Mahasiswa3 {
    protected String nama;

    public Mahasiswa3(String nama) {
        this.nama = nama;
    }

    public void kuliahDiKampus() {
        System.out.println("Aku mahasiswa, namaku " + this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }
}
