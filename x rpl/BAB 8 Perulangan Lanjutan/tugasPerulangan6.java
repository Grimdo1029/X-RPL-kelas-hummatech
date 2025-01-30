import java.util.Scanner;

public class tugasPerulangan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlah = 0; 

        System.out.println("Masukkan 5 angka:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Angka " + i + ": ");
            int angka = scanner.nextInt(); 

            if (angka % 5 != 0) {
                continue;
            }

            jumlah += angka;
        }

        System.out.println("Jumlah kelipatan 5 yang dihitung adalah: " + jumlah);
        
        scanner.close(); 
    }
}