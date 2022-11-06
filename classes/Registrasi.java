import java.util.ArrayList ;
import java.util.Date ;
import java.util.List ;

public class Registrasi {
    private String NoAntri ;
    private Dokter Dokter ;
    private Date Tanggal ;
    private int Biaya ;
    private List<Registrasi> Antrian = new ArrayList<Registrasi>() ;

    public Registrasi (){
        NoAntri = "A1" ;
        Biaya = 25000 ;
    }

    public String getNoantri() {
        return NoAntri;
    }
    public void setNoAntri(String noantri) {
        this.NoAntri = noantri;
    }

    public Dokter getDokter() {
        return Dokter;
    }
    public void setDokter(Dokter Dokter) {
        this.Dokter = Dokter;
    }

    public Date getTanggal() {
        return Tanggal ;
    }
    public void setTanggal (Date Tanggal) {
        this.Tanggal = Tanggal ;
    }

    public int getBiaya() {
        return Biaya ;
    }
    public void setBiaya (int Biaya) {
        this.Biaya = Biaya ;
    }

}