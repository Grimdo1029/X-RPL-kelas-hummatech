import java.util.Scanner;

public class tugas11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input panjang deret dari pengguna
        System.out.print("Masukkan panjang deret: ");
        int panjangDeret = scanner.nextInt();
        
        int i = 1; // Inisialisasi untuk bilangan ganjil
        int j = 2; // Inisialisasi untuk bilangan genap
        
        System.out.print("Bilangan Ganjil: ");
        int countGanjil = 0; // untuk bilangan ganjil
        do {
            if (countGanjil < panjangDeret) {
                System.out.print(i + " ");
                i += 2; // Melompat ke bilangan ganjil berikutnya
                countGanjil++;
            }
        } while (countGanjil < panjangDeret);
        
        System.out.println(); // Pindah ke baris baru
        
        System.out.print("Bilangan Genap: ");
        int countGenap = 0; // untuk bilangan genap
        do {
            if (countGenap < panjangDeret) {
                System.out.print(j + " ");
                j += 2; // Melompat ke bilangan genap berikutnya
                countGenap++;
            }
        } while (countGenap < panjangDeret);
        
        scanner.close(); // Menutup scanner
    }
}