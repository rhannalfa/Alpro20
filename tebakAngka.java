package duapuluh;
import java.util.Scanner;

public class tebakAngka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int nomor = 1 + (int)(100*Math.random());

        int K = 5;
        int i,tebak;

        System.out.println("Ketik nomor dari 1-100 \nTebak nomor 5 kali kesempatan!");
        for(i = 0; i < K; i++){
            System.out.print("Tebak nomor : ");
            tebak = in.nextInt();

            if (nomor == tebak) {
                System.out.println("Selamat Tebakan Anda Benar (^ v ^)!");
                break;
            }else if (nomor > tebak && i != K -1){
                System.out.println("Nomor lebih besar dari " + tebak);
            }else if (nomor < tebak && i != K -1){
                System.out.println("Nomor lebih kecil dari " + tebak);
            }

        }

        if (i == K) {
            System.out.println("Kesempatan mu habis (>_<)");
            System.out.println("Nomor nya adalah " + nomor);
        }
    }
}
