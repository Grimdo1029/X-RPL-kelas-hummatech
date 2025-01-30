public class tugasOpString15 {  
    public static void main(String[] args) {  
        String teksAsli = "HUMMASOFT TECHNOLOGY";  

        String teksDiubah = formatNama(teksAsli);  

        System.out.println("String asli: " + teksAsli);  
        System.out.println("String setelah pengubahan: " + teksDiubah);  
    }  

    public static String formatNama(String input) {  
        String[] kataKata = input.split(" ");  
        StringBuilder hasil = new StringBuilder();  

        for (String kata : kataKata) {  
            if (kata.length() > 0) {  
                String formattedKata = kata.substring(0, 1).toUpperCase() + kata.substring(1).toLowerCase();  
                hasil.append(formattedKata).append(" ");  
            }  
        }  

        return hasil.toString().trim();  
    }  
}