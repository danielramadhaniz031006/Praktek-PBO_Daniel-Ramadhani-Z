package Jobsheet7;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== IMPLEMENTASI 5.2: DYNAMIC METHOD DISPATCH ===");

        // Dynamic Method Dispatch: Reference variabel kelas induk menunjuk ke objek kelas anak
        Manusia objDosen = new Dosen();
        Manusia objMahasiswa = new Mahasiswa();

        // Memanggil method bernafas (milik kelas Manusia)
        System.out.print("Objek Dosen -> ");
        objDosen.bernafas();

        // Memanggil method makan yang sudah di-override di kelas Dosen
        System.out.print("Objek Dosen -> ");
        objDosen.makan(); 

        System.out.println();

        // Memanggil method bernafas (milik kelas Manusia)
        System.out.print("Objek Mahasiswa -> ");
        objMahasiswa.bernafas();

        // Memanggil method makan yang sudah di-override di kelas Mahasiswa
        System.out.print("Objek Mahasiswa -> ");
        objMahasiswa.makan(); 
    }
}