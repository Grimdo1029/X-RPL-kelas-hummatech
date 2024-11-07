import java.util.Scanner;

public class OperatorPerbandingan13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Kuis Java!");
        System.out.println("Berikut ini manakah yang termasuk jenis operator di dalam pemrograman Java?");
        System.out.println("1. Operator Indosat");
        System.out.println("2. Operator Aritmatika");
        System.out.println("3. Operator Telkomsel");
        System.out.println("4. Operator Assignment");

        System.out.print("Masukkan nomor pilihan Anda (1-4): ");
        int jawaban = scanner.nextInt();

        if (jawaban == 2 || jawaban == 4) {
            System.out.println("Selamat! Jawaban Anda benar.");
        } else {
            System.out.println("Maaf, jawaban Anda salah.");
            System.out.println("Jawaban yang benar adalah Operator Aritmatika (2) atau Operator Assignment (4).");
        }

        scanner.close();
    }
}