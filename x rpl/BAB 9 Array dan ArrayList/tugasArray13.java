import java.util.Scanner;  

public class tugasArray13 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        int rows = 3;  
        int columns = 2;  

        int[][] matriksA = new int[rows][columns];  
        int[][] matriksB = new int[rows][columns];  
        int[][] hasilMatriks = new int[rows][columns];  

        System.out.println("Input nilai untuk Matriks A (3x2): ");  
        for (int i = 0; i < rows; i++) {  
            for (int j = 0; j < columns; j++) {  
                System.out.printf("Matriks A[%d][%d]: ", i, j);  
                matriksA[i][j] = scanner.nextInt();  
            }  
        }  

        System.out.println("Input nilai untuk Matriks B (3x2): ");  
        for (int i = 0; i < rows; i++) {  
            for (int j = 0; j < columns; j++) {  
                System.out.printf("Matriks B[%d][%d]: ", i, j);  
                matriksB[i][j] = scanner.nextInt();  
            }  
        }  

        for (int i = 0; i < rows; i++) {  
            for (int j = 0; j < columns; j++) {  
                hasilMatriks[i][j] = matriksA[i][j] + matriksB[i][j];  
            }  
        }  

        System.out.println("Hasil Penjumlahan Matriks A dan Matriks B: ");  
        for (int i = 0; i < rows; i++) {  
            for (int j = 0; j < columns; j++) {  
                System.out.print(hasilMatriks[i][j] + " ");  
            }  
            System.out.println();  
        }  

        scanner.close();  
    }  
}