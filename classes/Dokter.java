
/**
 * @author (Tyara Raynasari & Ayu Aulia)
 * @version (2108107010030 & 2108107010038)
 */
public class Dokter {
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
        * @return nama
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
        * @return nama
        */
        public String display(){
            return nama;
        }
}