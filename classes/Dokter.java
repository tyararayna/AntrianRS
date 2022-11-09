import java.util.Scanner;

public class Dokter {
    public Scanner input = new Scanner(System.in);
    private String nama;
    
        /*
        * Method constructor pada kelas Dokter
        * Pada method ini mempunyai parameter yaitu nama 
        */
        public Dokter(String nama) {
            this.nama = nama;
        }
    
        /*
        * Method yang berfungsi untuk mengembalikan Nama
        */
        public String getNama(){
            return nama;
        }

        /*
        * Method yang berfungsi untuk mengubah atau mengatur Nama
        */
        public void setNama(){
            this.nama = nama;
        }
        
        /*
        * method yang berfungsi untuk mengembalikan nama dari value yang telah diinput kedalam array nya
        */
        public String display(){
            return nama;
        }
}