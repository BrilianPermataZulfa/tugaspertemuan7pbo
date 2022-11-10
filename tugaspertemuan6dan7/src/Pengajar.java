import java.util.Scanner;
public class Pengajar {
    int id_pengajar;
    String nama;


    final void input_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("DATA PENGAJAR");
        System.out.println("Masukan ID Pengajar   : ");
        id_pengajar=input.nextInt();
        System.out.println("Masukan Nama   :");
        nama= input.next();
    }
    void update_data(){

    }
}
