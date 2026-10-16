public class Main {
    public static void main(String[] args) {

        Dosen pakImam = new Dosen("D001", "Pak Imam");
        Dosen buVivi = new Dosen("D002", "Bu Vivi");
        Jurusan jurusan = new Jurusan("Teknologi Informasi", 2, 2);
        jurusan.setKajur(pakImam);

        MahasiswaReguler lestari = new MahasiswaReguler("2341720001", "Lestari", 20);
        MahasiswaBeasiswa usman = new MahasiswaBeasiswa("2341720002", "Usman", 24, 50);
        MahasiswaReguler anugrah = new MahasiswaReguler("2341720003", "Anugrah", 22);

        lestari.setDosenWali(buVivi);
        usman.setDosenWali(buVivi);
        anugrah.setDosenWali(buVivi);

        jurusan.daftarPraktikum(lestari);
        jurusan.daftarPraktikum(usman);
        jurusan.daftarPraktikum(anugrah);

        BagianKeuangan keuangan = new BagianKeuangan("Bagian Keuangan");
        keuangan.cetakTagihan(lestari);
        keuangan.cetakTagihan(usman);
        keuangan.cetakTagihan(anugrah);

        jurusan.daftarPraktikum(anugrah, 1);

        jurusan.tampilInfo();
    }
}
