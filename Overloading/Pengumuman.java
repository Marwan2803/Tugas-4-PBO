package Overloading;

public class Pengumuman {
    void tampil(String isi) {
        System.out.println("Isi Pengumuman: " + isi);
    }

    void tampil(String isi, String tanggal) {
        System.out.println("[" + tanggal + "] " + isi);
    }

    void tampil(String isi, int jam) {
        System.out.println("Pengumuman pukul " + jam + ":00 -> " + isi);
    }

    public static void main(String[] args) {
        Pengumuman p = new Pengumuman();
        p.tampil("Ujian dimulai hari Senin.");
        p.tampil("Libur semester", "10 Juni 2025");
        p.tampil("Rapat guru", 14);
    }
}
