package Semester1.PrakDasPro.jobsheet10;

import java.util.*;

public class BioskopWithScanner04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama;
        boolean loop = true;
        String [][] penonton = new String[][] {
            {"***", "***"},
            {"***", "***"},
            {"***", "***"},
            {"***", "***"}
        };
        


        while (loop) {
            System.out.println();
            System.out.println("Silahkan pilih menu: ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Masukkan Pilihan Anda : ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                System.out.print("Masukkan nama: ");
                nama = sc.next();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
    
                
                if (baris > 0 && baris <= penonton.length && kolom > 0 && kolom <= penonton[0].length) {
                    if (penonton[baris-1][kolom-1] != "***") {
                        System.out.println("Kursi Sudah Terisi!, Silahkan Masukkan Baris dan Kolom lainnya!");
                    } else {
                        penonton[baris-1][kolom-1] = nama;
                        System.out.println("Kursi Tersedia!");
                    }
                } else {
                    System.out.println("Kursi tidak tersedia!");
                }
                    break;

                case 2:
                for (int i = 0; i < penonton.length; i++) {
                    System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join("  ", penonton[i]));
                }
                    break;

                case 3:
                    loop = false;
                    break;
                    
                default:
                    System.out.println("Input yang anda masukkan salah!");
                    continue;
            }
        }

    }
    
}
