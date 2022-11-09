import java.util.LinkedList;

public class detailAntrian{
    Pasien head,tail;
    
    public detailAntrian(){
        head=null;
        tail=null;
    }
    public void enque(){
        Pasien baru=new Pasien();
        baru.input();
        if(head==null){
            head=baru;
        }
        else {
            tail.next=baru;
            tail=baru;
        }
    }
    public void deque(){
        if(head==null){
            System.out.println("- Belum ada data yang diisi -");
        }else{
            System.out.println("Antrian dengan no.ktp "+head.ktp+ " atas nama "+head.nama);
            head=head.next;
        }
    }
    public void view(){
        if(head==null){
            System.out.println("- Data Kosong -");
        }else{
            System.out.println("|| Id \t|| Nama \t|| Keperluan \t||");
            for(Pasien a=head; a!=null; a=a.next) a.read();
        }
    }
}