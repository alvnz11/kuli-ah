import java.util.*;

public class ArrayRataNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total1 = 0, total2 = 0;
        double rata2, rataLulus, rataTdkLulus;
        int counter1 = 0, counter2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : " );
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                total1 += nilaiMhs[i];
                counter1++;
            } else {
                total2 += nilaiMhs[i];
            }
        }
        counter2 = nilaiMhs.length - counter1;
        rataLulus = total1 / counter1;
        rataTdkLulus = total2 / counter2;
        rata2 = (total1 + total2) / nilaiMhs.length;
        
        System.out.println("Jumlah mahasiswa yang lulus = " + counter1);
        System.out.println("Jumlah mahasiswa yang tidak lulus = " + counter2);
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTdkLulus);
        System.out.println("Rata-rata seluruh nilai = " + rata2);

    sc.close();    
    }
    
}
