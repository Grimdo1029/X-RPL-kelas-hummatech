public class tugasOpString10 {  
    public static void main(String[] args) {  
        String kalimat = "saya memancing ikan di sungai menggunakan pancingan yang panjang bersama teman saya yang berasal dari malang";  

        String[] kataDicocokkan = {"memancing", "sungai", "teman", "malang"};  
        String[] kataPengganti = {"menjaring", "laut", "saudara", "surabaya"};  

        String[] kataArray = kalimat.split(" ");  

        for (int i = 0; i < kataArray.length; i++) {  
            for (int j = 0; j < kataDicocokkan.length; j++) {  
                if (kataArray[i].equals(kataDicocokkan[j])) {  
                    kataArray[i] = kataPengganti[j]; 
                    break; 
                }  
            }  
        }  

        String kalimatBaru = String.join(" ", kataArray);  

        System.out.println("Kalimat setelah penggantian:");  
        System.out.println(kalimatBaru);  
    }  
}