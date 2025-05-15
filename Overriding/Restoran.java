package Overriding;

class Restoran {
    void layanan() {
        System.out.println("Layanan standar restoran.");
    }
}

class RestoranCepatSaji extends Restoran {
    @Override
    void layanan() {
        System.out.println("Layanan cepat saji: siap dalam 5 menit.");
    }

    public static void main(String[] args) {
        Restoran r1 = new Restoran();
        Restoran r2 = new RestoranCepatSaji();
        r1.layanan();
        r2.layanan();
    }
}
