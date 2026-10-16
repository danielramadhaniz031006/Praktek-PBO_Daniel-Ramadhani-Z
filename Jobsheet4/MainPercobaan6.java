package Jobsheet4;

public class MainPercobaan6 {
    public static void main(String[] args) {
        Laptopp laptopp = new Laptopp("Thinkpad");
        Printer printer = new Printer("Epson L3110");
        laptopp.cetakDokumen(printer, "Laporan.pdf");
    }
}