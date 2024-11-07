import java.util.Scanner;
public class percabangan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int belanja;

        System.out.print("Inputkan total belanja anda: ");
        belanja = input.nextInt();

        if (belanja <= 500000); {
            int selisih =  500000 - belanja;

            System.out.println("Belanja anda kurang dari Rp. 500.000. Silahkan tambah lagi belanjanya senilai Rp.xxx.Agar mendapatkan bonus gantungan kunci.");
        }
    }
}
