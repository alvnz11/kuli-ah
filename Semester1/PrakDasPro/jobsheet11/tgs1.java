package Semester1.PrakDasPro.jobsheet11;

import java.util.*;

public class tgs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
