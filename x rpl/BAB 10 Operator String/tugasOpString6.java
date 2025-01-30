import java.util.Scanner;  

public class tugasOpString6 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Masukkan jumlah kalimat: ");  
        int jumlahKalimat = scanner.nextInt();  
        scanner.nextLine(); 

        String[] kalimatArray = new String[jumlahKalimat];  

        for (int i = 0; i < jumlahKalimat; i++) {  
            System.out.print("Masukkan kalimat untuk elemen ke-" + (i + 1) + ": ");  
            kalimatArray[i] = scanner.nextLine();  
        }  

        System.out.println("\nHasil kalimat dengan angka urut:");  
        for (int i = 0; i < jumlahKalimat; i++) {  
            System.out.println((i + 1) + ". " + kalimatArray[i]);  
        }  

        scanner.close();  
    }  
}