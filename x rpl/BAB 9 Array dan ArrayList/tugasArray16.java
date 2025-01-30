import java.util.ArrayList;  

public class tugasArray16 {  
    public static void main(String[] args) {  
        ArrayList<Object> dataSiswa = new ArrayList<>();  

        dataSiswa.add("Heru Hermawan");  
        dataSiswa.add(17);  
        dataSiswa.add("Angga Ariyanto");  
        dataSiswa.add(16);  
        dataSiswa.add("Ratih Isabella");  
        dataSiswa.add(15);    

        System.out.println("Data Siswa di Kelas:");  
        for (int i = 0; i < dataSiswa.size(); i++) {  
            if (dataSiswa.get(i) instanceof String) {  
                String nama = (String) dataSiswa.get(i);  
                if (i + 1 < dataSiswa.size() && dataSiswa.get(i + 1) instanceof Integer) {  
                    int usia = (Integer) dataSiswa.get(i + 1);  
                    System.out.println("Nama: " + nama + ", | Usia: " + usia);  
                }  
            }  
        }  
    }  
}