import java.util.Scanner;
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    static Scanner in = new Scanner(System.in);
    private jalurPendaftaran jp;
    private Dokter dr;
    private Pasien ps;
    private int pilihan;
    
    public void mulai(){
        ps = new Pasien();
        //ps.printNama();
        
        jp = new jalurPendaftaran(1);
        jp.jenisDaftar();
        
        //jp.Biaya();
        //System.out.println(jp.Biaya());
    }
    
    public static void main(String[] args){
        main m = new main();
        int menu=0;
        m.mulai();
        
        Dokter[] arr;
        
        arr = new Dokter[6];
        arr[0] = new Dokter("dr. Fatimah");
        arr[1] = new Dokter("dr. Siti Hajar");
        arr[2] = new Dokter("dr. Solehah");
        arr[3] = new Dokter("dr. Zainal");
        arr[4] = new Dokter("drg. Ratika");
        arr[5] = new Dokter("dr. Soleh");
        int pilihan = 0;
        
        System.out.println("\tPilih jenis poli : ");
            System.out.println("\t\t\t 1. Poli Umum");
            System.out.println("\t\t\t 2. Poli Kulit");
            System.out.println("\t\t\t 3. Poli Mata");
            System.out.println("\t\t\t 4. Poli THT");
            System.out.println("\t\t\t 5. Poli Gigi");
            System.out.println("\t\t\t 6. Poli Kandungan\n");
            System.out.print("\t\t\t Masukkan Pilihan Anda : ");
        
            pilihan = in.nextInt();
            
            if(pilihan == 1){
                System.out.print("Dokter :" + arr[0].display()); 
            }else if(pilihan == 2){
                System.out.print("Dokter :" + arr[1].display());
            }else if(pilihan == 3){
                System.out.print("Dokter :" + arr[2].display());
            }else if(pilihan == 4){
                System.out.print("Dokter :" + arr[3].display());
            }else if(pilihan == 5){
                System.out.print("Dokter :" + arr[4].display());
            }else if(pilihan == 6){
                System.out.print("Dokter :" + arr[5].display());
            }else{
                System.out.println("Tidak tersedia");
            }
            
        detailAntrian que=new detailAntrian();
        do{
            System.out.print("\n1.Enqueue\n2.Dequeue\n3.View\n4.Exit\n : ");
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
