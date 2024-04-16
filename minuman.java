package duapuluh;
import java.util.Scanner;
/**
 * minuman
 */
public class minuman {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String gelas1, gelas2, gelas3;
        System.out.println("========== Menukar isi Minuman ==========");
        System.out.print("Masukan minuman gelas 1 = ");
        gelas1 = in.nextLine();
        
        System.out.print("Masukan minuman gelas 2 = ");
        gelas2 = in.nextLine();
        
        gelas3 = gelas1;
        
        gelas1 = gelas2;
        
        gelas2 = gelas3;
        
        System.out.println("\n========== Setelah ditukar ==========");
        System.out.println("Minuman Gelas 1 = "+gelas1);
        System.out.println("Minuman Gelas 2 = "+gelas2);
    }
}