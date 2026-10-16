public class Laboratorium {
    private String kode;
    private Mahasiswa[] peserta;
    private int jumlah;

    public Laboratorium(String kode, int kapasitas) {
        if (kapasitas < 0) {
            throw new IllegalArgumentException("Kapasitas tidak boleh negatif.");
        }
        this.kode = kode;
        this.peserta = new Mahasiswa[kapasitas];
        this.jumlah = 0;
    }

    public boolean tambahPeserta(Mahasiswa mahasiswa) {
        if (mahasiswa == null || isPenuh()) {
            return false;
        }
        peserta[jumlah] = mahasiswa;
        jumlah++;
        return true;
    }

    public boolean isPenuh() {
        return jumlah >= peserta.length;
    }

    public String getKode() {
        return kode;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void tampilPeserta() {
        System.out.print(kode + ": ");
        for (int i = 0; i < jumlah; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(peserta[i].getNama());
        }
        System.out.println();
    }
}
