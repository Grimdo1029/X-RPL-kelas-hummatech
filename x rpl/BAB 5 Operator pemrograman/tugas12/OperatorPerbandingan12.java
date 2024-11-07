import java.util.Scanner;

public class OperatorPerbandingan12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi (cm): ");
        double tinggi = scanner.nextInt();

        System.out.print("Masukkan nilai UN: ");
        double nilaiUN = scanner.nextInt();

        double minimalTinggi = 160;
        double minimalNilaiUN = 80;

        if (tinggi >= minimalTinggi && nilaiUN >= minimalNilaiUN) {
            System.out.println("True: Memenuhi syarat");
        } else {
            System.out.println("False: Tidak memenuhi syarat");
        }
    }
}