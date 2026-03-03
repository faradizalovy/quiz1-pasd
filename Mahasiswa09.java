public class Mahasiswa09 {
    String nim;
    String nama;
    int tahunMasuk;
    MataKuliah09[] mataKuliahDiambil;
    int jumlahMK;

    //Konstruktor
    public Mahasiswa09(String nim, String nama, int tahunMasuk, int kpasitasMK) {
        this.nim = nim;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.mataKuliahDiambil = new MataKuliah09[kpasitasMK];
        this.jumlahMK = 0;
    }
    //Method tambah mata kuliah
    public void tambahMataKuliah(MataKuliah09 mk) {
       if (jumlahMK < mataKuliahDiambil.length) {
            mataKuliahDiambil[jumlahMK] = mk;
            jumlahMK++;
        } else {
            System.out.println("Kapasitas mata kuliah penuh!"); 
        }
    }
    //Method hitung total SKS
    public int hitungTotalSKS() {
        int total = 0;
        for (int i = 0; i < jumlahMK; i++) {
        total += mataKuliahDiambil[i].sks;
        }
        return total;
    }
    //Method tampilkan info mahasiswa
     public void tampilkanInfo() {
        System.out.println("NIM               : " + nim);
        System.out.println("Nama              : " + nama);
        System.out.println("Tahun Masuk       : " + tahunMasuk);
        System.out.println("Daftar Mata Kuliah:");
        for (int i = 0; i < jumlahMK; i++) {
            mataKuliahDiambil[i].tampilkanInfo();
        }
        System.out.println("Total SKS : " +hitungTotalSKS());
        System.out.println("==================================");
    }
}
