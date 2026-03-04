package latihan_pbo.latihan4;

public class Persegi extends BangunDatar {

    public Persegi(double sisi) {
        setSisi(sisi);
    }

    public double luas() {
        return getSisi() * getSisi();
    }

    public double keliling() {
        return 4 * getSisi();
    }
}