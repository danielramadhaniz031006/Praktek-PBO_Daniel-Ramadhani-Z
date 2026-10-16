package Jobsheet7;

public class TestSegitiga {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println("=== PROGRAM SEGITIGA ===");
        System.out.println("Sudut ketiga (sudut A = 60): " + segitiga.totalSudut(60));
        System.out.println("Sudut ketiga (sudut A = 60, sudut B = 70): " + segitiga.totalSudut(60, 70));
        System.out.println("Keliling segitiga (3, 4, 5): " + segitiga.keliling(3, 4, 5));
        System.out.println("Sisi miring (3, 4): " + segitiga.keliling(3, 4));
    }
}
