import java.util.Scanner;

public class tugasinput1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nama lengkap anda: ");
        String namaLengkap = input.nextLine();

        System.out.print("masukkan usia anda: ");
        int usia = input.nextInt();

        input.nextLine();

        System.out.print("masukkan asal kota anda: ");
        String kotaAsal = input.nextLine();

        System.out.print("masukkan tinggi badan anda: ");
        double tinggiBadan = input.nextDouble();

        System.out.println("Biodata anda: ");
        System.out.println("Nama Lengkap: " + namaLengkap);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Kota Asal: " + kotaAsal);
        System.out.println("Tinggi Badan: " + tinggiBadan + "cm");
        input.close();
    }
}