package Semester1.PrakDasPro.jobsheet11;

import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'y';

        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;

            do {
                System.out.print("Tebak angka (1-10) : ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);
                if (answer > number) {
                    System.out.println("Jawaban lebih kecil!");
                } else if (answer < number){
                    System.out.println("Jawaban lebih besar!");
                } else {
                    System.out.println("Tebakkan anda benar");
                }
            } while (!success);

            System.out.println("Apakah anda ingin mengulang permainan (Y/y)?");
            menu = input.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');
        
    input.close();    
    }
    
}