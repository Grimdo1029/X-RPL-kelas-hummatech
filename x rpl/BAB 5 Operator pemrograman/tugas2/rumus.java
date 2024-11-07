import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rumus {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;

        try {
            System.out.print("Masukkan Angka Untuk Variabel a:");
            a = Integer.parseInt(reader.readLine());

            System.out.print("Masukkan Angka Untuk Variabel b:");
            b = Integer.parseInt(reader.readLine());

            System.out.print("Masukkan Angka Untuk Variabel c:");
            c = Integer.parseInt(reader.readLine());

            int hasil = a + b * c;
            System.out.println("hasil: " + hasil);

        } catch (NumberFormatException | IOException e) {
            System.out.println("Input Salah Silahkan Masukkan Angka Untuk Variabel");
        }
    }
 } 
