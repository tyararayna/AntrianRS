import java.util.LinkedList;

/**
 * @author (Tyara Raynasari & Ayu Aulia)
 * @version (2108107010030 & 2108107010038)
 */
public class detailAntrian{
    Pasien head, tail;
    
    public detailAntrian(){
        head = null;
        tail = null;
    }
    public void enque(){
        Pasien baru = new Pasien();
        baru.input();
        if(head == null){
            head = baru;
        }
        else
            tail.next = baru;
            tail = baru;
    }
    public void deque(){
        if(head == null){
            System.out.println("- Belum ada data yang diisi -");
        }else{
            System.out.println("Antrian dengan no.ktp "+head.ktp+ " atas nama "+head.nama);
            head = head.next;
        }
    }
    public void view(){
        if(head == null){
            System.out.println("- Data Kosong -");
        }else{
            System.out.println("=====================================") ;
            System.out.println(" Id \t\t Nama \t\t ");
            System.out.println("=====================================") ;
            for(Pasien a=head; a!=null; a=a.next)
            a.read();
        }
    }
}