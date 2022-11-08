import java.util.Scanner ;

public class Pasien {
    private int ktp;
    private String nama;
    private String noantri ;
    private int biayasementara ;

    static Scanner in = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);

    public void input(){
        System.out.println();
        System.out.println("\t\t\t\t\tMasukkan No Ktp :") ;
        ktp = in.nextInt();
        System.out.println("\t\t\t\t\tMasukkan Nama :") ;
        nama = str.nextLine(); 
    }

    public void read(){
        System.out.println("\t\t\t\t|| " + ktp + "\t|| " +nama+" \t\t|| " );
        
    }
}

        