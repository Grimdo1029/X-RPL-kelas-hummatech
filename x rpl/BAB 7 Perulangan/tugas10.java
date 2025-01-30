import java.util.Scanner;

public class tugas10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        // Memulai perulangan
        while (true) {
            // Menampilkan pesan kepada pengguna
            System.out.println("Program sedang berjalan. Tekan 'ya' untuk menghentikan program.");

            // Mengambil input dari pengguna
            userInput = scanner.nextLine();

            // Memeriksa apakah input adalah "ya"
            if (userInput.equalsIgnoreCase("ya")) {
                System.out.println("Program dihentikan.");
                break; // Menghentikan perulangan jika input adalah "ya"
            } else {
                System.out.println("Anda menekan: " + userInput + ". Program akan terus berjalan.");
            }
        }

        scanner.close();
    }
}