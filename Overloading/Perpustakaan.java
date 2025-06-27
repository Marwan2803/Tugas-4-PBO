package Overloading;

public class Perpustakaan {
    void pinjam(String buku) {
        System.out.println("Meminjam buku: " + buku);
    }

    void pinjam(String buku, int hari) {
        System.out.println("Meminjam buku: " + buku + " selama " + hari + " hari.");
    }

    void pinjam(String buku, boolean anggota) {
        String status = anggota ? "anggota" : "bukan anggota";
        System.out.println("Buku " + buku + " dipinjam oleh " + status + " perpustakaan.");
    }

    public static void main(String[] args) {
        Perpustakaan p = new Perpustakaan();
        p.pinjam("Fisika Dasar");
        p.pinjam("Biologi", 7);
        p.pinjam("Kimia", true);
    }
}
