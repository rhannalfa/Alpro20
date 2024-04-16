package duapuluh;
import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan bilangan pertama: ");
        double angka1 = in.nextDouble();
        System.out.print("Masukan bilangan kedua: ");
        double angka2 = in.nextDouble();
        System.out.println("Pilih (+, -, *, /):");
        char operation = in.next().charAt(0);
        double result = 0;
        switch (operation) {
            case '+':
                result = angka1 + angka2;
                break;
            case '-':
                result = angka1 - angka2;
                break;
            case '*':
                result = angka1 * angka2;
                break;
            case '/':
                if (angka2 == 0) {
                    System.out.println("Error: Bilangan tidak bisa di bagi 0");
                    return;
                }
                result = angka1 / angka2;
                break;
            default:
                System.out.println("Error: Pilihan salah");
                return;
        }
        System.out.printf("Hasil: %.2f %c %.2f = %.2f%n", angka1, operation, angka2, result);
    }
}
