import java.util.Scanner;  

public class tugasPeluangan7lanjutan {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Masukkan jumlah baris: ");  
        int jumlahBaris = scanner.nextInt();  
        
        System.out.print("Masukkan jumlah kolom: ");  
        int jumlahKolom = scanner.nextInt();  
        
        for (int baris = 1; baris <= jumlahBaris; baris++) {  
            for (int kolom = 1; kolom <= jumlahKolom; kolom++) {  
                System.out.print(baris + " ");  
            }  
            System.out.println(); 
        }  
        
        
        scanner.close();  
    }  
}