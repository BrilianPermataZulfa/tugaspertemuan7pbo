import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("||                                         ||");
        System.out.println("||    APLIKASI KURSUS BAHASA INGGRIS       ||");
        System.out.println("||                                         ||");
        System.out.println("=============================================");
        System.out.println();
        Scanner input = new Scanner(System.in);
        int pilih;
        System.out.println("=============== Daftar Siswa ================");
        Siswabelumlulus siswa1 = new Siswabelumlulus(12345,"Permata Brilian Zulfa ");
        System.out.println("NIS           : "+siswa1.nis);
        System.out.println("NAMA          : "+siswa1.nama);
        System.out.println("STATUS        : "+siswa1.jenis());
        System.out.println("DESKRIPSI     : "+siswa1.deskripsi());
        System.out.println("NO IJAZAH     : "+siswa1.ijazah(111111));
        System.out.println();

        Siswasudahlulus siswa2 = new Siswasudahlulus(67890,"Brilian Permata Zulfa");
        System.out.println("NIS           : "+siswa2.nis);
        System.out.println("NAMA          : "+siswa2.nama);
        System.out.println("STATUS        : "+siswa2.jenis());
        System.out.println("DESKRIPSI     : "+siswa2.deskripsi());
        System.out.println("NO IJAZAH     : "+siswa2.ijazah(111112));
        System.out.println();

        System.out.println("Lanjutkan Mengisi Data Kursus");
        System.out.println("1. Iya");
        System.out.println("2. Tidak");
        System.out.println("Pilih :  ");
        pilih = input.nextInt();
        if (pilih == 1) {

            Pengajar Pengajar = new Pengajar();
            Pengajar.input_data();
            Pengajar.update_data();
            Pelanggan Pelanggan = new Pelanggan();
            Pelanggan.input_data();
            Pelanggan.lihat_data();
            Petugas Petugas = new Petugas();
            Petugas.input_data();
            Petugas.update_data();
            Kursusbahasainggris Kursusbahasainggris = new Kursusbahasainggris();
            Kursusbahasainggris.input_data();
            Kursusbahasainggris.jenis_kelas();
            Kursusbahasainggris.update_data();
        }
        else if (pilih==2) {
            System.exit(0);
        }else{
            System.out.println("INVALID !!!");
        }
    }
}