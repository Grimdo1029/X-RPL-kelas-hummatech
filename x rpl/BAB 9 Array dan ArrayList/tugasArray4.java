public class tugasArray4 {  
    public static void main(String[] args) {  
        int[] angka = {10, 9, 30, 45, 78, 34, 11, 8, 5, 45, 90, 102, 56, 3};  

        System.out.println("Angka Ganjil dari Array:");  
        for (int i = 0; i < angka.length; i++) {  
            if (angka[i] % 2 != 0) { 
                System.out.println(angka[i]);  
            }  
        }  
    }  
}