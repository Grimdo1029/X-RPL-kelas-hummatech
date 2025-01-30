import java.util.Scanner;
public class tugasPerulangan2 {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        int a;

        

        System.out.println("Ketikkan Angka 0 Untuk Stop");
        
        while (true) {
            a = angka.nextInt();

            if (a == 0) {
                break;
            }

            System.out.println("Anda Mengetik Angka: " + a);
        }
        System.out.println("Program Berhenti");
        angka.close();
    }
}
