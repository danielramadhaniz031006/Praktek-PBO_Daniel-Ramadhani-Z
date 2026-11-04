package Jobsheet10;

public class TestParkir {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("N 1234 AB", 5000, 10000);
        Motor motor = new Motor("N 5678 CD", 2000, 3000);
        Parkir loket = new Parkir();

        System.out.println("Biaya parkir Mobil (3 jam) : " + loket.hitungBiaya(mobil, 3));
        System.out.println("Biaya parkir Motor (4 jam) : " + loket.hitungBiaya(motor, 4));

        System.out.println("--- versi Pattern Matching Java 16+ ---");
        System.out.println("Biaya parkir Mobil (3 jam) : " + loket.hitungBiayaModern(mobil, 3));
        System.out.println("Biaya parkir Motor (4 jam) : " + loket.hitungBiayaModern(motor, 4));
    }
}
