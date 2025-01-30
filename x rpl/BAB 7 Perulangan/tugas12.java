import java.util.Scanner;

public class tugas12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            // Menampilkan menu
            System.out.println("=== Menu ===");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            
            // Mengambil input dari pengguna
            pilihan = scanner.nextInt();

            // Memproses pilihan pengguna
            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih menu PENJUMLAHAN.");
                    break;
                case 2:
                    System.out.println("Anda memilih menu PENGURANGAN.");
                    break;
                case 3:
                    System.out.println("Program berhenti!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }
        } while (pilihan != 3); // Mengulangi hingga pengguna memilih untuk keluar

        scanner.close(); // Menutup scanner
    }
}