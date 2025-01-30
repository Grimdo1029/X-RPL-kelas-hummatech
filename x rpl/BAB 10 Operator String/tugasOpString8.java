import java.util.Scanner;  

public class tugasOpString8 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        String kalimat1 = "HUMMASOFT TECHNOLOGY MALANG";  
        String kalimat2 = "kelas industri bergengsi di indonesia";  
        String kalimat3 = "hummasoft mempunyai produk sistem sekolah";  

        String kalimatDiubah1 = kalimat1.toLowerCase(); 
        String kalimatDiubah2 = kalimat2.toUpperCase(); 
        String kalimatDiubah3 = kalimat3.replace("hummasoft", "HUMMASOFT") 
                                            .replace("sistem sekolah", "SISTEM SEKOLAH"); 

        System.out.println("Kalimat 1 (lowercase): " + kalimatDiubah1);  
        System.out.println("Kalimat 2 (uppercase): " + kalimatDiubah2);  
        System.out.println("Kalimat 3: " + kalimatDiubah3);  

        scanner.close();  
    }  
}