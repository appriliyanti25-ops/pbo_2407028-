package latihan_pbo.latihan6;

public class Segitiga extends BangunDatar {
    
    public Segitiga(double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    public double HitungLuas() {
        return 0.5 * getVarA() * getVarB();
    }

    @Override
    public void tampilkan() {
        System.out.println("=== Segiiga ===");
        System.out.println("Alas: " + getVarA());
        System.out.println("Tinggi: " + getVarB());
        System.out.println("Luas: " + HitungLuas());
    }
}
