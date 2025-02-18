package minggu2;

public class MataKuliah26 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah26(){

    }

    public MataKuliah26(String kode, String nm, int sks, int jmlJam){
        kodeMK = kode;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmlJam;
    }

    void tampilkanInformasi(){
        System.out.println("Kode Matkul: " + kodeMK);
        System.out.println("Nama Matkul: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }

    void tambahJam(int tambahJam){
        jumlahJam += tambahJam;
    }

    void kurangiJam(int kurangiJam){
        jumlahJam -= kurangiJam;
    }
}
