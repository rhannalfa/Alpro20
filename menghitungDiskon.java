package duapuluh;
import java.util.Scanner;
/**
 * menghitungDiskon
 */
public class menghitungDiskon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double  diskon,harga,hargaPasar,s;
        
        System.out.print("Masukan harga pasar = Rp.");
        hargaPasar = in.nextDouble() ;
        
        System.out.print("Masukan diskon = ");
        diskon = in.nextDouble();
        
        System.out.println("Harga pasar = "+hargaPasar);
    
        System.out.println("Diskon = "+diskon+ "");
            
        s=100-diskon;
    
        harga= (s*hargaPasar)/100;
    
        System.out.println("Harga setelah di diskon Rp.= "+harga);
 
	
    }
}