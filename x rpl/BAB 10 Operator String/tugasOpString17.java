import java.util.Scanner;  

public class tugasOpString17 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Masukkan nama depan: ");  
        String namaDepan = scanner.nextLine();  

        System.out.print("Masukkan nama belakang: ");  
        String namaBelakang = scanner.nextLine();  

        String namaLengkap = namaDepan + " " + namaBelakang;  

        String alamat = "alamat (" + namaLengkap + ") di Genteng Banyuwangi";  

        String namaLengkapBergantian = ubahHurufBergantian(namaLengkap);  

        String alamatBergantian = ubahHurufBergantian(alamat);  

        System.out.println("Nama Lengkap: " + namaLengkap);  
        System.out.println("Alamat: " + alamat);  
        System.out.println("Nama Lengkap (bergantian): " + namaLengkapBergantian);  
        System.out.println("Alamat (bergantian): " + alamatBergantian);  

        scanner.close();  
    }  

    public static String ubahHurufBergantian(String input) {  
        StringBuilder hasil = new StringBuilder();  
        boolean gunakanHurufBesar = true;  

        for (char c : input.toCharArray()) {  
            if (Character.isLetter(c)) {  
                if (gunakanHurufBesar) {  
                    hasil.append(Character.toUpperCase(c));  
                } else {  
                    hasil.append(Character.toLowerCase(c));  
                }  
                gunakanHurufBesar = !gunakanHurufBesar; 
            } else {  
                hasil.append(c);   
            }  
        }  

        return hasil.toString();  
    }  
}