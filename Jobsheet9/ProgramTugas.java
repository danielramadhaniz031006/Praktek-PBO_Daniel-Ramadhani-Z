package Jobsheet9;
    
public class ProgramTugas {
    public static void main(String[] args) {
        Kedelai kedelai = new Kedelai("Kedelai", 4, "Hehehe", "Abu-Abu");
        Gorilla gorilla = new Gorilla("Gulali", 4, "Haaum Haaum", "Hitam Manis");
        Singa singa = new Singa("CingaCing", 4, "Roaar Rooaar", "Coklat");

        kedelai.displayData();
        System.out.println();

        gorilla.displayData();
        System.out.println();

        singa.displayData();
    }
}