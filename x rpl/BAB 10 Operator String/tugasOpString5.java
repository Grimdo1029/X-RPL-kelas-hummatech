import java.util.Scanner;  

public class tugasOpString5 {  
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

        System.out.println("\nHasil kalimat yang dirapikan:");  
        for (int i = 0; i < jumlahKalimat; i++) {  
            String kalimatRapikan = kalimatArray[i].trim();  

            if (kalimatRapikan.isEmpty()) {  
                System.out.println("-");  
            } else {  
                System.out.println(kalimatRapikan);  
            }  
        }  

        scanner.close();  
    }  
}