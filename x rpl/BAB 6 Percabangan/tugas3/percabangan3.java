import java.util.Scanner;

public class percabangan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai angka (0 - 100): ");
        int nilai = scanner.nextInt();

        char nilaiHuruf;

        if (nilai >= 81 && nilai <= 100) {
            nilaiHuruf = 'A';
        } else if (nilai >= 71 && nilai <= 80) {
            nilaiHuruf = 'B';
        } else if (nilai >= 51 && nilai <= 70) {
            nilaiHuruf = 'C';
        } else if (nilai >= 21 && nilai <= 50) {
            nilaiHuruf = 'D';
        } else if (nilai >= 0 && nilai <= 20) {
            nilaiHuruf = 'E';
        } else {
            System.out.println("Nilai yang dimasukkan tidak valid. Harap masukkan nilai antara 0 hingga 100.");
            return; 
        }
        
        System.out.println("Nilai huruf Anda adalah: " + nilaiHuruf);
    }
}
