import javax.swing.JOptionPane;  

class Sekolah {  
    protected String nama;  

    Sekolah() {  
        this.nama = "SMKS MUHAMMADIYAH 1 GENTENG";  
    }  

    public void info() {  
        JOptionPane.showMessageDialog(null, "Nama Sekolah: " + nama);  
    }  
}  

class Guru extends Sekolah {  
    private int nip;  
    private String mapel;  

    public Guru(int nip, String nama, String mapel) {  
        this.nip = nip;  
        this.nama = nama;  
        this.mapel = mapel;  
    }  

    public int getNip() {  
        return nip;  
    }  

    public String getNama() {  
        return nama;  
    }  

    public String getMapel() {  
        return mapel;  
    }  

    public void info() {  
        JOptionPane.showMessageDialog(null, "NIP: " + nip + "\nNama Guru: " + getNama() + "\nMata Pelajaran: " + mapel);  
    }  
}  

class Siswa extends Sekolah {  
    private int nis;  
    private int uts;  
    private int uas;  
    private double nilaiAkhir;  

    public Siswa() {  
        this.nama = "SMKS MUHAMMADIYAH 1 GENTENG"; 
    }  

    public void inputDataSiswa() {  
        this.nis = Integer.parseInt(JOptionPane.showInputDialog("Masukkan NIS:"));  
        this.uts = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai UTS:"));  
        this.uas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai UAS:"));  
        this.nilaiAkhir = (uts + uas) / 2.0; 
    }  

    public int getNis() {  
        return nis;  
    }  

    public int getUts() {  
        return uts;  
    }  

    public int getUas() {  
        return uas;  
    }  

    public double getNilaiAkhir() {  
        return nilaiAkhir;  
    }  

    public String getNilaiHuruf() {  
        if (nilaiAkhir >= 85) {  
            return "A";  
        } else if (nilaiAkhir >= 70) {  
            return "B";  
        } else if (nilaiAkhir >= 60) {  
            return "C";  
        } else if (nilaiAkhir >= 50) {  
            return "D";  
        } else {  
            return "E";  
        }  
    }  

    public void info() {  
        String info = "NIS: " + nis + "\nNilai UTS: " + uts + "\nNilai UAS: " + uas + "\nNilai Akhir: " + nilaiAkhir + "\nNilai Huruf: " + getNilaiHuruf();  
        JOptionPane.showMessageDialog(null, info);  
    }  
}  

public class tugasOOP10 {  
    public static void main(String[] args) {  
        Siswa siswa = new Siswa();  
        siswa.inputDataSiswa();  
        siswa.info();  

        Guru guru = new Guru(123732, "Bu Yuni", "Bahasa Inggris");  
        guru.info();  

        Sekolah sekolah = new Sekolah();  
        sekolah.info();  
    }  
}