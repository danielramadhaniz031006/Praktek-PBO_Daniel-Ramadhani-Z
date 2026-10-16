package Jobsheet4;

public class Trainer {
    private String id;
    private String nama;
    private String spesialisasi;

    public Trainer(String id, String nama, String spesialisasi) {
        this.id = id;
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }

    public String info() {
        return nama + " - " + spesialisasi;
    }

    public String getNama() {
        return nama;
    }
}