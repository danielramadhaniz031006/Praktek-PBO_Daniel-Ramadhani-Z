package Jobsheet2;

    public class TestMahasiswa {
        public static void main (String args[]) {
        Mahasiswa mhs1=new Mahasiswa ();
        Mahasiswa mhs2=new Mahasiswa ();
        Mahasiswa mhs3=new Mahasiswa ();

        mhs1.nim="254107020255";
        mhs1.nama="Daniel Ramadhani Zulkarnain";
        mhs1.alamat="Jl. Bunga Andong Barat,Kavling 1";
        mhs1.kelas="2D";
        mhs1.tampilBiodata();
        System.out.println();
        mhs1.nim="251407020256";
        mhs1.nama="Nelson 'The Monllucans' Julianto";
        mhs1.alamat="Jl. Senja Purnama No. 27, Kavling 3";
        mhs1.kelas="2D";
        mhs1.tampilBiodata();
        System.out.println();
        mhs1.nim="251407020257";
        mhs1.nama="Erson";
        mhs1.alamat="Jl. Embun Pagi No. 18, Blok C";
        mhs1.kelas="2D";
        mhs1.tampilBiodata();
        
    }
}