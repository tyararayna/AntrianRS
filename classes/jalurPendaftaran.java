import java.util.Scanner;
/**
 * Write a description of class jalurPendaftaran here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class jalurPendaftaran extends Registrasi
{
    // instance variables - replace the example below with your own
    private int jenis;
    private int Biaya;
    private Scanner input = new Scanner(System.in);
        
    public jalurPendaftaran(int jenis)
    {
        
    }
    
    public void setJenis(int j){
        this.jenis = j;
    }
    
    public int getJenis()
    {
        return jenis;
    }
    
    public void setBiaya(int b){
        this.Biaya = b;
    }
    
    public void jenisDaftar(){
        do{
            System.out.println("=========Jalur Daftar=========");
            System.out.println("\t\t1. BPJS");
            System.out.println("\t\t2. Asuransi");
            System.out.println("\t\t3. Pribadi");
            System.out.print("Masukkan pilihan anda :");
            jenis = input.nextInt();
                
            if (jenis == 1) {
                System.out.println("Anda Memilih Jalur BPJS");
            }else if (jenis == 2){
                System.out.println("Anda Memilih Jalur Asuransi");
            }else if (jenis == 3){
                System.out.println("Anda Memilih Jalur Pribadi");
            }
            
        }while(jenis > 3);
            Biaya();
        
    }
    
    public int Biaya()
    {
    do{
        
        if(getJenis() == 1){
            return Biaya; 
        }else if(getJenis() == 2){
            return Biaya += 25000;
        }else if(getJenis() == 3){
            return Biaya += 50000;
        }
    
    }while(getJenis() > 3);
        return 0;
    }
}