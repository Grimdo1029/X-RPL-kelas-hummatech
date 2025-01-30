import java.util.Scanner;  

public class tugasArray11 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Masukkan jumlah siswa: ");  
        int jumlahSiswa = scanner.nextInt();  
        scanner.nextLine(); 

        String[][] siswa = new String[jumlahSiswa][4]; 

        for (int i = 0; i < jumlahSiswa; i++) {  
            System.out.print("Masukkan nama siswa ke-" + (i + 1) + ": ");  
            siswa[i][0] = scanner.nextLine(); 

            System.out.print("Masukkan nilai 1: ");  
            siswa[i][1] = scanner.nextLine(); 

            System.out.print("Masukkan nilai 2: ");  
            siswa[i][2] = scanner.nextLine(); 

            System.out.print("Masukkan nilai 3: ");  
            siswa[i][3] = scanner.nextLine(); // 
        }  

        System.out.println("\nDaftar Rata-rata Nilai Siswa:");  
        System.out.println("--------------------------------");  

        for (int i = 0; i < siswa.length; i++) {  
            String nama = siswa[i][0]; 
            int mapel1 = Integer.parseInt(siswa[i][1]); 
            int mapel2 = Integer.parseInt(siswa[i][2]); 
            int mapel3 = Integer.parseInt(siswa[i][3]); 

            double rataRata = (mapel1 + mapel2 + mapel3) / 3.0;  

            char nilaiHuruf;  
            if (rataRata >= 81 && rataRata <= 100) {  
                nilaiHuruf = 'A';  
            } else if (rataRata >= 71 && rataRata <= 80) {  
                nilaiHuruf = 'B';  
            } else if (rataRata >= 51 && rataRata <= 70) {  
                nilaiHuruf = 'C';  
            } else if (rataRata >= 31 && rataRata <= 50) {  
                nilaiHuruf = 'D';  
            } else {  
                nilaiHuruf = 'E';  
            }  

            System.out.printf("%s: Rata-rata = %.2f, Nilai Huruf = %c%n", nama, rataRata, nilaiHuruf);  
        }  

        scanner.close(); 
    }  
}