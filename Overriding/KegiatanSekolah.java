package Overriding;

class KegiatanSekolah {
    void aktivitas() {
        System.out.println("Melakukan kegiatan rutin sekolah.");
    }
}

class Ekstrakurikuler extends KegiatanSekolah {
    @Override
    void aktivitas() {
        System.out.println("Mengikuti kegiatan ekstrakurikuler: Paskibra.");
    }

    public static void main(String[] args) {
        KegiatanSekolah k1 = new KegiatanSekolah();
        KegiatanSekolah k2 = new Ekstrakurikuler();
        k1.aktivitas();
        k2.aktivitas();
    }
}
