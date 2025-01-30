import java.util.Scanner;

public class tugasOOP9 {

    public abstract static class Binatang {
        public abstract void makan();
        public abstract void berkembangbiak();
        public abstract void hidupDi();
        public abstract String jenisHewan();
    }

    public static class Gajah extends Binatang {
        @Override
        public void makan() {
            System.out.println("Gajah makan rumput dan daun.");
        }

        @Override
        public void berkembangbiak() {
            System.out.println("Gajah berkembang biak dengan melahirkan.");
        }

        @Override
        public void hidupDi() {
            System.out.println("Gajah hidup di hutan dan savana.");
        }

        @Override
        public String jenisHewan() {
            return "Gajah";
        }
    }

    public static class Kelinci extends Binatang {
        @Override
        public void makan() {
            System.out.println("Kelinci makan sayuran dan rumput.");
        }

        @Override
        public void berkembangbiak() {
            System.out.println("Kelinci berkembang biak dengan melahirkan.");
        }

        @Override
        public void hidupDi() {
            System.out.println("Kelinci hidup di padang dan hutan.");
        }

        @Override
        public String jenisHewan() {
            return "Kelinci";
        }
    }

    public static class Burung extends Binatang {
        @Override
        public void makan() {
            System.out.println("Burung makan biji-bijian dan serangga.");
        }

        @Override
        public void berkembangbiak() {
            System.out.println("Burung berkembang biak dengan bertelur.");
        }

        @Override
        public void hidupDi() {
            System.out.println("Burung hidup di pohon dan udara.");
        }

        @Override
        public String jenisHewan() {
            return "Burung";
        }
    }

    public static class Kucing extends Binatang {
        @Override
        public void makan() {
            System.out.println("Kucing makan daging dan ikan.");
        }

        @Override
        public void berkembangbiak() {
            System.out.println("Kucing berkembang biak dengan melahirkan.");
        }

        @Override
        public void hidupDi() {
            System.out.println("Kucing hidup di rumah dan lingkungan manusia.");
        }

        @Override
        public String jenisHewan() {
            return "Kucing";
        }
    }

 
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Binatang[] binatang = new Binatang[4];
    binatang[0] = new Gajah();
    binatang[1] = new Kelinci();
    binatang[2] = new Burung();
    binatang[3] = new Kucing();

    while (true) {
        System.out.println("Pilih jenis hewan:");
        System.out.println("1. Gajah");
        System.out.println("2. Kelinci");
        System.out.println("3. Burung");
        System.out.println("4. Kucing");
        System.out.println("5. Keluar");
        System.out.print("Masukkan pilihan (1-5): ");
        
        int pilihan = scanner.nextInt();

        if (pilihan >= 1 && pilihan <= 4) {
            Binatang hewanDipilih = binatang[pilihan - 1];
            System.out.println("Jenis Hewan: " + hewanDipilih.jenisHewan());
            hewanDipilih.makan();
            hewanDipilih.berkembangbiak();
            hewanDipilih.hidupDi();
            System.out.println();
        } else if (pilihan == 5) {
            System.out.println("Terima kasih! Program selesai.");
            break; 
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }

        scanner.close();
    }
}
