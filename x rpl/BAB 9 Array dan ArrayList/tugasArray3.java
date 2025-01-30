import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  

public class tugasArray3 {  
    public static void main(String[] args) {  
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  

        String[] merekLaptop = new String[3];  
        String[] merekHandphone = new String[3];  

        try {  
            System.out.println("Masukkan 3 merek laptop:");  
            for (int i = 0; i < 3; i++) {  
                System.out.print("Merek laptop ke-" + (i + 1) + ": ");  
                merekLaptop[i] = reader.readLine();  
            }  

            System.out.println("Masukkan 3 merek handphone:");  
            for (int i = 0; i < 3; i++) {  
                System.out.print("Merek handphone ke-" + (i + 1) + ": ");  
                merekHandphone[i] = reader.readLine();  
            }  

            System.out.println("\nDaftar Merek Laptop:");  
            for (String laptop : merekLaptop) {  
                System.out.println(laptop);  
            }  

            System.out.println("\nDaftar Merek Handphone:");  
            for (String handphone : merekHandphone) {  
                System.out.println(handphone);  
            }  

        } catch (IOException e) {  
            System.err.println("Terjadi kesalahan saat membaca input: " + e.getMessage());  
        }  
    }  
}
