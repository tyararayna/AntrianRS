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

    /**
     * Method Constructor untuk menginisialisasikan namaPoli dan ruang
     * @param namaPoli
     * @param ruang
     */
    public Poli(String namaPoli, int ruang) {
        this.namaPoli = namaPoli ;
        this.ruang = ruang ;
    }
    
    /**
     * Method Accessor untuk mengembalikan namaPoli
     * @return namaPoli
     */
    public String getNamaPoli(){
        return namaPoli ;
    }
    
    /**
     * Method Mutator untuk mengeset nilai namaPoli
     */
    public void setNama(){
        this.namaPoli= namaPoli;
    }

    /**
     * method untuk mengembalikan ruang
     * @return ruang
     */
    public int getRuang(){
        return ruang ;
    }
    
    /**
     * method untuk mengeset ruang
     */
    public void setRuang(){
        this.ruang = ruang ;
    }
        
    /**
     * method untuk menampikan ke layar dokter apa dan posisi ruang
     */
    public void display(){
        System.out.print(namaPoli + " di Ruang " + ruang + "\n");
    }

}