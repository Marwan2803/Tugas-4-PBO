package Overloading;

public class Siswa {
    void absen() {
        System.out.println("Siswa hadir di sekolah.");
    }

    void absen(String nama) {
        System.out.println("Siswa " + nama + " hadir.");
    }

    void absen(String nama, String kelas) {
        System.out.println("Siswa " + nama + " dari kelas " + kelas + " hadir.");
    }

    public static void main(String[] args) {
        Siswa s = new Siswa();
        s.absen();
        s.absen("Dina");
        s.absen("Ali", "11 IPA 1");
    }
}
