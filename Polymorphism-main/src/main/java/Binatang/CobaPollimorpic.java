package Binatang;

import java.util.Random;

public class CobaPollimorpic {
    public static void main(String[] args) throws Exception {
        Binatang[] peliharaanku = {new Burung("Kakak Tua"), new Kambing("Etawa"), new Anjing("Kintamani"), new Kucing("Anggora")};
        Binatang kesayangan;
        Random pilihan = new Random();

        kesayangan = peliharaanku[pilihan.nextInt(peliharaanku.length)];
        System.out.println("Binatang Kesayangan anda : " + kesayangan);
        System.out.print("Suaranya : ");
        kesayangan.suara();
    }
}
