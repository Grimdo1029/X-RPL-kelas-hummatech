public class OperatorPerbandingan7 {
    public static void main(String[] args) {
        boolean hasilperbandingan;
        int a= 10;
        int b= 15;

        System.out.println("Nilai a = " + a + "/nNilai b = " + b);

        // membandingkan apakah a sama dengan b?
        hasilperbandingan = a == b;
        System.out.println("a == b ?" + hasilperbandingan);

        // membandingkan apakah a tidak sama dengan b?
        hasilperbandingan = a !=b;
        System.out.println("a != b" + hasilperbandingan);

        // membandingkan apakah a lebih besar dari b?
        hasilperbandingan = a > b;
        System.out.println("a > b ?" + hasilperbandingan);

        // membandingkan apakah a lebih kecil dari b?
        hasilperbandingan = a < b;
        System.out.println("a < b ?" + hasilperbandingan);

        // membandingkan apakah lebih besar sama dengan b?
        hasilperbandingan = a >= b;
        System.out.println("a >= b ?" + hasilperbandingan);

        // membandingkan apakah a lebih kecil sama dengan b?
        hasilperbandingan = a <= b;
        System.out.println("a <= b ?" + hasilperbandingan);
    }    


    
}
