package duapuluh;
import java.util.Scanner;

public class syaratKelulusan
{
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        char JK;
        int tinggi;

        System.out.print("Jenis kelamin (L/P) = ");
        JK = in.next().charAt(0);

        System.out.print("Tinggi badan = ");
        tinggi = in.nextInt();
        
        if (JK == 'L' || JK == 'l'){
            if (tinggi >= 165)
            {
                System.out.print("Lulus");
            } else {
                System.out.print("Laki-laki tidak memenuhi syarat kelulusan");
            }
        }else if (JK == 'P' || JK == 'p'){
            if (tinggi >= 160)
            {
                System.out.print("Lulus");
            } else {
                System.out.print("Perempuan tidak memenuhi syarat kelulusan");
            }
        }

    

    
    
    }
}
