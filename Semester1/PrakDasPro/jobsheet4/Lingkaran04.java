import java.util.Scanner;

public class Lingkaran04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r;
        double keliling, luas, phi = 3.14;

        System.out.println("Masukkan jari-jari Lingkaran : ");
        r = input.nextInt();
        keliling = 2*phi*r;
        luas = phi*r*r;
        input.close();

        System.out.println(keliling);
        System.out.println(luas);
    }
    
}