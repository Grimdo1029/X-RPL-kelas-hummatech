import java.util.Scanner;  

public class tugasPerulangan12 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Masukkan jumlah sisi (ukuran persegi): ");  
        int ukuran = scanner.nextInt();  
        
        for (int baris = 1; baris <= ukuran; baris++) {  
            for (int kolom = 1; kolom <= ukuran; kolom++) {  
                if (baris == 1 || baris == ukuran || kolom == 1 || kolom == ukuran || baris == kolom || baris + kolom == ukuran + 1) {  
                    System.out.print("* ");   
                } else {  
                    System.out.print("  "); 
                }  
            }  
            System.out.println(); 
        }  
        

        scanner.close();  
    }  
}   

