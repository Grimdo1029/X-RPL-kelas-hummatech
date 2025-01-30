import java.util.Arrays;  

public class tugasAlgoritma5 {  

    public static void main(String[] args) {   
        int[] data = {27, 80, 8, 46, 16, 12, 50};  


        Arrays.sort(data);  

  
        System.out.println("Deret data setelah diurutkan:");  
        for (int num : data) {  
            System.out.print(num + " ");  
        }  
        System.out.println(); 
    }  
}