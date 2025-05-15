package Overloading;

public class Perpustakaan {
    void pinjam(String buku) {
        System.out.println("Meminjam buku: " + buku);
    }

    void pinjam(String buku, int lamaHari) {
        System.out.println("Meminjam buku " + buku + " selama " + lamaHari + " hari.");
    }

    void pinjam(String buku, int lamaHari, boolean kartuAnggota) {
        if (kartuAnggota)
            System.out.println("Anggota meminjam buku " + buku + " selama " + lamaHari + " hari.");
        else
            System.out.println("Non-anggota tidak bisa meminjam buku lebih dari 1 hari.");
    }

    public static void main(String[] args) {
        Perpustakaan p = new Perpustakaan();
        p.pinjam("Fisika Dasar");
        p.pinjam("Biologi", 5);
        p.pinjam("Kimia", 7, true);
    }
}
