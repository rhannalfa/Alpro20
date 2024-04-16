package duapuluh;
import java.util.Scanner;
/**
 * login
 */
public class login {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String username , password;
        System.out.println("=============== Login =============== ");
        for(int i=3; i>=1; i--){
        System.out.print("Masukan Username = ");
        username = in.nextLine();
        
        System.out.print("Masukan Password = ");
        password = in.nextLine();

            if(username.equals("admin")&&password.equals("password")){
                System.out.println("\nLogin berhasil\n");
                break;
            }else if(i == 1){
                System.out.println("\nAnda sudah 3x salah");
                System.out.println("tunggu 5 menit untuk login kembali!\n");
            }else{
                System.out.println("\nUsername atau Password anda salah,");
                System.out.println("silahkan login kembali (kesempatan login "+(i-1)+"x lagi) \n");
            }                                                                                                  
        }
        System.out.println("=====================================");
    }
}