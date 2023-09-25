import java.util.Scanner;

public class pemilihanpercobaan104 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = input04.nextInt();
        input04.close();

        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " bilangan genap");
        } else {
            System.out.println("Angka " + angka + " bilangan ganjil");
        }

    }

}