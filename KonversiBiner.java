package duapuluh;
import java.util.Scanner;
   
public class KonversiBiner {
    public static void main(String args[]){
            
        Scanner in = new Scanner(System.in);
          
        System.out.println("    Program Java Konversi Desimal ke Biner    ");
        System.out.println("==============================================\n");
        
        int[] arr = new int[32];
        int desimal, i;
        
        System.out.print("Input angka desimal: ");
        desimal = in.nextInt();
        
        for(i = 0; desimal > 0; i++){
            arr[i] = desimal % 2;
            desimal = desimal / 2;
        }
      
        System.out.print("Angka binernya adalah: ");
        
        for(i = i - 1 ; i >= 0 ; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
   
    }
}