import java.util.Scanner;

public class tugas13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahDeret;

        // Meminta input jumlah deret dari pengguna
        System.out.print("Masukkan jumlah deret Fibonacci: ");
        jumlahDeret = scanner.nextInt();

        // Inisialisasi variabel untuk deret Fibonacci
        int a = 0, b = 1, c = 0;
        int count = 0;

        System.out.print("Deret Fibonacci: ");
        
        do {
            // Menghasilkan bilangan Fibonacci
            if (count == 0) {
                System.out.print(b + " "); // Menampilkan 1 pada posisi pertama
            } else if (count == 1) {
                System.out.print(b + " "); // Menampilkan 1 pada posisi kedua
            } else {
                c = a + b; // Menghitung bilangan Fibonacci berikutnya
                System.out.print(c + " "); // Menampilkan bilangan Fibonacci
                a = b; // Menggeser nilai a
                b = c; // Menggeser nilai b
            }
            count++; // Menambah count
        } while (count < jumlahDeret); // Mengulangi hingga jumlah deret tercapai

        System.out.println(); // Pindah ke baris baru
        scanner.close(); // Menutup scanner
    }
}
