package FungsiVirtual;

public class VirtualMurni {
    abstract class Bentuk {
        public abstract double hitungLuas();
    }

    class Segitiga extends Bentuk {
        private double alas, tinggi;

        public Segitiga(double alas, double tinggi) {
            this.alas = alas;
            this.tinggi = tinggi;
        }

        @Override
        public double hitungLuas() {
            return 0.5 * alas * tinggi;
        }
    }

    public static void main(String[] args) {
        VirtualMurni program = new VirtualMurni();
        Bentuk bentuk = program.new Segitiga(5, 10); // Create an instance of the inner class Segitiga
        double luas = bentuk.hitungLuas();
        System.out.println("Luas Segitiga: " + luas); // Output: Luas Segitiga: 25.0
    }
}
