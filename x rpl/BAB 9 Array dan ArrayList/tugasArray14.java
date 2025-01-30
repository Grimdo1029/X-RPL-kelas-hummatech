import java.util.ArrayList;  

public class tugasArray14 {  
    public static void main(String[] args) {  
        ArrayList<String> namaTokoh = new ArrayList<>();  

        namaTokoh.add("Steve Jobs");  
        namaTokoh.add("Bill Gates");  
        namaTokoh.add("Mark Zuckerberg");  
        namaTokoh.add("Elon Musk");  

        System.out.println("Daftar Nama Tokoh Teknologi:");  
        for (String nama : namaTokoh) {  
            System.out.println(nama);  
        }  

        namaTokoh.remove("Bill Gates");  

        System.out.println("\nSetelah penghapusan 'Bill Gates':");  
        for (String nama : namaTokoh) {  
            System.out.println(nama);  
        }  
    }  
}