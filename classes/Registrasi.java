import java.util.ArrayList ;
import java.util.List ;

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