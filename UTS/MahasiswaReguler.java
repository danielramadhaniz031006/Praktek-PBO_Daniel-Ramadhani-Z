public class MahasiswaReguler extends Mahasiswa {
    public MahasiswaReguler(String nim, String nama, int sks) {
        super(nim, nama, sks);
    }

    @Override
    public int hitungUKT() {
        return (sks * 150_000) + 500_000;
    }

    @Override
    public String getJenis() {
        return "Reguler";
    }
}
