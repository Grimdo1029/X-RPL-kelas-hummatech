import java.util.Scanner;

public class tugasOOP4 {
    
    // Atribut dengan modifier private
    private String username;
    private String password;

    // Setter untuk username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter untuk username
    public String getUsername() {
        return username;
    }

    // Setter untuk password
    public void setPassword(String password) {
        if ("kopijava".equals(password)) { // Memeriksa panjang password
            this.password = password;
        } else {
            System.out.println("Password Salah");
            this.password = null; // Atur password menjadi null jika tidak valid
        }
    }

    // Getter untuk password
    public String getPassword() {
        return password;
    }

    // Method untuk menampilkan informasi user
    public void tampilkanInfo() {
        System.out.println("Username: " + username);
        if (password != null) {
            System.out.println("Password: " + password);
            System.out.println("Keterangan: Username dan password sesuai.");
        } else {
            System.out.println("Keterangan: Password tidak sesuai.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        tugasOOP4 user = new tugasOOP4();
        
        // Mengambil input username
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        user.setUsername(inputUsername);
        
        // Mengambil input password
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();
        user.setPassword(inputPassword); // Mengatur password

        // Menampilkan informasi user
        user.tampilkanInfo();
        
        // Menutup scanner
        scanner.close();
    }
}