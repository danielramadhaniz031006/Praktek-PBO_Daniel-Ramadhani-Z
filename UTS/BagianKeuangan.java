public class BagianKeuangan {
    private String nama;

    public BagianKeuangan(String nama) {
        this.nama = nama;
    }

    public void cetakTagihan(Mahasiswa m) {
        String wali = m.getDosenWali() == null ? "Belum ditentukan" : m.getDosenWali().getNama();
        System.out.println("Tagihan UKT " + m.getNama() + " (" + m.getJenis() + ") - Wali: "
                + wali + " : " + m.hitungUKT());
    }
}
