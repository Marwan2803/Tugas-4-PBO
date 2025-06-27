package Overriding;

class Petugas {
    void pekerjaan() {
        System.out.println("Petugas sekolah bertugas menjaga ketertiban.");
    }
}

class PetugasPerpus extends Petugas {
    @Override
    void pekerjaan() {
        System.out.println("Petugas perpustakaan melayani peminjaman dan pengembalian buku.");
    }

    public static void main(String[] args) {
        Petugas p1 = new Petugas();
        Petugas p2 = new PetugasPerpus();
        p1.pekerjaan();
        p2.pekerjaan();
    }
}
