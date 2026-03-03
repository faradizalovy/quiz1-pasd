public class MataKuliah09 {
    String kodeMK;
    String namaMK;
    int sks;

    //Konstruktor untuk menginisialisasi semua atribut
    public MataKuliah09(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        if (sks >= 2) {
            this.sks = sks;
        } else {
            System.out.println("SKS minimal adalah 2 (tidak boleh kurang dari)");
            this.sks = 2;
        }
    }
    //Method tampilkan info untuk menampilkan informasi mata kuliah
    public void tampilkanInfo() {
        System.out.println("Kode MK : " + kodeMK);
        System.out.println("Nama MK : " + namaMK);
        System.out.println("SKS     : " + sks);
        System.out.println("-------------------------------");
    }
    //Method ubah nama MK
    public void ubahNamaMK(String namaMKBaru) {
        this.namaMK = namaMKBaru;
    }
    //Method ubah SKS dengan validasi
    public void ubahSKS(int sksBaru) {
        if (sksBaru >= 2) {
            this.sks = sksBaru;
        } else {
            System.out.println("Jumlah SKS tidak boleh kurang dari 2!");
        }
    }
}