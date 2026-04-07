package latihan_pbo.latihan3;

import java.util.Scanner;

// class biasa (TIDAK public)
class KamarHotel {
    private String tipeKamar;
    private String fasilitas1;
    private String fasilitas2;
    private String fasilitas3;
    private String fasilitas4;
    private String fasilitas5;

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

    public void setFasilitas4(String fasilitas4) {
        this.fasilitas4 = fasilitas4;
    }

    public void setFasilitas5(String fasilitas5) {
        this.fasilitas5 = fasilitas5;
    }

    public void tampil() {
        System.out.println("Tipe Kamar : " + tipeKamar);
        System.out.println("Fasilitas 1: " + fasilitas1);
        System.out.println("Fasilitas 2: " + fasilitas2);
        System.out.println("Fasilitas 3: " + fasilitas3);
        System.out.println("Fasilitas 4: " + fasilitas4);
        System.out.println("Fasilitas 5: " + fasilitas5);
    }
}

// class utama (public)
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KamarHotel k = new KamarHotel();

        System.out.print("Masukkan kode kamar (1/2/3/4/5): ");
        int kode = input.nextInt();

        if (kode == 1) {
            k.setTipeKamar("Standard");
            k.setFasilitas1("Bed Single");
            k.setFasilitas2("AC");
            k.setFasilitas3("Kamar Mandi private");

        } else if (kode == 2) {
            k.setTipeKamar("Deluxe");
            k.setFasilitas1("Bed Queen");
            k.setFasilitas2("AC");
            k.setFasilitas3("TV");
            k.setFasilitas4("Kamar Mandi private");

        } else if (kode == 3) {
            k.setTipeKamar("Suite");
            k.setFasilitas1("Bed King");
            k.setFasilitas2("AC");
            k.setFasilitas3("TV + Bathtub");

        } else if (kode == 4) {
            k.setTipeKamar("Primier");
            k.setFasilitas1("Bed King");
            k.setFasilitas2("AC");
            k.setFasilitas3("TV + Bathtub");
            k.setFasilitas4("Balkon");

         } else if (kode == 5) {
            k.setTipeKamar("Premium");
            k.setFasilitas1("Bed King");
            k.setFasilitas2("AC");
            k.setFasilitas3("TV + Bathtub");
            k.setFasilitas4("Balkon");
            k.setFasilitas5("Kolam Renang Private");


        } else {
            System.out.println("Kode kamar tidak tersedia");
            return;
        }

        System.out.println();
        k.tampil();
    }
}
