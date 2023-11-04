package Binatang;
public class Anjing extends Binatang {
  private String nama;

  Anjing (String nama) {
    super ("Anjing");
    this.nama = nama;
  }

  public void suara () {
    System.out.println("menggonggong");
  }

  public String toString () {
    return super.toString() + " " + nama;
  }
}
