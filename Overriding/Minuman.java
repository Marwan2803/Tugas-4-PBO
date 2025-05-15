package Overriding;

class Minuman {
    void info() {
        System.out.println("Ini adalah minuman biasa.");
    }
}

class MinumanDingin extends Minuman {
    @Override
    void info() {
        System.out.println("Ini adalah minuman dingin, cocok untuk cuaca panas.");
    }

    public static void main(String[] args) {
        Minuman m1 = new Minuman();
        Minuman m2 = new MinumanDingin();
        m1.info();
        m2.info();
    }
}

