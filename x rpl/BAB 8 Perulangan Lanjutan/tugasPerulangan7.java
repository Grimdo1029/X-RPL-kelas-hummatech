public class tugasPerulangan7 {  
    public static void main(String[] args) {  
        int jumlahBaris = 5; 
        
        for (int baris = 1; baris <= jumlahBaris; baris++) {  
            for (int kolom = 1; kolom <= jumlahBaris; kolom++) {  
                System.out.print(baris + " "); 
            }  
            System.out.println(); 
        }  
    }  
}