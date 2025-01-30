import java.util.ArrayList;  
import java.util.Scanner;  

public class tugasArray17 {  
    public static void main(String[] args) {  
        ArrayList<String> merkLaptop = new ArrayList<>();  
        Scanner scanner = new Scanner(System.in);  
        int pilihan;  

        do {  
            System.out.println("\n--- Menu ---");  
            System.out.println("1. Tambah merk laptop");  
            System.out.println("2. Lihat daftar merk laptop");  
            System.out.println("0. Keluar");  
            System.out.print("Pilih menu: ");  
            pilihan = scanner.nextInt();  
            scanner.nextLine(); 
            
            switch (pilihan) {  
                case 1:  
                    System.out.print("Masukkan merk laptop: ");  
                    String merk = scanner.nextLine();  
                    merkLaptop.add(merk);  
                    System.out.println(merk + " telah ditambahkan.");  
                    break;  
                    
                case 2:  
                    System.out.println("\nDaftar merk laptop:");  
                    if (merkLaptop.isEmpty()) {  
                        System.out.println("Tidak ada merk laptop yang tersimpan.");  
                    } else {  
                        for (String laptop : merkLaptop) {  
                            System.out.println("- " + laptop);  
                        }  
                    }  
                    break;  
                    
                case 0:  
                    System.out.println("Keluar dari program.");  
                    break;  
                    
                default:  
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");  
            }  
        } while (pilihan != 0);  
        
        scanner.close();  
    }  
}