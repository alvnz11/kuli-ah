import java.util.Scanner;

public class modifpercobaan2 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        System.out.print("Nilai uas     : ");
        float uas = input04.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input04.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input04.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input04.nextFloat();
        input04.close();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi";

        if (total > 80 && total <= 100) {
            System.out.println("Nilai akhir = " + total + " sehingga " + message);
            System.out.println("Nilai huruf = A (Sangat Baik)" );
        } else if (total > 73) {
            System.out.println("Nilai akhir = " + total + " sehingga " + message);
            System.out.println("Nilai huruf = B+ (Lebih dari Baik)" );
        } else if (total > 65) {
            System.out.println("Nilai akhir = " + total + " sehingga " + message);
            System.out.println("Nilai huruf = B (Baik)" );
        } else if (total > 60) {
            System.out.println("Nilai akhir = " + total + " sehingga " + message);
            System.out.println("Nilai huruf = C+ (Lebih dari Cukup)" );
        } else if (total > 50) {
            System.out.println("Nilai akhir = " + total + " sehingga " + message);
            System.out.println("Nilai huruf = C (Cukup)" );
        } else if (total > 39) {
            System.out.println("Nilai akhir = " + total + " sehingga " + message);
            System.out.println("Nilai huruf = D (Kurang)" );
        } else {
            System.out.println("Nilai akhir = " + total + " sehingga " + message);
            System.out.println("Nilai huruf = E (Gagal)" );
        }
    }
}
