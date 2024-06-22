package kursus;

public class Kursus {
    private String namaKursus;
    private double biayaKursus;

    public Kursus(String namaKursus, double biayaKursus) {
        this.namaKursus = namaKursus;
        this.biayaKursus = biayaKursus;
    }

    public String getNamaKursus() {
        return namaKursus;
    }

    public double getBiayaKursus() {
        return biayaKursus;
    }

    public void setNamaKursus(String namaKursus) {
        this.namaKursus = namaKursus;
    }

    public void setBiayaKursus(double biayaKursus) {
        this.biayaKursus = biayaKursus;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Kursus: " + namaKursus);
        System.out.println("Biaya Kursus: Rp" + biayaKursus);
    }
}

