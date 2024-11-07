import java.util.Scanner;

public class operatorPerbandingan15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Demonstrasi Operator Bitwise");

        // Input nilai a
        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();

        // Input nilai b
        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();

        // Operasi bitwise
        int and = a & b;
        int or = a | b;
        int xor = a ^ b;
        int notA = ~a;
        int notB = ~b;
        int leftShift = a << 2;
        int rightShift = b >> 2;

        // Menampilkan hasil
        System.out.println("\nHasil operasi bitwise:");
        System.out.println("a & b = " + and);
        System.out.println("a | b = " + or);
        System.out.println("a ^ b = " + xor);
        System.out.println("~a = " + notA);
        System.out.println("~b = " + notB);
        System.out.println("a << 2 = " + leftShift);
        System.out.println("b >> 2 = " + rightShift);

        scanner.close();
    }
}