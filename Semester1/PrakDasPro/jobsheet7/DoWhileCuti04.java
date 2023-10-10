package Semester1.PrakDasPro.jobsheet7;

import java.util.*;

public class DoWhileCuti04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti : ");
        jatahCuti = input.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = input.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari : ");
                jumlahHari = input.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti : " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                break;
            } else {
                System.out.println("Input yang anda masukkan salah, coba lagi!");
            }
        } while (jatahCuti > 0);
        input.close();
    }
    
}