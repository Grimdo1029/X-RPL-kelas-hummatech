import java.util.Scanner;  

public class tugasAlgoritma {  

    public static double hitungPangkat(double basis, int eksponen) {  
        // Kasus dasar  
        if (eksponen == 0) {  
            return 1; 
        } else if (eksponen < 0) {  
            return 1 / hitungPangkat(basis, -eksponen); 
        } else {  
            return basis * hitungPangkat(basis, eksponen - 1); 
        }  
    }  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Masukkan angka (basis): ");  
        double basis = scanner.nextDouble();  
        System.out.print("Masukkan pangkat (eksponen): ");  
        int eksponen = scanner.nextInt();  

        double hasil = hitungPangkat(basis, eksponen);  

        System.out.printf("%.2f pangkat %d adalah %.2f%n", basis, eksponen, hasil);  

        scanner.close();  
    }  
}