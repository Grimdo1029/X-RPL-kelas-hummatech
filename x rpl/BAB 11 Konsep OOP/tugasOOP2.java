public class tugasOOP2 {
    private int kecepatan; 
    private int roda;
    private String tipe;

    public tugasOOP2(int kecepatan, int roda, String tipe) {
        this.kecepatan = kecepatan;
        this.roda = roda;
        this.tipe = tipe;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int getRoda() {
        return roda;
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void tampilkanInfo() {
        System.out.println("Tipe Mobil: " + tipe);
        System.out.println("Kecepatan: " + kecepatan + " km/h");
        System.out.println("Jumlah Roda: " + roda);
    }

    public static void main(String[] args) {
        tugasOOP2 avanza = new tugasOOP2(270, 4, "CUV");

        avanza.tampilkanInfo();
    }
}
