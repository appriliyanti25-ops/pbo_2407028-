package latihan_pbo.latihan1;

class Cafe{
    String nama;
    String alamat;

    // construktor
    Cafe (String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        System.out.println("nama cafe nya adalah : " + nama);
        System.out.println("alamatnya ada di : " + alamat);
        System.out.println("==========================");
    }

    // method 
    void buka(){
        System.out.println("==========================");
        System.out.println("Cafe sudah buka");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}
public class Main {
    public static void main(String[] args) {


        Cafe cafe1 = new Cafe ("Kenangan",  "IMKOT");
        Cafe cafe2 = new Cafe ( "Harata", "IMKOT");
        Cafe cafe3 = new Cafe ( "Halaman", "Jatibarang");
        Cafe cafe4 = new Cafe ( "Tommoro", "Korea");
        cafe4.buka();
        cafe4.setNama("KopiKu");
    }
}