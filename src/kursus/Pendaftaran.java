
package kursus;

public class Pendaftaran extends Kursus {
    private String namaPeserta;
    private int durasiKursus; 
    
    public Pendaftaran(String namaKursus, double biayaKursus, String namaPeserta, int durasiKursus) {
        super(namaKursus, biayaKursus); 
        this.namaPeserta = namaPeserta;
        this.durasiKursus = durasiKursus;
    }


    public String getNamaPeserta() {
        return namaPeserta;
    }

    public int getDurasiKursus() {
        return durasiKursus;
    }

    public void setNamaPeserta(String namaPeserta) {
        this.namaPeserta = namaPeserta;
    }

    public void setDurasiKursus(int durasiKursus) {
        this.durasiKursus = durasiKursus;
    }


    public double hitungTotalBiaya() {
        return super.getBiayaKursus() * durasiKursus;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Nama Peserta: " + namaPeserta);
        System.out.println("Durasi Kursus: " + durasiKursus + " minggu");
        double totalBiaya = hitungTotalBiaya();
        System.out.println("Total Biaya: Rp" + totalBiaya);
        if (totalBiaya >= 1000000) {
            double potongan = totalBiaya * 0.1;
            double totalBiayaSetelahPotongan = totalBiaya - potongan;
            System.out.println("Potongan (10%): Rp" + potongan);
            System.out.println("Total Biaya Setelah Potongan: Rp" + totalBiayaSetelahPotongan);
        }
    }
}
