package Jobsheet4;

public class PendaftaranService {

    // =========================
    // DEPENDENCY
    // =========================
    public void daftarMember(Member member,
                             Keanggotaan keanggotaan) {

        System.out.println(
                "Pendaftaran berhasil untuk member: "
                + member.getNama()
        );

        System.out.println(
                "Keanggotaan telah dibuat."
        );
    }
}