package Binatang;

public class Kucing extends Binatang {
  private String nama;

  Kucing (String nama) {
    super ("Kucing");
    this.nama = nama;
  }

  public void suara () {
    System.out.println("mengeong");
  }

  public String toString () {
    return super.toString() + " " + nama;
  }
}
