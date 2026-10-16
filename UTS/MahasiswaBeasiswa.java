public class MahasiswaBeasiswa extends Mahasiswa {
    private int persenBeasiswa;

    public MahasiswaBeasiswa(String nim, String nama, int sks, int persenBeasiswa) {
        super(nim, nama, sks);
        if (persenBeasiswa < 0 || persenBeasiswa > 100) {
            throw new IllegalArgumentException("Persen beasiswa harus antara 0 sampai 100.");
        }
        this.persenBeasiswa = persenBeasiswa;
    }

    @Override
    public int hitungUKT() {
        int uktSebelumDiskon = (sks * 150_000) + 500_000;
        return uktSebelumDiskon * (100 - persenBeasiswa) / 100;
    }

    @Override
    public String getJenis() {
        return "Beasiswa " + persenBeasiswa + "%";
    }

    public int getPersenBeasiswa() {
        return persenBeasiswa;
    }
}
