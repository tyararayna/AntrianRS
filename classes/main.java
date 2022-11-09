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
    private Poli poli ;

    public void mulai(){
        ps = new Pasien();
        //ps.printNama();
        
        jp = new jalurPendaftaran(1);
        jp.jenisDaftar();
        
        //jp.Biaya();
        //System.out.println(jp.Biaya());
    }

    /**
    * Tampilan menu untuk memilih jenis poli 
    * Pasien dapat memilih jenis poli 1,2,3,4,5, dan 6
    * 
    */
    public void pilihPoli(){
        System.out.println("\n\tPilih jenis poli : ");
        System.out.println("\t\t\t 1. Poli Umum");
        System.out.println("\t\t\t 2. Poli Kulit");
        System.out.println("\t\t\t 3. Poli Mata");
        System.out.println("\t\t\t 4. Poli THT");
        System.out.println("\t\t\t 5. Poli Gigi");
        System.out.println("\t\t\t 6. Poli Kandungan\n");
    }

    public static void main(String[] args){
        main m = new main();
        int menu=0;
        //m.mulai();
        

        Dokter[] arr;
        
        arr = new Dokter[6];
        arr[0] = new Dokter("dr. Fatimah");
        arr[1] = new Dokter("dr. Siti Hajar");
        arr[2] = new Dokter("dr. Solehah");
        arr[3] = new Dokter("dr. Zainal");
        arr[4] = new Dokter("drg. Ratika");
        arr[5] = new Dokter("dr. Soleh");
        int pilihan = 0;
        
        Poli[] Poli ;
        
        Poli = new Poli[6];
        Poli[0] = new Poli("Poli Umum", 1);
        Poli[1] = new Poli("Poli Kulit", 2);
        Poli[2] = new Poli("Poli Mata", 3);
        Poli[3] = new Poli("Poli THT", 4);
        Poli[4] = new Poli("Poli Gigi", 5);
        Poli[5] = new Poli("Poli Kandungan", 6);
            
        detailAntrian que=new detailAntrian();
        do{
        
        System.out.println("\n1. Ingin Ambil Antrian\n2. Print Antrian\n3. Lihat Data Antrian\n4. Keluar ");
        System.out.println("Masukkan Pilihan Anda : ");
            menu = in.nextInt();
            
            if(menu==1){
                que.enque();
                
                m.pilihPoli();
                System.out.print("\t\t\t Masukkan Pilihan Anda : ");
            
                pilihan = in.nextInt();
            
            if(pilihan == 1){
                Poli[0].display();
                System.out.print("Dokter : " + arr[0].display()); 
            }else if(pilihan == 2){
                Poli[1].display();
                System.out.print("Dokter : " + arr[1].display());
            }else if(pilihan == 3){
                Poli[2].display();
                System.out.print("Dokter : " + arr[2].display());
            }else if(pilihan == 4){
                Poli[3].display();
                System.out.print("Dokter : " + arr[3].display());
            }else if(pilihan == 5){
                Poli[4].display();
                System.out.print("Dokter : " + arr[4].display());
            }else if(pilihan == 6){
                Poli[5].display();
                System.out.print("Dokter : " + arr[5].display());
            }else{
                System.out.println("Tidak tersedia");
            }
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
        
        System.out.println("");
        }while(menu != 4);
    }

}