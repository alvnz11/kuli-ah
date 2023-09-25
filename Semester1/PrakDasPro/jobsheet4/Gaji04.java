import java.util.Scanner;

public class Gaji04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlMasuk, jmlTdkMasuk, totGaji;
        int gaji, potGaji;

        System.out.println("Masukkan jumlah hari kerja anda ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan jumlah hari tidak masuk anda ");
        jmlTdkMasuk = input.nextInt(); 
        System.out.println("Masukkan besaran gaji anda ");
        gaji = input.nextInt();
        System.out.println("Masukkan potongan gaji anda ");
        potGaji = input.nextInt(); 
        totGaji = (jmlMasuk*gaji) - (jmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah " + totGaji);
    }
    
}
