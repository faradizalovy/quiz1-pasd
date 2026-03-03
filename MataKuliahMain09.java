public class MataKuliahMain09 {
    public static void main(String[] args) {
        
        MataKuliah09 mk1 = new MataKuliah09("SIB001", "Algoritma dan Struktur Data", 3);
        MataKuliah09 mk2 = new MataKuliah09("SIB002", "BASIS DATA", 4);

        mk1.tampilkanInfo();
        mk2.tampilkanInfo();

        //Ubah nama dan SKS
        mk1.ubahNamaMK("PRAKTIKUM ALGORITMA");
        mk1.ubahSKS(6);

        System.out.println("Setelah diubah: ");
        mk1.tampilkanInfo();
    }
}
