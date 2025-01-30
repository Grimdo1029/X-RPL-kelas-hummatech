import java.util.Scanner;

class Pasien {
    String nama;
    String penyakit;
    String noKamar;
    int ktp;
    String dokter; // Nama dokter yang bertanggung jawab
    String rumahSakit; // Nama rumah sakit

    Pasien(String nama, String penyakit, String noKamar, int ktp, String dokter, String rumahSakit) {
        this.nama = nama;
        this.penyakit = penyakit;
        this.noKamar = noKamar;
        this.ktp = ktp;
        this.dokter = dokter;
        this.rumahSakit = rumahSakit;
    }
}

public class tugasOOP8 {
    private static Pasien[] pasienArray = new Pasien[100];
    private static int pasienCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Input Data Pasien");
            System.out.println("2. Update Data Pasien");
            System.out.println("3. View Data Pasien");
            System.out.println("4. Exit");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            switch (pilihan) {
                case 1:
                    inputData(scanner);
                    break;
                case 2:
                    updateData(scanner);
                    break;
                case 3:
                    viewData();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);
    }

    private static void inputData(Scanner scanner) {
        System.out.print("Masukkan Nama Pasien: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Penyakit: ");
        String penyakit = scanner.nextLine();
        System.out.print("Masukkan No Kamar: ");
        String noKamar = scanner.nextLine();
        System.out.print("Masukkan KTP (angka): ");
        int ktp = scanner.nextInt();
        scanner.nextLine(); // membersihkan newline
        System.out.print("Masukkan Nama Dokter: ");
        String dokter = scanner.nextLine();
        System.out.print("Masukkan Nama Rumah Sakit: ");
        String rumahSakit = scanner.nextLine();

        pasienArray[pasienCount++] = new Pasien(nama, penyakit, noKamar, ktp, dokter, rumahSakit);
        System.out.println("Data pasien berhasil ditambahkan.");
    }

    private static void updateData(Scanner scanner) {
        System.out.print("Masukkan KTP Pasien yang ingin diupdate: ");
        int ktp = scanner.nextInt();
        scanner.nextLine(); // membersihkan newline

        for (int i = 0; i < pasienCount; i++) {
            if (pasienArray[i].ktp == ktp) {
                System.out.print("Masukkan Nama Pasien Baru: ");
                pasienArray[i].nama = scanner.nextLine();
                System.out.print("Masukkan Penyakit Baru: ");
                pasienArray[i].penyakit = scanner.nextLine();
                System.out.print("Masukkan No Kamar Baru: ");
                pasienArray[i].noKamar = scanner.nextLine();
                System.out.print("Masukkan Nama Dokter Baru: ");
                pasienArray[i].dokter = scanner.nextLine();
                System.out.print("Masukkan Nama Rumah Sakit Baru: ");
                pasienArray[i].rumahSakit = scanner.nextLine();
                System.out.println("Data pasien berhasil diupdate.");
                return;
            }
        }
        System.out.println("Pasien dengan KTP tersebut tidak ditemukan.");
    }

    private static void viewData() {
        System.out.println("=====================================");
        System.out.println("          RSUD GENTENG               ");
        System.out.println("=====================================");
        System.out.printf("%-20s %-15s %-10s %-10s %-20s %-20s%n", "Nama", "Penyakit", "No Kamar", "KTP", "Dokter", "Rumah Sakit");
        System.out.println("=====================================");
    
        for (int i = 0; i < pasienCount; i++) {
            System.out.printf("%-20s %-15s %-10s %-10d %-20s %-20s%n", 
                              pasienArray[i].nama, 
                              pasienArray[i].penyakit, 
                              pasienArray[i].noKamar, 
                              pasienArray[i].ktp, 
                              pasienArray[i].dokter, 
                              pasienArray[i].rumahSakit);
        }
        System.out.println("=====================================");
    }
}