public class tugasArray8 {  
    public static void main(String[] args) {  
        String[][] nama = {  
            {"Sugito", "Prayoga"},  
            {"Samirul", "Hilmi"},  
            {"Leo", "Hermawan"},  
            {"Triawan", "Angga"}  
        };  

        System.out.println("Nama Lengkap:");  
        System.out.println("-----------------------");  
        for (int i = 0; i < nama.length; i++) {  
            System.out.println(nama[i][0] + " " + nama[i][1]); 
        }  
    }  
}
