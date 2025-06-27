package Overriding;

class Guru {
    void tugas() {
        System.out.println("Guru mengajar di kelas.");
    }
}

class GuruBK extends Guru {
    @Override
    void tugas() {
        System.out.println("Guru BK membimbing siswa dan memberi konseling.");
    }

    public static void main(String[] args) {
        Guru g1 = new Guru();
        Guru g2 = new GuruBK();
        g1.tugas();
        g2.tugas();
    }
}
