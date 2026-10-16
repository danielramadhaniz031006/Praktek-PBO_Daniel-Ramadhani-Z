package Jobsheet4;

public class Member {
    private String id;
    private String nama;
    private String noHp;

    public Member(String id, String nama, String noHp) {
        this.id = id;
        this.nama = nama;
        this.noHp = noHp;
    }

    public String info() {
        return id + " - " + nama + " - " + noHp;
    }

    public String getNama() {
        return nama;
    }
}