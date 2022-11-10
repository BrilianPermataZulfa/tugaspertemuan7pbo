import java.util.Scanner;

public class Kursusbahasainggris {
    int kode_kursus;
    String nama_kursus;
    String jadwal_kursus;

    int id_pelanggan;
    int id_petugas;
    int id_pengajar;

    final void input_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("DATA KURSUS BAHASA INGGRIS");
        System.out.println("Masukan Kode Kursus       :");
        kode_kursus=input.nextInt();
        System.out.println("Nama Kursus               :");
        nama_kursus= input.next();
        System.out.println("Masukan Jadwal Kursus     :");
        jadwal_kursus= input.next();
        System.out.println("Masukan ID Pelanggan      :");
        id_pelanggan= input.nextInt();
        System.out.println("Masukan ID Petugas        :");
        id_petugas= input.nextInt();
        System.out.println("Masukan ID Pengajar       :");
        id_pengajar= input.nextInt();
    }

    void jenis_kelas(){

    }
    void update_data(){

    }

}
