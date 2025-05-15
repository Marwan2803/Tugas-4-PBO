package Overriding;

class KegiatanSekolah {
    void jadwal() {
        System.out.println("Kegiatan sekolah dijadwalkan setiap hari.");
    }
}

class Ekstrakurikuler extends KegiatanSekolah {
    @Override
    void jadwal() {
        System.out.println("Ekstrakurikuler dijadwalkan setiap hari Jumat sore.");
    }

    public static void main(String[] args) {
        KegiatanSekolah k = new Ekstrakurikuler();
        k.jadwal();
    }
}
