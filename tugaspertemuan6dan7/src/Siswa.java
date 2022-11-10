public class Siswa {
    int nis;
    String nama;

    public Siswa(int nis, String nama) {
        this.nis = nis;
        this.nama = nama;
    }

    public String jenis(){
        return "Siswa Khursus";
    }
    public String deskripsi(){
        return "Belajar khursus bahasa inggris";
    }
    public String harga(){
        return "Satu Juta";
    }
}
