import java.util.Scanner;
/**
 * @author (Tyara Raynasari & Ayu Aulia)
 * @version (2108107010030 & 2108107010038)
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
        jp = new jalurPendaftaran(1);
        jp.jenisDaftar();
    }
    
    public void pilihPoli(){
        System.out.println("\n\t\t\tPilih jenis poli : \n");
        System.out.println("\t\t1. Poli Umum");
        System.out.println("\t\t2. Poli Kulit");
        System.out.println("\t\t3. Poli Mata");
        System.out.println("\t\t4. Poli THT");
        System.out.println("\t\t5. Poli Gigi");
        System.out.println("\t\t6. Poli Kandungan\n");
    }

    public static void main(String[] args){
        main m = new main();
        int menu=0;
        
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
            
        System.out.println("\t\t\t\t==========================\t\t\t");
        System.out.println("\t\t\t\t===== SELAMAT DATANG =====\t\t\t");
        System.out.println("\t\t\t\t= di Klinik Cempaka Tiga =\t\t\t");
        System.out.println("\t\t\t\t==========================\t\t\t");
        detailAntrian que=new detailAntrian();
        do{
        
        System.out.println("\n\t\t1. Ingin Ambil Antrian\n\t\t2. Pemanggilan Antrian\n\t\t3. Lihat Data Antrian\n\t\t4. Keluar ");
        System.out.print("\nMasukkan Pilihan Anda : ");
            menu = in.nextInt();
            
            if(menu==1){
                que.enque();
                
                m.mulai();
                m.pilihPoli();
                System.out.print("Masukkan Pilihan Anda : ");
            
                pilihan = in.nextInt();
            
                if(pilihan == 1){
                    System.out.println("");
                    Poli[0].display();
                    System.out.println("Dokter : " + arr[0].display()); 
                }else if(pilihan == 2){
                    System.out.println("");
                    Poli[1].display();
                    System.out.print("Dokter : " + arr[1].display());
                }else if(pilihan == 3){
                    System.out.println("");
                    Poli[2].display();
                    System.out.print("Dokter : " + arr[2].display());
                }else if(pilihan == 4){
                    System.out.println("");
                    Poli[3].display();
                    System.out.print("Dokter : " + arr[3].display());
                }else if(pilihan == 5){
                    System.out.println("");
                    Poli[4].display();
                    System.out.print("Dokter : " + arr[4].display());
                }else if(pilihan == 6){
                    System.out.println("");
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
            System.out.println("- Keluar -");
        }else {
            System.out.println("- Salah -");
            System.out.println("");
        }
            
        System.out.println("");
        }while(menu != 4);
    }

}    