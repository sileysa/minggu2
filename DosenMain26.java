package minggu2;

public class DosenMain26 {
    public static void main(String[] args) {
        Dosen26 ds1 = new Dosen26();
        ds1.idDosen = "MQ";
        ds1.nama = "Mungki Astiningrum, ST., M.Kom.";
        ds1.statusAktif = true;
        ds1.tahunBergabung = 2000;
        ds1.bidangKeahlian = "ALSD";

        ds1.setStatusAktif(false);
        ds1.hitungMasaKerja(2025);
        ds1.ubahKeahlian("DasPro");
        ds1.tampilkanInformasi();

        Dosen26 ds2 = new Dosen26("AF", "Astrifidha Rahma Amalia,S.Pd., M.Pd.", true, 2010, "Agama");
        ds2.setStatusAktif(false);
        ds2.hitungMasaKerja(2025);
        ds2.tampilkanInformasi();
    }
}
