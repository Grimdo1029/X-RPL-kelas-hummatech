public class tugasOpString16 {  
    public static void main(String[] args) {  
        String kalimat = "Siswa kelas industri sangat antusias untuk belajar di hari sabtu";  

        int jumlahHurufS = hitungHurufS(kalimat);  

        System.out.println("Kalimat: " + kalimat);  
        System.out.println("Jumlah huruf 's' dan 'S': " + jumlahHurufS);  
    }  

    public static int hitungHurufS(String input) {  
        int count = 0;  
        
        char[] karakterArray = input.toCharArray();  
        
        for (char c : karakterArray) {  
            if (c == 's' || c == 'S') {  
                count++; 
            }  
        }  
        
        return count;  
    }  
}