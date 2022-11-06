public class detailAntrian {
    private Pasien pasien;  
    private int noAntrian;

    public detailAntrian(Pasien pasien, int noAntrian) {
        this.pasien = pasien;
        this.noAntrian = noAntrian;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public int getNoAntrian() {
        return noAntrian;
    }

    public void setNoAntrian(int noAntrian) {
        this.noAntrian = noAntrian;
    }

}
