package duapuluh;

import java.util.Scanner;
public class JumlahKarakter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Kata : ");
        String huruf = input.nextLine();
        int x = huruf.length();
        System.out.println("Jumlah karakter dalam (" + huruf + ") adalah " + x);

    }                                                                                   
}
