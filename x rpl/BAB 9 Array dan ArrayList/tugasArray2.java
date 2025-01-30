import javax.swing.JOptionPane;  

public class tugasArray2 {  
    public static void main(String[] args) {  
        String[] siswa = new String[5];  
        String[] teman = new String[5];  

        for (int i = 0; i < 5; i++) {  
            siswa[i] = JOptionPane.showInputDialog(null, "Masukkan nama siswa ke-" + (i + 1) + ":");  
        }  

        for (int i = 0; i < 5; i++) {  
            teman[i] = JOptionPane.showInputDialog(null, "Masukkan nama teman ke-" + (i + 1) + ":");  
        }  

        StringBuilder result = new StringBuilder("Daftar Nama Siswa:\n");  
        for (String nama : siswa) {  
            result.append(nama).append("\n");  
        }  

        result.append("\nDaftar Nama Teman:\n");  
        for (String nama : teman) {  
            result.append(nama).append("\n");  
        }  

        JOptionPane.showMessageDialog(null, result.toString(), "Hasil Input", JOptionPane.INFORMATION_MESSAGE);  
    }  
}
