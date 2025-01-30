import java.util.Scanner;  

public class tugasOpString2 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Masukkan kalimat yang ditulis: ");  
        String kalimat = scanner.nextLine();  

        int panjangKalimat = kalimat.length();  
        int gaji = 0;  

        if (panjangKalimat >= 100) {  
            gaji = (panjangKalimat / 100) * 10000;  
        } else if (panjangKalimat >= 50) {  
            gaji = 5000;  
        } else {  
            gaji = 2000;  
        }  

        if (panjangKalimat > 1000) {  
            double bonus = gaji * 0.10; 
            gaji += (int) bonus; 
        }  

        System.out.println("\nPanjang kalimat: " + panjangKalimat + " karakter");  
        System.out.println("Gaji penulis: Rp. " + gaji);  

        scanner.close();  
    }  
}