package latihan_pbo.latihan6;

public class Persegi extends BangunDatar {

    public Persegi(double sisi) {
        super(sisi);
    }

    @Override
    public double HitungLuas() {
        return getVarA() * getVarA();
    }

    @Override
    public void tampilkan() {
        System.out.println("=== Persegi ===");
        System.out.println("Sisi: " + getVarA());
        System.out.println("Luas: " + HitungLuas());
    }
}
