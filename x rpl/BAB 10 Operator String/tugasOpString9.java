import java.util.Scanner;  

public class tugasOpString9 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Masukkan kalimat: ");  
        String kalimat = scanner.nextLine();  

        String[] kataArray = kalimat.split(" ");  

        System.out.println("\nHasil pemrosesan kata:");  
        for (String kata : kataArray) {  
            int panjangKata = kata.length();  
            String kataUpperCase = kata.toUpperCase();  
            System.out.println("Kata: " + kataUpperCase + ", Panjang: " + panjangKata);  
        }  

        scanner.close();  
    }  
}