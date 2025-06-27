package Overloading;

public class Siswa {
    void info(String nama) {
        System.out.println("Nama Siswa: " + nama);
    }

    void info(String nama, int umur) {
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun");
    }

    void info(String nama, String kelas) {
        System.out.println("Nama: " + nama + ", Kelas: " + kelas);
    }

    public static void main(String[] args) {
        Siswa s = new Siswa();
        s.info("Rina");
        s.info("Budi", 16);
        s.info("Lia", "11 IPA 2");
    }
}
