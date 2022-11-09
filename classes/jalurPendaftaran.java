import java.util.Scanner;

public class jalurPendaftaran extends Registrasi
{
    // instance variables - replace the example below with your own
    private int jenis;
    private int Biaya;
    private Scanner input = new Scanner(System.in);
    
    /*
    * Method constructor pada kelas jalurPendaftaran dengan parameter jenis 
    */ 
    public jalurPendaftaran(int jenis)
    {
        this.jenis = jenis;
    }
    
    /*
    * Method mutator yang berfungsi untuk mengubah atau mengatur Jenis
    */
    public void setJenis(int j){
        this.jenis = j;
    }
    
    /*
    * Method yang berfungsi untuk mengembalikan Jenis
    */
    public int getJenis()
    {
        return jenis;
    }
    
    /**
    * Tampilan untuk pemilihan menu Jalur Daftar yang tersedia
    * Pasien dapat memilih jalur BPJS, Asuransi, atau Pribadi
    * 
    */
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
    
    public void Biaya()
    {
        do{
            if(getJenis() == 1){
                System.out.println("Biaya pendaftaran : Rp 0"); 
            }else if(getJenis() == 2){
                System.out.println("Biaya pendaftaran : Rp 25000"); 
            }else if(getJenis() == 3){
                System.out.println("Biaya pendaftaran : Rp 50000"); 
            }
        
        }while(getJenis() > 3);
            //return 0;
    }

    /*
    * Method mutator untuk mengubah atau mengatur Biaya
    */
    public void setBiaya(int b){
        this.Biaya = b;
    }
    
    
    /*
    * Method Accesor untuk mengembalikan biaya
    */
    public int getBiaya(){
        return this.Biaya;
    }
    
}