package minggu2;

public class MataKuliahMain26 {
    public static void main(String[] args) {
        MataKuliah26 mk1 = new MataKuliah26();
        mk1.kodeMK = "PRAKALSD";
        mk1.nama = "Praktikum Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(1);
        mk1.kurangiJam(2);
        mk1.tampilkanInformasi();

        MataKuliah26 mk2 = new MataKuliah26("ALSD", "Algoritma dan Struktur Data", 2, 4);
        mk2.ubahSKS(1);
        mk2.kurangiJam(2);
        mk2.tampilkanInformasi();
    }
}
