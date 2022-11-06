import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class Dokter {
    public Scanner input = new Scanner(System.in);
    private String nama;
    private String poli;
    private int Ruang;
    private int pilihan;
    private Pasien p1;
    
        public Dokter(String nama, int Ruang) {
            this.nama = nama; 
            this.Ruang = Ruang;
        }
    
        public String getNama() throws IOException{
        // try{
        //     File file = new File("DataDokter.txt");
            
        //     Scanner scan = new Scanner(file);
        //     while(scan.hasNextLine()){
        //         String getDataString = scan.nextLine();
        //         System.out.println(getDataString);
        //     }
        //     scan.close();
        // }catch(FileNotFoundException ex){
        //     System.out.println("File Tidak Ditemukan"); 
        // }
            return nama;
        }
    
        public void setNama(String nama) {
            this.nama = nama;
        }
    
        public String getPoli(){
            return poli;
        }

        public void setPoli(String poli){
            this.poli = poli; 
        }
        public int getRuang() {
            return Ruang;
        }
    
        public void setRuang(int Ruang) {
            this.Ruang = Ruang;
        }

        public void dataPoli(){
            System.out.println("\tPilih jenis poli : ");
            System.out.println("\t\t\t 1. Poli Umum");
            System.out.println("\t\t\t 2. Poli Kulit");
            System.out.println("\t\t\t 3. Poli Mata");
            System.out.println("\t\t\t 4. Poli THT");
            System.out.println("\t\t\t 5. Poli Gigi");
            System.out.println("\t\t\t 6. Poli Kandungan");

            pilihan = input.nextInt();
            switch(pilihan) {
                case '1' :
                System.out.println(p1.getNama() + " dengan Dokter  : dr. Hayatun Nufus" + "Ruang : 1" + p1.getnoantri());
                break;
                
                case '2' : 
                System.out.println(p1.getNama() + " dengan Dokter  : dr. Hayatun Nufus" + "Ruang : 1" + p1.getnoantri());
                break;
            }
        }
        
    }