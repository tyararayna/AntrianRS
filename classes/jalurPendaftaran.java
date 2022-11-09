import java.util.Scanner;

/**
 * @author (Tyara Raynasari & Ayu Aulia)
 * @version (2108107010030 & 2108107010038)
 */
public class jalurPendaftaran extends Registrasi
{
    private int jenis;
    private int Biaya;
    private Scanner input = new Scanner(System.in);
    
    /**
    * Method constructor pada kelas jalurPendaftaran dengan parameter jenis 
    * @param jenis
    */ 
    public jalurPendaftaran(int jenis)
    {
        this.jenis = jenis;
    }
    
    /**
    * Method mutator yang berfungsi untuk mengubah atau mengatur Jenis
    * @param j (jenis)
    */
    public void setJenis(int j){
        this.jenis = j;
    }
    
    /**
    * Method yang berfungsi untuk mengembalikan Jenis
    * @return jenis
    */
    public int getJenis()
    {
        return jenis;
    }
    
    /**
    * Tampilan untuk pemilihan menu Jalur Daftar yang tersedia
    * Pasien dapat memilih jalur BPJS, Asuransi, atau Pribadi
    */
    public void jenisDaftar(){
        do{
            System.out.println("\t\t\t\t===== Jalur Pendaftaran =====\t\t\t");
            System.out.println("\n\t\t1. BPJS");
            System.out.println("\t\t2. Asuransi");
            System.out.println("\t\t3. Pribadi");
            System.out.print("\nMasukkan pilihan anda :");
            jenis = input.nextInt();
                
            if (jenis == 1) {
                System.out.println("\nAnda Memilih Jalur BPJS");
            }else if (jenis == 2){
                System.out.println("Anda Memilih Jalur Asuransi");
            }else if (jenis == 3){
                System.out.println("Anda Memilih Jalur Pribadi");
                
            }
            
        }while(jenis > 3);
            Biaya();
    }
    
    /**
     * untuk menampilkan ke layar biaya jalur pendaftaran yang sesuai dipilih oleh user
     */
    
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

    }

    /**
    * Method mutator untuk mengubah atau mengatur Biaya
    * @param b 
    */
    public void setBiaya(int b){
        this.Biaya = b;
    }
    
    /**
    * Method Accesor untuk mengembalikan biaya
    * @return Biaya
    */

    public int getBiaya(){
        return Biaya;
    }
    
}