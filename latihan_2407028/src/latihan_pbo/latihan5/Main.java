package latihan_pbo.latihan5;

public class Main {
    public static void main(String[] args) {

        // ===== BANGUN RUANG =====
        BangunRuang br = new BangunRuang(10, 5, 4);

        System.out.println("=== BANGUN RUANG ===");
        System.out.println("Panjang   : 10");
        System.out.println("Lebar     : 5");
        System.out.println("Tinggi    : 4");
        System.out.println("----------------------");
        System.out.println("Luas Alas : " + br.hitungLuas());
        System.out.println("Volume dari class parent    : " + br.hitungVolume());
        System.out.println("Volume dari class child    : " + br.hitungVolume());
    }
}