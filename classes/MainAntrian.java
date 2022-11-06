import java.util.Scanner;

public class MainAntrian {
    private boolean ulang; 
    private Pasien p1;
    private jalurPendaftaran jp;
    private Dokter dr;
    private detailAntrian antri;
    public Scanner input = new Scanner(System.in);
    
    public MainAntrian(){
        
    }

    public void mulai(){
        p1 = new Pasien(0, "Pasien1");

        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        p1.setNama(nama);
        
        dr = new Dokter("Ayu", 1);
        dr.dataPoli();

    }
    public static void main(String[] args) {
        MainAntrian main = new MainAntrian();
    
        main.mulai();

        
    }
}
