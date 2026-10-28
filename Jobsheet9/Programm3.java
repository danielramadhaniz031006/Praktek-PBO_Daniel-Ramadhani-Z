package Jobsheet9;

public class Programm3 {
    public static void main(String[] args) {
        Rektor3 pakRektor = new Rektor3();

        Sarjana3 sarjanaCumlaude = new Sarjana3("Dina");
        PascaSarjana3 masterCumlaude = new PascaSarjana3("Elok");

        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
}