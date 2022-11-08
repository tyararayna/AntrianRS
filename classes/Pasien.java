import java.util.Scanner;
public class Pasien{
    int ktp;
    String nama,jalurPendaftaran;
    public Pasien next;
    
    static Scanner in=new Scanner(System.in);
    static Scanner str=new Scanner(System.in);
    
    public Pasien(){
        
    }
    
    public String getNama()
    {
        return this.nama;
    }
    
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