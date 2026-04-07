package latihan_pbo.latihan3;

import java.util.Scanner;

// class biasa (TIDAK public)
class KamarHotel {
    private String tipeKamar;
    private String fasilitas1;
    private String fasilitas2;
    private String fasilitas3;

    public void setTipeKamar(String tipeKamar) {
        this.tipeKamar = tipeKamar;
    }

    public void setFasilitas1(String fasilitas1) {
        this.fasilitas1 = fasilitas1;
    }

    public void setFasilitas2(String fasilitas2) {
        this.fasilitas2 = fasilitas2;
    }

    public void setFasilitas3(String fasilitas3) {
        this.fasilitas3 = fasilitas3;
    }

    public void tampil() {
        System.out.println("Tipe Kamar : " + tipeKamar);
        System.out.println("Fasilitas 1: " + fasilitas1);
        System.out.println("Fasilitas 2: " + fasilitas2);
        System.out.println("Fasilitas 3: " + fasilitas3);
    }
}

// class utama (public)
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KamarHotel k = new KamarHotel();

        System.out.print("Masukkan kode kamar (2/3/4): ");
        int kode = input.nextInt();

        if (kode == 2) {
            k.setTipeKamar("Standard");
            k.setFasilitas1("Bed Single");
            k.setFasilitas2("AC");
            k.setFasilitas3("Kamar Mandi");

        } else if (kode == 3) {
            k.setTipeKamar("Deluxe");
            k.setFasilitas1("Bed Queen");
            k.setFasilitas2("AC");
            k.setFasilitas3("TV");

        } else if (kode == 4) {
            k.setTipeKamar("Suite");
            k.setFasilitas1("Bed King");
            k.setFasilitas2("AC");
            k.setFasilitas3("TV + Bathtub");

        } else {
            System.out.println("Kode kamar tidak tersedia");
            return;
        }

        System.out.println();
        k.tampil();
    }
}
