import java.util.Scanner;

class tugasOOP7 {
    protected double volume;

    public tugasOOP7() {}

    public double getVolume() {
        return volume;
    }

    public void hitungVolume() {}
}

class Balok extends tugasOOP7 {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public void hitungVolume() {
        volume = panjang * lebar * tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getTinggi() {
        return tinggi;
    }
}

class Kubus extends tugasOOP7 {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungVolume() {
        volume = sisi * sisi * sisi;
    }

    public double getSisi() {
        return sisi;
    }
}

class Tabung extends tugasOOP7 {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public void hitungVolume() {
        volume = Math.PI * jariJari * jariJari * tinggi;
    }

    public double getJariJari() {
        return jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }
}

class Kerucut extends tugasOOP7 {
    private double jariJari;
    private double tinggi;

    public Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public void hitungVolume() {
        volume = (1.0 / 3) * Math.PI * jariJari * jariJari * tinggi;
    }

    public double getJariJari() {
        return jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Balok");
            System.out.println("2. Kubus");
            System.out.println("3. Tabung");
            System.out.println("4. Kerucut");
            System.out.println("5. Selesai");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang: ");
                    double panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double lebar = scanner.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = scanner.nextDouble();
                    Balok balok = new Balok(panjang, lebar, tinggi);
                    balok.hitungVolume();
                    System.out.println("Volume Balok: " + balok.getVolume());
                    break;

                case 2:
                    System.out.print("Masukkan sisi: ");
                    double sisi = scanner.nextDouble();
                    Kubus kubus = new Kubus(sisi);
                    kubus.hitungVolume();
                    System.out.println("Volume Kubus: " + kubus.getVolume());
                    break;

                case 3:
                    System.out.print("Masukkan jari-jari: ");
                    double jariJariTabung = scanner.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggiTabung = scanner.nextDouble();
                    Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                    tabung.hitungVolume();
                    System.out.println("Volume Tabung: " + tabung.getVolume());
                    break;

                case 4:
                    System.out.print("Masukkan jari-jari: ");
                    double jariJariKerucut = scanner.nextDouble();
 System.out.print("Masukkan tinggi: ");
                    double tinggiKerucut = scanner.nextDouble();
                    Kerucut kerucut = new Kerucut(jariJariKerucut, tinggiKerucut);
                    kerucut.hitungVolume();
                    System.out.println("Volume Kerucut: " + kerucut.getVolume());
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