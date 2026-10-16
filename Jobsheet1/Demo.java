package Jobsheet1;

public class Demo {
    public static void main(String[] args) {

        Lampu lampu = new Lampu();
        lampu.merk = "Philips";
        lampu.daya = 10;

        LampuBohlam lampuBohlam = new LampuBohlam();
        lampuBohlam.merk = "Cahaya Ilahi";
        lampuBohlam.daya = 12;
        lampuBohlam.warnaCahaya = "Putih";
        lampuBohlam.bentuk = "Bulat";

        LampuPlafon lampuPlafon = new LampuPlafon();
        lampuPlafon.merk = "Panasonic";
        lampuPlafon.daya = 18;
        lampuPlafon.diameter = 30;
        lampuPlafon.jenisCahaya = "LED Putih";

        SepatuHitam sepatuHitam = new SepatuHitam();
        sepatuHitam.ukuran = 42;
        sepatuHitam.warna = "Hitam";

        SepatuOlahraga sepatuOlahraga = new SepatuOlahraga();
        sepatuOlahraga.ukuran = 41;
        sepatuOlahraga.jenisOlahraga = "Lari";


        System.out.println("\n--- LAMPU ---");

        lampu.nyalakan();
        lampu.matikan();
        lampu.cetakInformasi();


        System.out.println("\n--- LAMPU BOHLAM ---");

        lampuBohlam.nyalakan();
        lampuBohlam.matikan();
        lampuBohlam.gantiBohlam();
        lampuBohlam.aturCahaya();
        lampuBohlam.cetakInformasi();


        System.out.println("\n--- LAMPU PLAFON ---");

        lampuPlafon.nyalakan();
        lampuPlafon.matikan();
        lampuPlafon.nyalakanLampu();
        lampuPlafon.matikanLampu();
        lampuPlafon.cetakInformasi();


        System.out.println("\n--- SEPATU HITAM ---");

        sepatuHitam.pakai();
        sepatuHitam.lepas();
        sepatuHitam.cetakInformasi();


        System.out.println("\n--- SEPATU OLAHRAGA ---");

        sepatuOlahraga.pakai();
        sepatuOlahraga.bersihkan();
        sepatuOlahraga.cetakInformasi();
    }
}