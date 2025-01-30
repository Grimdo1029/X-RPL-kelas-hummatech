import java.util.Scanner;  

public class tugasArray6 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Masukkan jumlah angka yang ingin diinput: ");  
        int n = scanner.nextInt();  

        int[] angka = new int[n];  

        for (int i = 0; i < n; i++) {  
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");  
            angka[i] = scanner.nextInt();  
        }  

        int max = angka[0];  
        for (int i = 1; i < n; i++) {  
            if (angka[i] > max) {  
                max = angka[i];   
            }  
        }  

        System.out.println("Angka terbesar dari yang diinputkan adalah: " + max);  

        scanner.close();  
    }  
}