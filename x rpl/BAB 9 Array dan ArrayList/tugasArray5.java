import java.util.Scanner;  

public class tugasArray5 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Masukkan jumlah angka yang ingin diinput: ");  
        int n = scanner.nextInt();  

        int[] angka = new int[n];  

        for (int i = 0; i < n; i++) {  
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");  
            angka[i] = scanner.nextInt();  
        }  

        int total = 0;  
        for (int i = 0; i < n; i++) {  
            total += angka[i];  
        }  

        System.out.println("Total dari angka yang diinputkan adalah: " + total);  

        scanner.close();  
    }  
}
