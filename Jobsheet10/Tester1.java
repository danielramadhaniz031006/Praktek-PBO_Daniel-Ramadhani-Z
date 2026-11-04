package Jobsheet10;

public class Tester1 {
    public static void main(String[] args) {
        RegularStudent rStd = new RegularStudent("Rina", 400);
        ScholarshipStudent sStd = new ScholarshipStudent("Bayu", "KIP Kuliah");
        LabRental lab = new LabRental(3, "LAB-JARINGAN");

        Student s;
        Billable b;

        s = rStd;
        s = sStd;
        b = rStd;
        b = lab;

        System.out.println("Tester1 selesai: seluruh penugasan referensi polimorfik berhasil (tanpa error kompilasi).");

        // Baris berikut sengaja tidak diaktifkan karena akan menyebabkan error kompilasi:
        // s = lab;  // Error: LabRental bukan turunan Student.
        // b = sStd; // Error: ScholarshipStudent tidak mengimplementasikan Billable.
    }
}
