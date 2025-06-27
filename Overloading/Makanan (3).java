package Overloading;

public class Makanan {
    void infoGizi(int kalori) {
        System.out.println("Kalori: " + kalori + " kcal");
    }

    void infoGizi(double protein) {
        System.out.println("Protein: " + protein + " gram");
    }

    void infoGizi(String kategori) {
        System.out.println("Kategori makanan: " + kategori);
    }

    public static void main(String[] args) {
        Makanan m = new Makanan();
        m.infoGizi(250);
        m.infoGizi(12.5);
        m.infoGizi("Tinggi protein");
    }
}

