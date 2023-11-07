package Semester1.PrakDasPro.jobsheet11;

import java.util.Scanner;

public class NestedLoop_2341720182 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rata2 = 0;
        
        double temps[][] = new double[5][7];
        double total[] = new double[7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i+1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j+1) + ": ");
                temps[i][j] = sc.nextDouble();
                
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i+1) + ": ");
            for (double suhu : temps[i]) {
                System.out.print(suhu + " ");
                total[i] += suhu;
            }
            rata2 = total[i] / total.length;
            System.out.println();
            System.out.printf("Rata-rata suhu : %.2f", rata2);
            System.out.println("\n");
        }
    sc.close();   
    }
}
