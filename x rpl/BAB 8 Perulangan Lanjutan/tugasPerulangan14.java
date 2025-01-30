import java.util.Scanner;  

public class tugasPerulangan14 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Masukkan tinggi piramida: ");  
        int tinggi = scanner.nextInt();  
        
        for (int baris = 1; baris <= tinggi; baris++) {  
            for (int spasi = tinggi - baris; spasi > 0; spasi--) {  
                System.out.print(" "); 
            }  
            for (int bintang = 1; bintang <= (2 * baris - 1); bintang++) {  
                System.out.print("*");  
            }  
            System.out.println(); 
        }  
        
        scanner.close();  
    }  
}
