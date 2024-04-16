package duapuluh;
import java.util.Scanner;

public class titikDidihAir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan Temperatur Air (Celcius) = ");
        int es = in.nextInt();

        if (es <= 0){
            System.out.println("Air membeku menjadi es");
        }else if(es >= 100){
            System.out.println("Air menguap menjadi gas");
        }else{
            System.out.println("Es mencair menjadi air");
        }
    }
}
