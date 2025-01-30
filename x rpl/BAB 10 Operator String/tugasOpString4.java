import java.util.Scanner;  

public class tugasOpString4 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        String nama = "";  
        String alamat = "";  
        String email = "";  

        while (nama.isEmpty()) {  
            System.out.print("Masukkan nama: ");  
            nama = scanner.nextLine();  
            if (nama.isEmpty()) {  
                System.out.println("Nama tidak boleh kosong. Silakan masukkan ulang.");  
            }  
        }  

        while (alamat.isEmpty()) {  
            System.out.print("Masukkan alamat: ");  
            alamat = scanner.nextLine();  
            if (alamat.isEmpty()) {  
                System.out.println("Alamat tidak boleh kosong. Silakan masukkan ulang.");  
            }  
        }  

        while (email.isEmpty()) {  
            System.out.print("Masukkan email: ");  
            email = scanner.nextLine();  
            if (email.isEmpty()) {  
                System.out.println("Email tidak boleh kosong. Silakan masukkan ulang.");  
            }  
        }  

        System.out.println("\nBiodata Anda:");  
        System.out.println("Nama: " + nama);  
        System.out.println("Alamat: " + alamat);  
        System.out.println("Email: " + email);  

        scanner.close();  
    }  
}