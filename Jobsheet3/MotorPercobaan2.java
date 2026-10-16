package Jobsheet3;

public class MotorPercobaan2 {

    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn == true) {
            if (kecepatan < 100) {
                kecepatan += 5;

                // Agar tidak melebihi 100
                if (kecepatan > 100) {
                    kecepatan = 100;
                }
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off!");
            System.out.println();
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            if (kecepatan > 0) {
                kecepatan -= 5;
            }
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off!");
            System.out.println();
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }

        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}   