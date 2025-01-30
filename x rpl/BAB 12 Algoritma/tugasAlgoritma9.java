import java.util.Scanner;  

public class tugasAlgoritma9 {  

    public static void main(String[] args) {  
        int[] data = {5, 6, 9, 2, 8, 1, 7};  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Masukkan nilai yang dicari: ");  
        int key = scanner.nextInt();  

        int index = sequentialSearch(data, key);  
        
        if (index != -1) {  
            System.out.println("Nilai " + key + " ditemukan pada indeks: " + index);  
        } else {  
            System.out.println("Nilai " + key + " tidak ditemukan.");  
        }  

        scanner.close();  
    }  

    public static int sequentialSearch(int[] array, int key) {  
        for (int i = 0; i < array.length; i++) {  
            if (array[i] == key) {  
                return i;  
            }  
        }  
        return -1;  
    }  
}