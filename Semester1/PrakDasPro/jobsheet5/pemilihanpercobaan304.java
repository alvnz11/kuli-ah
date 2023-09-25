import java.util.Scanner;

public class pemilihanpercobaan304 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukkan angka pertama : ");
        angka1 = input04.nextDouble();
        System.out.print("Masukkan angka kedua : ");
        angka2 = input04.nextDouble();
        System.out.print("Masukkan operator (+ - * /) : ");
        operator = input04.next().charAt(0);
        input04.close();

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka1 + " = " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                break;
        }
    }

}
