import java.util.*;

public class LinearSearch04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int key;
        int hasil = 0;
        
        System.out.print("Masukkan jumlah elemen array : ");
        int jml = sc.nextInt();
        int [] arrayInt = new int[jml];
        
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" + i + " : ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari : ");
        key = sc.nextInt();
         
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                 hasil = i;
            } 
        }

        if (arrayInt[hasil] == key) {
            System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan");
        }
    }
}