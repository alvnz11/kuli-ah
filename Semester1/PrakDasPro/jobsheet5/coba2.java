import java.util.Scanner;

public class coba2 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        String nilaiHuruf;

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
            nilaiHuruf = "A";
        } else if (total > 73) {
            nilaiHuruf = "B+";
        } else if (total > 65) {
            nilaiHuruf = "B";
        } else if (total > 60) {
            nilaiHuruf = "C+";
        } else if (total > 50) {
            nilaiHuruf = "C";
        } else if (total > 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        System.out.println("Nilai akhir = " + total + " sehingga " + message);
        System.out.println("Nilai huruf = " + nilaiHuruf + " (Lebih dari Baik)" );

    }
}
