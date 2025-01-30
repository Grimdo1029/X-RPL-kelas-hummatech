public class tugasOpString13 {  
    public static void main(String[] args) {  
        String kataAsli = "hummasoft";  
        
        char[] karakterArray = kataAsli.toCharArray();  
        
        char[] kebalikanArray = new char[karakterArray.length];  
        
        for (int i = 0; i < karakterArray.length; i++) {  
            kebalikanArray[i] = karakterArray[karakterArray.length - 1 - i];  
        }  
        
        String kataTerbalik = new String(kebalikanArray);  
        
        System.out.println("Kata Asli: " + kataAsli);  
        System.out.println("Kata Terbalik: " + kataTerbalik);  
    }  
}