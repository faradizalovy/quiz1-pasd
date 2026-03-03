public class MahasiswaMain09 {
    public static void main(String[] args) {
        
        MataKuliah09 mk1 = new MataKuliah09("SIB001", "ALGORITMA DAN STRUKTUR DATA", 3);
        MataKuliah09 mk2 = new MataKuliah09("SIB002", "BASIS DATA", 4);
        MataKuliah09 mk3 = new MataKuliah09("SIB003", "DASAR PEMROGRAMAN", 2);

        Mahasiswa09 mhs1 = new Mahasiswa09("254107060109", "Faradiza Lovy", 2025, 5);

        mhs1.tambahMataKuliah(mk1);
        mhs1.tambahMataKuliah(mk2);
        mhs1.tambahMataKuliah(mk3);

        mhs1.tampilkanInfo();
    }
}
