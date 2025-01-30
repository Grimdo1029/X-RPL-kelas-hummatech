import java.util.Scanner;  

public class tugasOpString3 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Masukkan jumlah elemen array: ");  
        int jumlahElemen = scanner.nextInt();  
        scanner.nextLine(); 

        String[] kalimatArray = new String[jumlahElemen];  

        for (int i = 0; i < jumlahElemen; i++) {  
            System.out.print("Masukkan kalimat untuk elemen ke-" + (i + 1) + ": ");  
            kalimatArray[i] = scanner.nextLine();  
        }  

        System.out.println("\nHasil pengecekan isi array:");  
        for (int i = 0; i < jumlahElemen; i++) {  
            if (kalimatArray[i].isEmpty()) {  
                System.out.println("Elemen ke-" + (i + 1) + " tidak terisi.");  
            } else {  
                System.out.println("Elemen ke-" + (i + 1) + " terisi: " + kalimatArray[i]);  
            }  
        }  

        scanner.close();  
    }  
}