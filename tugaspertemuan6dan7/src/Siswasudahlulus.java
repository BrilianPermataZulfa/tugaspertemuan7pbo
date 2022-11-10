public class Siswasudahlulus extends Siswa {

    public Siswasudahlulus(int nis, String nama) {
        super(nis, nama);
    }

    @Override
    public String jenis() {
        return "Siswa Sudah Lulus";
    }

    @Override
    public String deskripsi() {
        return "Siswa Yang Telah Menguasai bahasa inggris dengan poin TOEFL di atas 600";
    }
    public int ijazah(int ijazah){
        return ijazah;
    }
}
