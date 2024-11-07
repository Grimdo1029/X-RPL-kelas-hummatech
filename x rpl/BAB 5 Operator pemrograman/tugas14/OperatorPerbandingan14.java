import java.util.Scanner;
import java.util.HashSet;

public class OperatorPerbandingan14 {
    public static void main(String[] args) {
        // Membuat HashSet untuk menyimpan NIS siswa yang lulus
        HashSet<Integer> lulusNIS = new HashSet<>();
        lulusNIS.add(1001);
        lulusNIS.add(1002);
        lulusNIS.add(1003);
        lulusNIS.add(1004);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Pengecekan Kelulusan Siswa");
        System.out.print("Masukkan NIS siswa: ");

        int nis = scanner.nextInt();

        // Memeriksa apakah NIS ada dalam daftar siswa yang lulus
        boolean lulus = lulusNIS.contains(nis);

        System.out.println("Hasil pengecekan kelulusan: " + lulus);

        scanner.close();
    }
}