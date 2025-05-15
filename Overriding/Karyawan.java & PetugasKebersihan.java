package Overriding;

class Karyawan {
    void kerja() {
        System.out.println("Karyawan melakukan tugas umum.");
    }
}

class PetugasKebersihan extends Karyawan {
    @Override
    void kerja() {
        System.out.println("Petugas kebersihan membersihkan ruang kelas.");
    }

    public static void main(String[] args) {
        Karyawan k = new PetugasKebersihan();
        k.kerja();
    }
}
