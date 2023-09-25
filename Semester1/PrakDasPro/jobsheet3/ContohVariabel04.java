/**
 * ContohVariabel04
 */
public class ContohVariabel04 {

    public static void main(String[] args) {
        
        String hobiSaya = "Bermain petak umpet";
        boolean jikaPandai = true;
        char jenisKelamin = 'L';
        byte umurSaya = 19;
        double $ipk = 3.24, tinggi = 1.78;

        System.out.println(hobiSaya);
        System.out.println("Apakah anda pandai? " + jikaPandai);
        System.out.println("Jenis Kelamin       : " + jenisKelamin);
        System.out.println("Umur saya saat ini  : " + umurSaya);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi)); 
    }
}