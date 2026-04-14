package latihan_pbo.latihan6;

public class PersegiPanjang extends BangunDatar {
    public PersegiPanjang(double panjang, double lebar) {
        super(panjang,  lebar);
    }

    @Override
    public double HitungLuas() {
        return getVarA() * getVarB();
    }

    @Override
    public void tampilkan() {
        System.out.println("=== Perssegi Panjang ===");
        System.out.println("Panjang: " + getVarA());
        System.out.println("Lebar: " + getVarB());
        System.out.println("Luas: " + HitungLuas());
    }

} 
