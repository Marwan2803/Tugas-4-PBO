package Overriding;

class Makanan {
    void deskripsi() {
        System.out.println("Ini adalah makanan.");
    }
}

class MakananPenutup extends Makanan {
    @Override
    void deskripsi() {
        System.out.println("Ini adalah makanan penutup seperti kue atau puding.");
    }

    public static void main(String[] args) {
        Makanan m = new Makanan();
        Makanan m2 = new MakananPenutup();
        m.deskripsi();
        m2.deskripsi();
    }
}
