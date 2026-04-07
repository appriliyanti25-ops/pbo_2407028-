package latihan_pbo.latihan4;

public class Segitiga extends BangunDatar {

    private double s1, s2, s3;

    public Segitiga(double alas, double tinggi, double s1, double s2, double s3) {
        setAlas(alas);
        setTinggi(tinggi);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double luas() {
        return 0.5 * getAlas() * getTinggi();
    }

    public double keliling() {
        return s1 + s2 + s3;
    }
}