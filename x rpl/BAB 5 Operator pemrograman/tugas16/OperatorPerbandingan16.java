import java.util.Scanner;

public class OperatorPerbandingan16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Penentuan Kenaikan Kelas");

        // Input nilai rata-rata
        System.out.print("Masukkan nilai rata-rata siswa: ");
        double nilaiRataRata = scanner.nextDouble();

        // Input jumlah ketidakhadiran
        System.out.print("Masukkan jumlah ketidakhadiran siswa: ");
        int jumlahKetidakhadiran = scanner.nextInt();

        // Menggunakan operator ternary untuk menentukan kenaikan kelas
        String hasil = (nilaiRataRata >= 75 && jumlahKetidakhadiran <= 3) ? "Naik Kelas" : "Tidak Naik Kelas";

        // Menampilkan hasil
        System.out.println("\nHasil Penentuan Kenaikan Kelas:");
        System.out.println("Nilai Rata-rata: " + nilaiRataRata);
        System.out.println("Jumlah Ketidakhadiran: " + jumlahKetidakhadiran);
        System.out.println("Status: " + hasil);

        scanner.close();
    }
}