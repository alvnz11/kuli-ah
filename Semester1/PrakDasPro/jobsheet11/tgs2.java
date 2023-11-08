package Semester1.PrakDasPro.jobsheet11;

import java.util.*;

public class tgs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}