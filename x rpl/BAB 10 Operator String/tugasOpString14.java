public class tugasOpString14 {  
    public static void main(String[] args) {  
        String teksAsli = "Aksara Jawa Hanacaraka Padajayanya";  

        String teksDiubah = teksAsli.replaceAll("(?i)a", "o"); // (?i) untuk case-insensitive  

        System.out.println("String asli: " + teksAsli);  
        System.out.println("String setelah penggantian: " + teksDiubah);  
    }  
}