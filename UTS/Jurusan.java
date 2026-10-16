public class Jurusan {
    private String nama;
    private Laboratorium[] daftarLab;
    private Dosen kajur;

    public Jurusan(String nama, int jumlahLab, int kapasitasLab) {
        if (jumlahLab < 0 || kapasitasLab < 0) {
            throw new IllegalArgumentException("Jumlah dan kapasitas lab tidak boleh negatif.");
        }
        this.nama = nama;
        this.daftarLab = new Laboratorium[jumlahLab];
        for (int i = 0; i < jumlahLab; i++) {
            daftarLab[i] = new Laboratorium("LAB-" + (i + 1), kapasitasLab);
        }
    }

    public void setKajur(Dosen kajur) {
        this.kajur = kajur;
    }

    public void daftarPraktikum(Mahasiswa mahasiswa) {
        for (Laboratorium lab : daftarLab) {
            if (!lab.isPenuh()) {
                lab.tambahPeserta(mahasiswa);
                return;
            }
        }
        System.out.println("Semua laboratorium penuh, " + mahasiswa.getNama() + " tidak dapat didaftarkan.");
    }

    public void daftarPraktikum(Mahasiswa mahasiswa, int nomorLab) {
        if (nomorLab < 1 || nomorLab > daftarLab.length) {
            System.out.println("Nomor laboratorium tidak valid.");
            return;
        }

        Laboratorium lab = daftarLab[nomorLab - 1];
        if (lab.isPenuh()) {
            System.out.println(lab.getKode() + " penuh, " + mahasiswa.getNama() + " tidak dapat didaftarkan.");
            return;
        }

        lab.tambahPeserta(mahasiswa);
    }

    public void tampilInfo() {
        for (Laboratorium lab : daftarLab) {
            lab.tampilPeserta();
        }
    }

    public String getNama() {
        return nama;
    }

    public Dosen getKajur() {
        return kajur;
    }
}
