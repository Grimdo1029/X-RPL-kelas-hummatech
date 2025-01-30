public class tugasOpString12 {  
    public static void main(String[] args) {  
        String kalimat = "saya belajar pemrograman java bersama hummasoft di kelas industri.";  

        String[] kataKata = kalimat.split("\\s+"); 
        int jumlahKata = kataKata.length;  

        int jumlahKarakter = kalimat.length(); 

        System.out.println("Kalimat: " + kalimat);  
        System.out.println("Jumlah kata: " + jumlahKata);  
        System.out.println("Jumlah karakter (termasuk spasi): " + jumlahKarakter);  
    }  
}