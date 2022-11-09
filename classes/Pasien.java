import java.util.Scanner;
public class Pasien{
    int ktp;
    String nama,jalurPendaftaran;
    public Pasien next;
    
    static Scanner in=new Scanner(System.in);
    static Scanner str=new Scanner(System.in);
    
    /*
    * Method constructor pada kelas Pasien
    * 
    */
    public Pasien(){ 
    }
    
    /*
    * Method Accessor yang berfungsi untuk mengembalikan nama
    */
    public String getNama()
    {
        return this.nama;
    }
    
    /*
    * berguna untuk menginput data dari user agar bisa dimasukkan ke dalam antrian
    */
    public void input(){
        System.out.print("Masukkan No ktp : ");
        ktp = in.nextInt();
        System.out.print("Masukkan nama   : ");
        nama = str.nextLine();
        next=null;
    }
    public void read(){
        System.out.println("|| "+ktp+" \t|| "+nama+" \t|| "+jalurPendaftaran+" \t||");
    }
}