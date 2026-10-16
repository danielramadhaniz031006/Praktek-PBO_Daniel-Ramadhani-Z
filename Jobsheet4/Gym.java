package Jobsheet4;

import java.util.ArrayList;
import java.util.List;

public class Gym {
    private String nama;
    private String alamat;

    // =========================
    // AGGREGATION
    // =========================
    private List<Member> members;
    private List<Trainer> trainers;

    public Gym(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;

        members = new ArrayList<>();
        trainers = new ArrayList<>();
    }

    public void tambahMember(Member member) {
        members.add(member);
    }

    public void tambahTrainer(Trainer trainer) {
        trainers.add(trainer);
    }

    public void tampilkanData() {
        System.out.println("Gym       : " + nama);
        System.out.println("Alamat    : " + alamat);

        System.out.println("\nDaftar Member:");
        for (Member member : members) {
            System.out.println("- " + member.info());
        }

        System.out.println("\nDaftar Trainer:");
        for (Trainer trainer : trainers) {
            System.out.println("- " + trainer.info());
        }
    }
}