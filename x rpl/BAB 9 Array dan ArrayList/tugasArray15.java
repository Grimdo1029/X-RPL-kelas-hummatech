import java.util.ArrayList;  

public class tugasArray15 {  
    public static void main(String[] args) {  
        ArrayList<Integer> angkaList = new ArrayList<Integer>();  
        angkaList.add(10);  
        angkaList.add(20);  
        angkaList.add(30);  
        angkaList.add(40);  
        angkaList.add(50);  
        System.out.println("Data dalam ArrayList:");  
        for (Integer angka : angkaList) {  
            System.out.println(angka);  
        }  
    }  
}