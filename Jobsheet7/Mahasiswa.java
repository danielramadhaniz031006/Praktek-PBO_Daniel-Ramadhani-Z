package Jobsheet7;

class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa sedang makan di warung.");
    }

    public void tidur() {
        System.out.println("Mahasiswa sedang tidur karena lelah kuliah.");
    }
}