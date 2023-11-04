package FungsiVirtual;

public class VirtualBiasa {
    class Hewan {
        public void suara() {
            System.out.println("Hewan membuat suara umum.");
        }
    }

    class Kucing extends Hewan {
        @Override
        public void suara() {
            System.out.println("Kucing mengeluarkan suara Meow.");
        }
    }

    class Anjing extends Hewan {
        @Override
        public void suara() {
            System.out.println("Anjing mengeluarkan suara Woof.");
        }
    }

    public static void main(String[] args) {
        VirtualBiasa program = new VirtualBiasa(); // Create an instance of the outer class
        Hewan hewan1 = program.new Kucing(); // Create an instance of the inner class Kucing
        Hewan hewan2 = program.new Anjing(); // Create an instance of the inner class Anjing

        hewan1.suara(); // Output: Kucing mengeluarkan suara Meow.
        hewan2.suara(); // Output: Anjing mengeluarkan suara Woof.
    }
}
