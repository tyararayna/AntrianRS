import java.util.Scanner;

public class Dokter {
    public Scanner input = new Scanner(System.in);
    private String nama;
    //private String[] poli;
    //private int[] Ruang;
    private int pilihan;
    //private Pasien ps;
    
        public Dokter(String nama) {
            this.nama = nama;
        }
    
        public String getNama(){
            return nama;
        }
        
        public void setNama(){
            this.nama = nama;
        }
        
        public String display(){
            return nama;
        }
}