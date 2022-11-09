import java.util.Scanner;

/**
 * @author (Tyara Raynasari & Ayu Aulia)
 * @version (2108107010030 & 2108107010038)
 */
public class Poli {
    public Scanner input = new Scanner(System.in);
    private String namaPoli;
    private int pilihan;
    private int ruang ;
  
        public Poli(String namaPoli, int ruang) {
            this.namaPoli = namaPoli ;
            this.ruang = ruang ;
        }
    
        public String getNamaPoli(){
            return namaPoli ;
        }
        
        public void setNama(){
            this.namaPoli= namaPoli;
        }

        public int getRuang(){
            return ruang ;
        }
        public void setRuang(){
            this.ruang = ruang ;
        }
        
        public void display(){
            System.out.print(namaPoli + " di Ruang " + ruang + "\n");
        }

}