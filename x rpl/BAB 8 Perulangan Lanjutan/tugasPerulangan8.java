import java.util.Scanner;  

public class tugasPerulangan8 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Masukkan jumlah baris: ");  
        int jumlahBaris = scanner.nextInt();  

        System.out.print("Masukkan jumlah kolom: ");  
        int jumlahKolom = scanner.nextInt();  

        for (int baris = 1; baris <= jumlahBaris; baris++) {  
            for (int kolom = 1; kolom <= jumlahKolom; kolom++) {  
                int hasil = baris * kolom;   
                System.out.print(hasil + "\t"); 
            }  
            System.out.println(); 
        }  


        scanner.close();  
    }  
}
