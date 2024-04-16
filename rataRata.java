package duapuluh;
import java.util.Scanner;

public class rataRata
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, count = 0;
        double total = 0.0;
        
        
        for (int i = 0; i < 100; i++)
        {
            System.out.print("Masukan Bilangan (-1 stop): ");
            num = in.nextInt();;
            
            if (num == -1)
            {
                break;
            }
            
            count++;
            total += num;
        }
    
        double avg = total / count;
        System.out.println("Total rata-rata yang di masukan : "+ avg);
    }
}