import java.util.ArrayList;  
import java.util.Scanner;  

public class tugasaArray18 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Masukkan jumlah angka yang ingin diinputkan: ");  
        int jumlah = scanner.nextInt();  
        
        ArrayList<Integer> angkaList = new ArrayList<>();  

        for (int i = 0; i < jumlah; i++) {  
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");  
            int angka = scanner.nextInt();  
            angkaList.add(angka);  
        }  

        int total = 0;  
        for (int angka : angkaList) {  
            total += angka;  
        }  
        
        double rataRata = (double) total / jumlah;  

        System.out.println("\nTotal angka: " + total);  
        System.out.println("Rata-rata angka: " + rataRata);  
        
        scanner.close();  
    }  
}