import java.util.ArrayList ;
import java.util.List ;

/**
 * @author (Tyara Raynasari & Ayu Aulia)
 * @version (2108107010030 & 2108107010038)
 */
public abstract class Registrasi{
    private int Biaya;
    private List<detailAntrian> Antrian = new ArrayList<detailAntrian>() ;

    public Registrasi(){
        Biaya = 25000;
    }
    
    public int Biaya(int b){
        return Biaya;
    }
    
}