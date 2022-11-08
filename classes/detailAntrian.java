class linked{
    Pasien head,tail;
    public linked(){
        head=null;
        tail=null;
    }
    public void enque(){
        Pasien baru=new Pasien();
        baru.input();
        if(head==null)head=baru;
        else tail.next=baru;
        tail=baru;
    }
    public void deque(){
        if(head==null)System.out.println("- Kosong -");
        else{
            System.out.println("Data Keluar Sesuai No ktp : "+head.id);
            head=head.next;
        }
    }
    public void view(){
        if(head==null)System.out.println("- Kosong -");
        else{
            System.out.println("|| Id \t|| Nama \t|| Keperluan \t||");
            for(Pasien a=head; a!=null; a=a.next) a.read();
        }
    }
}