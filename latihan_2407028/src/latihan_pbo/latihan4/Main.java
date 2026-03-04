package latihan_pbo.latihan4;

public class Main {
    public static void main(String[] args) {

        // ===== PERSEGI =====
        Persegi p = new Persegi(4);
        System.out.println("=== PERSEGI ===");
        System.out.println("Luas      : " + p.luas());
        System.out.println("Keliling  : " + p.keliling());

        // ===== PERSEGI PANJANG =====
        PersegiPanjang pp = new PersegiPanjang(10, 5);
        System.out.println("\n=== PERSEGI PANJANG ===");
        System.out.println("Luas      : " + pp.luas());
        System.out.println("Keliling  : " + pp.keliling());

        // ===== SEGITIGA =====
        Segitiga sg = new Segitiga(6, 4, 3, 4, 5);
        System.out.println("\n=== SEGITIGA ===");
        System.out.println("Luas      : " + sg.luas());
        System.out.println("Keliling  : " + sg.keliling());

        // ===== LINGKARAN =====
        Lingkaran l = new Lingkaran(7);
        System.out.println("\n=== LINGKARAN ===");
        System.out.println("Luas      : " + l.luas());
        System.out.println("Keliling  : " + l.keliling());
    }
}
