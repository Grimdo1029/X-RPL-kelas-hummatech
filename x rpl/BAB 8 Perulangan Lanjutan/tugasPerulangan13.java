import java.util.Scanner;  

public class tugasPerulangan13 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Masukkan tinggi segitiga: ");  
        int tinggi = scanner.nextInt();  
        
        for (int baris = 1; baris <= tinggi; baris++) {  
            for (int kolom = 1; kolom <= baris; kolom++) {  
                System.out.print("* ");   
            }  
            System.out.println(); 
        }  
        
        
        scanner.close();  
    }  
}
    

