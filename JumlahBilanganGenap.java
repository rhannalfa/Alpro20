package duapuluh;
import java.util.Scanner;


public class JumlahBilanganGenap
 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int number,counter = 0;
        
        
        while (true) {
            System.out.print("Masukan Bilangan = ");
            number = in.nextInt();

            if (number == -1){
                break;
            }

            if (number > 0 && number % 2 == 0) {
                counter++;
            }
        }
        System.out.println("Jumlah Bilangan Genap : " + counter);
    }
}
