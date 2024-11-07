import java.util.Scanner;

public class tugas2input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Sekolah : ");
        String namaSekolah = input.nextLine();

        System.out.print("Jarak Rumah ke Sekolah : ");
        double jarakRumahkeSekolah = input.nextDouble();

        System.out.print("Kode Plat Nomor Kendaraan : ");
        char kodePlatNomorKendaraan = input.nextLine().charAt(0);

        System.out.print("Anak Ke Berapa");
        int anakKeBerapa = input.nextInt();

        System.out.println("namaSekolah" + namaSekolah);
        System.out.println("Jarak Rumah ke Sekolah" + jarakRumahkeSekolah + "km");
        System.out.println("Kode Plat Nomor Kendaraan" + kodePlatNomorKendaraan);
        System.out.println("Anak ke" + anakKeBerapa);
    }

}
