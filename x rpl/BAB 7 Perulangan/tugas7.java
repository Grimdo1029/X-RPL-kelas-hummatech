import java.util.Scanner;

public class tugas7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Angka Pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan Angka Kedua: ");
        int angka2 = scanner.nextInt();

        int angkaMax = Math.max(angka1, angka2);

        System.out.print("Angka Terbesar Dari Dua Angka Yang Anda Input Adalah: " + angkaMax);
        }
}
