import java.util.Scanner;

public class pemilihanpercobaan104 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = input04.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }

        input04.close();
    
    }

}