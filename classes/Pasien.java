public class Pasien {
    private int ktp;
    private String nama;
    private String noantri ;
    private int biayasementara ;

        public Pasien(int ktp, String nama) {
            this.ktp = ktp;
            this.nama = nama;
        }
    
        public int getKtp() {
            return ktp;
        }
    
        public void setKtp(int ktp) {
            this.ktp = ktp;
        }
    
        public String getNama() {
            return nama;
        }
    
        public void setNama(String nama) {
            this.nama = nama;
        }
    
        public String getnoantri() {
            return noantri;
        }
    
        public void setNoantri(String noantri) {
            this.noantri = noantri;
        }

        public int getBiayasementara() {
            return biayasementara;
        }
    
        public void setBiayasementara( int biayasementara) {
            this.biayasementara = biayasementara ;
        }
    
    }