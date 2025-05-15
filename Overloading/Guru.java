package Overloading;

public class Guru {
    void mengajar(String mataPelajaran) {
        System.out.println("Mengajar mata pelajaran: " + mataPelajaran);
    }

    void mengajar(String mataPelajaran, int durasi) {
        System.out.println("Mengajar " + mataPelajaran + " selama " + durasi + " menit.");
    }

    void mengajar(String mataPelajaran, int durasi, String kelas) {
        System.out.println("Mengajar " + mataPelajaran + " di kelas " + kelas + " selama " + durasi + " menit.");
    }

    public static void main(String[] args) {
        Guru g = new Guru();
        g.mengajar("Matematika");
        g.mengajar("Biologi", 90);
        g.mengajar("Sejarah", 60, "10A");
    }
}
