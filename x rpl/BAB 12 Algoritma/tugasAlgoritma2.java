import java.util.Scanner;  

public class tugasAlgoritma2 {  

    public static long hitungFaktorial(int n) {  
        // Kasus dasar  
        if (n == 0 || n == 1) {  
            return 1; 
        } else {  
            return n * hitungFaktorial(n - 1);  
        }  
    }  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Masukkan angka untuk dihitung faktorialnya: ");  
        int angka = scanner.nextInt();  

        long hasil = hitungFaktorial(angka);  

        System.out.printf("Faktorial dari %d adalah %d%n", angka, hasil);  

        scanner.close();  
    }  
}