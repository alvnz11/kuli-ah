import java.util.Scanner;

public class HargaBayar04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int harga, jumlah, halBuku;
        double total, bayar, jmlDis, dis; 
        String merkBuku;

        System.out.println("Masukkan harga barang yang dibeli ");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli ");
        jumlah = input.nextInt();
        System.out.println("Masukkan diskon yang anda dapatkan(%) ");
        dis = input.nextDouble();
        System.out.println("Masukkan merk buku yang anda beli ");
        merkBuku = input.next();
        System.out.println("Masukkan jumlah halaman buku yang anda beli ");
        halBuku = input.nextInt();
        input.close();

        total = harga*jumlah;
        jmlDis = total*(dis/100);
        bayar = total - jmlDis;

        System.out.println("Merk buku : " + merkBuku);
        System.out.println("Halaman buku : " + halBuku + " Lembar ");
        System.out.println("Diskon yang anda dapatkan adalah Rp." + jmlDis);
        System.out.println("Harga yang harus dibayarkan adalah Rp." + bayar);
        System.out.println("===========================================");
    }
    
}
