import java.util.Scanner;  

public class tugasOpString1 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Masukkan kalimat: ");  
        String kalimat = scanner.nextLine();  

        int panjangKalimat = kalimat.length();  

        if (panjangKalimat < 10) {  
            System.out.println("Panjang string: " + panjangKalimat);  
            System.out.println("Kondisi: LOW");  
        } else if (panjangKalimat >= 10 && panjangKalimat < 50) {  
            System.out.println("Panjang string: " + panjangKalimat);  
            System.out.println("Kondisi: MEDIUM");  
        } else {  
            System.out.println("Panjang string: " + panjangKalimat);  
            System.out.println("Kondisi: HIGH");  
        }  

        scanner.close();  
    }  
}