package Jobsheet10;

public class Parkir {
    public int hitungBiaya(Kendaraan k, int lamaJam) {
        int biaya = k.getTarifPerJam() * lamaJam;

        if (k instanceof Mobil) {
            biaya += ((Mobil) k).getBiayaValet();
        } else if (k instanceof Motor) {
            biaya += ((Motor) k).getBiayaHelm();
        } else if (k instanceof Bus) {
            biaya += ((Bus) k).getBiayaKebersihan();
        }

        return biaya;
    }

    public int hitungBiayaModern(Kendaraan k, int lamaJam) {
        int biaya = k.getTarifPerJam() * lamaJam;

        if (k instanceof Mobil mobil) {
            biaya += mobil.getBiayaValet();
        } else if (k instanceof Motor motor) {
            biaya += motor.getBiayaHelm();
        } else if (k instanceof Bus bus) {
            biaya += bus.getBiayaKebersihan();
        }

        return biaya;
    }
}
