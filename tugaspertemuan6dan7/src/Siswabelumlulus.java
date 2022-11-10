public class Siswabelumlulus extends Siswa{
    public Siswabelumlulus(int nis, String nama) {
        super(nis, nama);


    }

    @Override
    public String jenis() {
        return "Siswa Belum Lulus";

    }

    @Override
    public String deskripsi() {
        return "Siswa Yang Belum Menguasai bahasa inggris dengan poin TOEFL di atas 600";
    }
    public int ijazah(int ijazah){
        return ijazah;
    }
}
