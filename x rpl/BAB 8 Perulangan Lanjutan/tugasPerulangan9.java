import java.util.Scanner;  

public class tugasPerulangan9 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Masukkan jumlah sisi (ukuran persegi): ");  
        int ukuran = scanner.nextInt();  
        
        for (int baris = 1; baris <= ukuran; baris++) {  
            for (int kolom = 1; kolom <= ukuran; kolom++) {  
                System.out.print("* ");  
            }  
            System.out.println(); 
        }  
        
        scanner.close();  
    }  
}
