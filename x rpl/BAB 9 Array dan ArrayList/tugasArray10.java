public class tugasArray10 {  
    public static void main(String[] args) {  
        String[][] siswa = {  
            {"Kenzo Ismail", "81", "90", "62"},  
            {"Desmon Daffa", "60", "82", "87"},  
            {"Kayla Isabela", "89", "59", "65"},  
            {"Khansa Zakira", "77", "75", "60"}  
        };  

        System.out.println("Daftar Rata-rata Nilai Siswa:");  
        System.out.println("--------------------------------");  

        for (int i = 0; i < siswa.length; i++) {  
            String nama = siswa[i][0];  
            int nilai1 = Integer.parseInt(siswa[i][1]);   
            int nilai2 = Integer.parseInt(siswa[i][2]);  
            int nilai3 = Integer.parseInt(siswa[i][3]);  

            double rataRata = (nilai1 + nilai2 + nilai3) / 3.0;  

            System.out.printf("%s: Rata-rata = %.2f%n", nama, rataRata);  
        }  
    }  
}