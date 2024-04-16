package duapuluh;
import java.util.Scanner;

public class jumlahKata{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Kalimat : ");
        String inputString = input.nextLine();
        inputString = inputString.trim();

        String[] kata = inputString.split("\\s+");
        int jumlahKata = kata.length;
        System.out.println("Jumlah Kata : " + jumlahKata);
    }
}