public class tugasPerulangan5 {
    public static void main(String[] args) {
        System.out.println("Deret Bilangan antara 1 s/d 20:");

        for (int i = 1; i <= 20; i++) {
            if (i > 5) {
                break; 
            }
            System.out.print(i + " ");
        }

        for (int i = 16; i <= 20; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); 
    }
}
