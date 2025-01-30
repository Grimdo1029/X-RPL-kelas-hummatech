import java.util.Scanner;  

public class tugasOpString7 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Masukkan kalimat: ");  
        String kalimat = scanner.nextLine();  

        String kalimatDiubah = kalimat  
                .replace("hewan", "binatang")  
                .replace("tangkai", "pohon")  
                .replace("tanaman", "tumbuhan");  

        System.out.println("\nKalimat setelah penggantian:");  
        System.out.println(kalimatDiubah);  

        scanner.close();  
    }  
}