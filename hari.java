package duapuluh;
import java.util.Scanner;
/**
 * hari
 */
public class hari {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("===== Menentukan Nama Hari =====");

        System.out.print("Masukan angka hari (1-7) = ");
        int hari = in.nextInt();

        if (hari == 1) {
            System.out.println("Senin");
        }else if (hari == 2) {
            System.out.println("Selasa");
        }else if (hari == 3) {
            System.out.println("Rabu");
        }else if (hari == 4) {
            System.out.println("Kamis");
        }else if (hari == 5) {
            System.out.println("Jumat");
        }else if (hari == 6) {
            System.out.println("Sabtu");
        }else if (hari == 7) {
            System.out.println("Ahad");
        }else{
            System.out.println("Pilihan Tidak ada!");
        }
    }
}