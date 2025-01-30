import java.util.Scanner;  

public class tugasAlgoritma7 {  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Masukkan jumlah data: ");  
        int jumlah = scanner.nextInt();  
        
        int[] data = new int[jumlah];  

        System.out.println("Masukkan " + jumlah + " angka:");  
        for (int i = 0; i < jumlah; i++) {  
            data[i] = scanner.nextInt();  
        }  

        selectionSort(data);  

        System.out.println("Deret data setelah diurutkan (selection sort dari kiri ke kanan):");  
        for (int num : data) {  
            System.out.print(num + " ");  
        }  
        System.out.println();  

        scanner.close();  
    }  

    public static void selectionSort(int[] array) {  
        int n = array.length;  

        for (int i = 0; i < n - 1; i++) {  
            int minIndex = i;  

            for (int j = i + 1; j < n; j++) {  
                if (array[j] < array[minIndex]) {  
                    minIndex = j;  
                }  
            }  

            if (minIndex != i) {  
                int temp = array[minIndex];  
                array[minIndex] = array[i];  
                array[i] = temp;  
            }  
        }  
    }  
}