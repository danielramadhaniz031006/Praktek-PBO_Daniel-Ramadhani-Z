package Jobsheet4;

public class Main {

    public static void main(String[] args) {

        // Membuat gym
        Gym gym = new Gym(
                "FitZone Gym",
                "Sidoarjo"
        );

        // Membuat member
        Member member1 = new Member(
                "M001",
                "Daniel",
                "08123456789"
        );

        Member member2 = new Member(
                "M002",
                "Rizky",
                "08234567890"
        );

        // Membuat trainer
        Trainer trainer1 = new Trainer(
                "T001",
                "Andi",
                "Muscle Building"
        );

        // Aggregation
        gym.tambahMember(member1);
        gym.tambahMember(member2);
        gym.tambahTrainer(trainer1);

        // Membuat keanggotaan
        Keanggotaan membership =
                new Keanggotaan(
                        "K001",
                        "Premium",
                        member1
                );

        // Composition
        membership.tambahSesi(
                "22-09-2026",
                "16:00",
                "Weight Training",
                trainer1
        );

        membership.tambahSesi(
                "24-09-2026",
                "16:00",
                "Personal Training",
                trainer1
        );

        // Dependency
        PendaftaranService service =
                new PendaftaranService();

        service.daftarMember(
                member1,
                membership
        );

        System.out.println();

        gym.tampilkanData();

        membership.tampilkanSesi();
    }
}