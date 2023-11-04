package Binatang;

public class Burung extends Binatang {
  private String nama;

  Burung (String nama) {
    super ("Burung");
    this.nama = nama;
  }

  public void suara () {
    System.out.println("berkicau");
  }

  public String toString () {
    return super.toString() + " " + nama;
  }
}
