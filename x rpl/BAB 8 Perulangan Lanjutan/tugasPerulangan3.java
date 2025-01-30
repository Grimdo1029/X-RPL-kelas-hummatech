public class tugasPerulangan3 {
    public static void main(String[] args) {
        int a = 0, b = 1; 
        System.out.println("Deret Fibonacci di bawah 200:");

        while (true) {
            int angka = a + b; 

            if (angka >= 200) {
                break;
            }

            System.out.println(angka);

            a = b;
            b = angka;
        }
    }
}