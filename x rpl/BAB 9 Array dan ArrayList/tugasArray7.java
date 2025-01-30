public class tugasArray7 {  
    public static void main(String[] args) {  
        String[][] handphone = {  
            {"Xiaomi", "Poco M3", "1850000"},  
            {"Oppo", "Reno 6", "4299000"},  
            {"Vivo", "Y2", "1635000"},  
            {"Oppo", "A15", "1618500"},  
            {"Samsung", "Galaxy A12", "1990000"}  
        };  

        System.out.println("No.\tMerk\t\tTipe\t\tHarga");  
        System.out.println("-----------------------------------------");  
        for (int i = 0; i < handphone.length; i++) {  
            System.out.print((i + 1) + "\t");  
            for (int j = 0; j < handphone[i].length; j++) {  
                System.out.print(handphone[i][j] + "\t\t");  
            }  
            System.out.println();  
        }  
    }  
}
