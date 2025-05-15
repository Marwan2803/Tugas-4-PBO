package Overriding;

class Pegawai {
    void tugas() {
        System.out.println("Pegawai sekolah bekerja.");
    }
}

class KepalaSekolah extends Pegawai {
    @Override
    void tugas() {
        System.out.println("Kepala sekolah memimpin dan mengelola sekolah.");
    }

    public static void main(String[] args) {
        Pegawai p = new KepalaSekolah();
        p.tugas();
    }
}
