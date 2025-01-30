import java.util.Scanner;  

public class tugasAlgoritma11 {  

    public static void main(String[] args) {  
        String[] names = {"Misbahul", "Andre", "Ivan", "Andika", "Riyan", "Afrizal"};  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Masukkan nama yang dicari: ");  
        String key = scanner.nextLine();  

        int index = sequentialSearch(names, key);  

        if (index != -1) {  
            System.out.println("Nama " + key + " ditemukan pada indeks: " + index);  
        } else {  
            System.out.println("Nama " + key + " tidak ditemukan.");  
        }  

        scanner.close();  
    }  

    public static int sequentialSearch(String[] array, String key) {  
        for (int i = 0; i < array.length; i++) {  
            if (array[i].equals(key)) {  
                return i;  
            }  
        }  
        return -1;  
    }  
}