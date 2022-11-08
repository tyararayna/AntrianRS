import java.util.Scanner;

public class MainAntrian {
    static Scanner in = new Scanner(System.in);
    private jalurPendaftaran jp;
    private Dokter dr;
    private Pasien ps;
    
    public void mulai(){
        ps = new Pasien();
        //ps.printNama();
        
        jp = new jalurPendaftaran(1);
        jp.jenisDaftar();
        
        //dr = new Dokter("Fatiya", 1);
        //dr.jenisPoli(1);
        
        //jp.Biaya();
        //System.out.println(jp.Biaya());
    }
    
    public static void main(String[] args) {
        MainAntrian main = new MainAntrian();
    
        main.mulai();

        
    }
}
