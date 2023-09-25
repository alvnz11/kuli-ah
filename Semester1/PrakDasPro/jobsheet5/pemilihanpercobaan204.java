import java.util.Scanner;

public class pemilihanpercobaan204 {
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

        System.out.println("Nilai akhir = " + total + " sehingga " + message);
    }
}