import java.util.Scanner;

class tugasOOP6 {
    protected float luas;
    protected float keliling;

    public tugasOOP6() {}

    public void hitungLuas() {}
    public void hitungKeliling() {}

    public void tampilkanHasil() {
        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling);
    }
}


// Subclass: PersegiPanjang
class PersegiPanjang extends tugasOOP6 {
    private float panjang;
    private float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void hitungLuas() {
        luas = panjang * lebar;
    }

    @Override
    public void hitungKeliling() {
        keliling = 2 * (panjang + lebar);
    }
}


// Subclass: Persegi
class Persegi extends tugasOOP6 {
    private float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungLuas() {
        luas = sisi * sisi;
    }

    @Override
    public void hitungKeliling() {
        keliling = 4 * sisi;
    }
}


// Subclass: Segitiga
class Segitiga extends tugasOOP6 {
    private float alas;
    private float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void hitungLuas() {
        luas = 0.5f * alas * tinggi;
    }

    @Override
    public void hitungKeliling() {
        // Asumsi segitiga sama kaki untuk keliling
        keliling = alas + 2 * (float) Math.sqrt((alas / 2) * (alas / 2) + tinggi * tinggi);
    }
}


// Subclass: Lingkaran
class Lingkaran extends tugasOOP6 {
    private float jariJari;

    public Lingkaran(float jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public void hitungLuas() {
        luas = (float) (Math.PI * jariJari * jariJari);
    }

    @Override
    public void hitungKeliling() {
        keliling = 2 * (float) Math.PI * jariJari;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Persegi Panjang");
            System.out.println("2. Persegi");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Selesai");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang: ");
                    float panjang = scanner.nextFloat();
                    System.out.print("Masukkan lebar: ");
                    float lebar = scanner.nextFloat();
                    PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
                    pp.hitungLuas();
                    pp.hitungKeliling();
                    pp.tampilkanHasil();
                    break;

                case 2:
                    System.out.print("Masukkan sisi: ");
                    float sisi = scanner.nextFloat();
                    Persegi p = new Persegi(sisi);
                    p.hitungLuas();
                    p.hitungKeliling();
                    p.tampilkanHasil();
                    break;

                case 3:
                    System.out.print("Masukkan alas: ");
                    float alas = scanner.nextFloat();
                    System.out.print("Masukkan tinggi: ");
                    float tinggi = scanner.nextFloat();
                    Segitiga s = new Segitiga(alas, tinggi);
                    s.hitungLuas();
                    s.hitungKeliling();
                    s.tampilkanHasil();
                    break;

                case 4:
                    System.out.print("Masukkan jari-jari: ");
                    float jariJari = scanner.nextFloat();
                    Lingkaran l = new Lingkaran(jariJari);
                    l.hitungLuas();
                    l.hitungKeliling ();
                    l.tampilkanHasil();
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}