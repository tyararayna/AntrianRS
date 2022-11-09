import java.util.Scanner;

/**
 * @author (Tyara Raynasari & Ayu Aulia)
 * @version (2108107010030 & 2108107010038)
 */
public class Pasien{
    /*
     * merupakan variabel pada kelas pasien 
     */
    int ktp;
    String nama;
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
        System.out.println(ktp +"\t\t "+nama+" \t\t ");
    }
}