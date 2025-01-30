public class tugasArray1 {  
    public static void main(String[] args) {  
        String[] bagianNama = {"Mudafiq", "Riyan", "Pratama"};  
        
        String namaLengkap = gabungkanNama(bagianNama);  
        
        System.out.println("Nama Lengkap: " + namaLengkap);  
    }  

    public static String gabungkanNama(String[] bagianNama) {  
        StringBuilder sb = new StringBuilder();  
        for (String nama : bagianNama) {  
            sb.append(nama).append(" "); 
        }  
        return sb.toString().trim();   
    }  
}
