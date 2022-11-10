import java.util.Scanner;
public class Petugas {
    int id_petugas;
    String nama;
    String tugas;


    final void input_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("DATA PETUGAS");
        System.out.println("Masukan ID Petugas  : ");
        id_petugas=input.nextInt();
        System.out.println("Masukan Nama   :");
        nama= input.next();
        System.out.println("Masukan Tugas   :");
        tugas= input.next();
    }
    void update_data(){

    }
}
