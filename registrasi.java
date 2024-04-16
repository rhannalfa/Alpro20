package duapuluh;
import java.util.Scanner;
/**
 * registrasi
 */
public class registrasi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nama, username, password, konfpass;

        System.out.println("============== Registrasi ==============");
        System.out.print("Masukan Nama Lengkap  = ");
        nama = in.nextLine();
        System.out.print("Masukan Username      = ");
        username = in.nextLine();
        System.out.print("Masukan Password      = ");
        password = in.nextLine();
        System.out.print("Konfirmasi Password   = ");
        konfpass = in.nextLine();
        System.out.println("========================================");
        
        if (password.equals(konfpass)) {
            System.out.println("Registrasi Sukses!!");
        } else {
            System.out.println("Konfirmasi password salah, coba kembali.");
        }

    }
}