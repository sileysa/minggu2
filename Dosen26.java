package minggu2;

public class Dosen26 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    int join;

    public Dosen26(){

    }

    public Dosen26(String id, String nm, boolean st, int gabung, String ahli){
        idDosen = id;
        nama = nm;
        statusAktif = st;
        tahunBergabung = gabung;
        bidangKeahlian = ahli;
    }

    void tampilkanInformasi(){
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Masa Kerja: " + join);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    boolean setStatusAktif(boolean status){
        
        if (status == true) {
            System.out.println("Aktif");
        } else {
            System.out.println("Tidak Aktif");
        }
        statusAktif = status;
        return statusAktif;
    }

    int hitungMasaKerja(int thnSkrng){
        return join = thnSkrng - tahunBergabung;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}
