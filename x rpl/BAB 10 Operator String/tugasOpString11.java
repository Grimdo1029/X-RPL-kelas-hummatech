import java.util.Scanner;  

public class tugasOpString11 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Masukkan kalimat: ");  
        String inputKalimat = scanner.nextLine();  
        
        System.out.print("Masukkan nomor karakter yang ingin ditampilkan: ");  
        int nomorKarakter;  
        
        while (true) {  
            nomorKarakter = scanner.nextInt();  
            if (nomorKarakter > 0) {  
                nomorKarakter--; 
                break;  
            } else {  
                System.out.print("Nomor karakter harus lebih besar dari 0, coba lagi: ");  
            }  
        }  

        String[] kataKata = inputKalimat.split(" ");  
        StringBuilder hasil = new StringBuilder();  

        for (String kata : kataKata) {  
            if (nomorKarakter < kata.length()) {  
                hasil.append(kata.charAt(nomorKarakter));  
            }  
        }  

        System.out.println("Hasil: " + hasil.toString());  
        
        scanner.close();  
    }  
}