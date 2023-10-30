import java.util.Scanner;

public class tugas1p9 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan jumlah elemen : " );
    int jml = input.nextInt();
    int[] array = new int[jml];

    for (int i = 0; i < jml; i++) {
        System.out.print("Masukkan elemen ke-" + (i + 1) +" : " );
        array[i] = input.nextInt();
    }

    int nilaiTertinggi = array[0];
    int nilaiTerendah = array[0];
    int jumlah = array[0];

    for (int i = 1; i < jml; i++) {
        if (array[i] > nilaiTertinggi) {
        nilaiTertinggi = array[i];
        }

        if (array[i] < nilaiTerendah) {
        nilaiTerendah = array[i];
        }

        jumlah += array[i];
    }

    double rataRata = (double) jumlah / jml;

    System.out.println("Nilai tertinggi: "+ nilaiTertinggi);
    System.out.println("Nilai terendah: "+ nilaiTerendah);
    System.out.println("Nilai rata-rata: "+ rataRata);

    input.close();
    }
}