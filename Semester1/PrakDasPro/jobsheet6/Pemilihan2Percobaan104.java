package Semester1.PrakDasPro.jobsheet6;

import java.util.*;

public class Pemilihan2Percobaan104 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        System.out.print("Masukkan tahun : ");
        int tahun = input04.nextInt();

        if (tahun % 4 == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
            } else if ((tahun % 100) == 0) {
                if ((tahun % 400) == 0) {
                    System.out.println("Tahun Kabisat");
                } else
                    System.out.println("Bukan Tahun Kabisat");
            }
        } else 
            System.out.println("Bukan Tahun Kabisat");
    }
    
}