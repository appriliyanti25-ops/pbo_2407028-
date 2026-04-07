package latihan_pbo.latihan4;

public class PersegiPanjang extends BangunDatar {

    public PersegiPanjang(double panjang, double lebar) {
        setPanjang(panjang);
        setLebar(lebar);
    }

    public double luas() {
        return getPanjang() * getLebar();
    }

    public double keliling() {
        return 2 * (getPanjang() + getLebar());
    }
}