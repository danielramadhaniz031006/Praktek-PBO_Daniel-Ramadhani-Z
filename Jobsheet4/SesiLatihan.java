package Jobsheet4;

public class SesiLatihan {

    private String tanggal;
    private String jam;
    private String jenisLatihan;
    private Trainer trainer;

    public SesiLatihan(String tanggal,
                       String jam,
                       String jenisLatihan,
                       Trainer trainer) {

        this.tanggal = tanggal;
        this.jam = jam;
        this.jenisLatihan = jenisLatihan;
        this.trainer = trainer;
    }

    public String info() {
        return tanggal + " | " +
               jam + " | " +
               jenisLatihan +
               " | Trainer: " +
               trainer.getNama();
    }
}