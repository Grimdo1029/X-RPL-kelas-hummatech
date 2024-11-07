import java.util.Scanner; 

public class tugas3inputout {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("jenis kelamin: ");
        String jenisKelamin = input.nextLine();

        System.out.print("nomor sepatu: ");
        int nomorSepatu = input.nextInt();

        System.out.print("sudah menikah: ");
        boolean Sudahmenikah = input.nextBoolean();

        System.out.println("jenis kelamin: " + jenisKelamin);
        System.out.println("nomor sepatu: " + nomorSepatu);
        System.out.println("sudah menikah: " + Sudahmenikah);
        input.close();

        

    
}
}