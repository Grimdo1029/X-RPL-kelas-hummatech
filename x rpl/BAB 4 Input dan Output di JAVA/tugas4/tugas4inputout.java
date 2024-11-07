import java.util.Scanner; 

public class tugas4inputout {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Lengkap: ");
        String namaLengkap = input.nextLine();

        System.out.print("NIS: ");
        int nis = input.nextInt();

        System.out.print("Umur: ");
        int umur = input.nextInt();

        System.out.println("Nama lengkap: " + namaLengkap);
        System.out.println("NIS: " + nis);
        System.out.println("umur: " + umur + " tahun");
        input.close();

        

    
}
}