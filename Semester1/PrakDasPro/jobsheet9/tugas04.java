import java.util.*;

public class tugas04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rata2 = 0,  total = 0;
        int temp = 0;

        System.out.print("Masukkan banyaknya nilai : ");
        int elm = sc.nextInt();
        int[] nilai = new int[elm];

        for (int i = 0;  i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i+1) + " : ");
            nilai[i] = sc.nextInt();
        }

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 1; j < nilai.length-i; j++ ) {
                if (nilai[j-1] > nilai[j]) {
                    temp = nilai[j];
                    nilai[j] = nilai[j-1];
                    nilai[j-1] = temp;
                }
            }
        }
        
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }

        rata2 = total / nilai.length;
        
        System.out.println("Nilai terendah = " + nilai[0]);
        System.out.println("Nilai tertinggi = " + (nilai[nilai.length-1]));
        System.out.println("Rata-rata = " + rata2);
    sc.close();
    }
    
}