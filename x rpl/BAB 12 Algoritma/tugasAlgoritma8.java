import java.util.ArrayList;  
import java.util.Scanner;  

public class tugasAlgoritma8 {  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        ArrayList<Integer> data = new ArrayList<>();  

        System.out.print("Masukkan jumlah data: ");  
        int jumlah = scanner.nextInt();  
        
        System.out.println("Masukkan " + jumlah + " angka:");  
        for (int i = 0; i < jumlah; i++) {  
            data.add(scanner.nextInt());  
        }  

        selectionSortDescending(data);  

        System.out.println("Deret data setelah diurutkan (selection sort descending):");  
        for (int num : data) {  
            System.out.print(num + " ");  
        }  
        System.out.println();  

        scanner.close();  
    }  

    public static void selectionSortDescending(ArrayList<Integer> list) {  
        int n = list.size();  

        for (int i = 0; i < n - 1; i++) {  
            int maxIndex = i;  

            for (int j = i + 1; j < n; j++) {  
                if (list.get(j) > list.get(maxIndex)) {  
                    maxIndex = j;  
                }  
            }  

            if (maxIndex != i) {  
                int temp = list.get(maxIndex);  
                list.set(maxIndex, list.get(i));  
                list.set(i, temp);  
            }  
        }  
    }  
}