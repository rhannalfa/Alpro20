package duapuluh;
import java.util.Scanner;
/**
 * bulan
 */
public class bulan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=====  Menentukan Nama Bulan  =====");

        System.out.print("Masukan angka bulan (1-12) = ");
        int bulan = in.nextInt();

        if (bulan == 1) {
            System.out.println("Januari");
        }else if (bulan == 2) {
            System.out.println("Februari");
        }else if (bulan == 3) {
            System.out.println("Maret");
        }else if (bulan == 4) {
            System.out.println("April");
        }else if (bulan == 5) {
            System.out.println("Mei");
        }else if (bulan == 6) {
            System.out.println("Juni");
        }else if (bulan == 7) {
            System.out.println("Juli");
        }else if (bulan == 8) {
            System.out.println("Agustus");
        }else if (bulan == 9) {
            System.out.println("September");
        }else if (bulan == 10) {
            System.out.println("Oktober");
        }else if (bulan == 11) {
            System.out.println("November");
        }else if (bulan == 12) {
            System.out.println("Desember");
        }else{
            System.out.println("Pilihan Tidak ada!");
        }
    }
}