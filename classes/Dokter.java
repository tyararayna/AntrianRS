public class Dokter {
    private String nama;
    private String Ruang;
    
        public Dokter(String nama, String Ruang) {
            this.nama = nama;
            this.Ruang = Ruang;
        }
    
        public String getNama() {
            return nama;
        }
    
        public void setNama(String nama) {
            this.nama = nama;
        }
    
        public String getRuang() {
            return Ruang;
        }
    
        public void setRuang(String Ruang) {
            this.Ruang = Ruang;
        }
    
    }