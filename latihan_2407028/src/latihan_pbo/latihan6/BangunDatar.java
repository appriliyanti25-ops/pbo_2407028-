package latihan_pbo.latihan6;

public class BangunDatar {
    private double varA;
    private double varB;

    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }
    
    public BangunDatar(double varA) {
        this.varA = varA;
    }

    public double getVarA() {
        return varA;
    }

    public double getVarB() {
        return varB;
    }

    public double HitungLuas() {
        return 0;
    }

    public void tampilkan() {
        System.out.println("VarA: " + varA);
        System.out.println("VarB: " + varB);
        System.out.println("Luas Bangun Datar: " + HitungLuas());
    }
}