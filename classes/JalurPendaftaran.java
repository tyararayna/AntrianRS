import java.util.ArrayList ;
import java.util.Date ;
import java.util.List ;

public class JalurPendaftaran{
    private String NoAntri ;
    private Dokter Dokter ;
    private Date Tanggal ;
    private int Biaya ;
    private List<JalurPendaftaran> Antrian = new ArrayList<JalurPendaftaran>() ;

    public Dokter getDokter() {
        return Dokter;
    }
    public void setDokter(Dokter Dokter) {
        this.Dokter = Dokter;
    }



}