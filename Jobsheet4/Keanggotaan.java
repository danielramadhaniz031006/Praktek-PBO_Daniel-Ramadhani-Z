package Jobsheet4;

import java.util.ArrayList;
import java.util.List;

public class Keanggotaan {

    private String id;
    private String paket;
    private Member member;

    // =========================
    // COMPOSITION
    // =========================
    private List<SesiLatihan> sesiList;

    public Keanggotaan(String id, String paket, Member member) {
        this.id = id;
        this.paket = paket;
        this.member = member;

        sesiList = new ArrayList<>();
    }

    public void tambahSesi(String tanggal, String jam,
                           String jenisLatihan, Trainer trainer) {

        SesiLatihan sesi = new SesiLatihan(
                tanggal,
                jam,
                jenisLatihan,
                trainer
        );

        sesiList.add(sesi);
    }

    public void tampilkanSesi() {
        System.out.println("\nMember : " + member.getNama());
        System.out.println("Paket  : " + paket);

        System.out.println("Sesi latihan:");

        for (SesiLatihan sesi : sesiList) {
            System.out.println("- " + sesi.info());
        }
    }
}