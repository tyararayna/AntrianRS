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
    
    public static void main(String[] args){
        MainAntrian m = new MainAntrian();
        int menu = 0;
        m.mulai();
        
        detailAntrian que=new detailAntrian();
        do{
            System.out.print("1.Enqueue\n2.Dequeue\n3.View\n4.Exit\n : ");
            menu = in.nextInt();
            
            if(menu==1){
                que.enque();   
            }
            else if(menu==2){
                que.deque();
            }
            else if(menu==3){
                que.view();
            }else if(menu==4){
                System.out.println("- keluar -");
            }else {
                System.out.println("- Salah -");
                System.out.println("");
            }
            m.mulai();
        }while(menu != 4);
    }
}
