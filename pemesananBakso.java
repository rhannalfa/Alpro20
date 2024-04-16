package duapuluh;
import java.util.Scanner;
/**
 * a
 */


public class pemesananBakso {
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan Nama : ");
        String name = in.nextLine();

        System.out.println("============ Pemesanan ============");
        System.out.println("1. Bakso Cincang    (Rp. 130000)");
        System.out.println("2. Bakso Urat       (Rp. 130000)");
        System.out.println("3. Bakso Telur      (Rp. 150000)");
        System.out.println("4. Bakso Petir      (Rp. 150000)");
        System.out.println("5. Mie Ayam         (Rp. 100000)");

        System.out.print("Pilih (1/2/3/4/5) : ");
        int pilih = in.nextInt();

        System.out.print("Jumlah Pesan : ");
        int order = in.nextInt();



        switch (pilih) {
            case 1:
                System.out.println("Nama Pemesan      : " + name);
                System.out.println("Pesanan           : Bakso Cincang");
                System.out.println("Harga             : Rp. 13.0000");
                System.out.println("Jumlah Pesan      : " + order);
                System.out.println("Total Bayar       : Rp. " + order*13000);
                break;
            case 2:
                System.out.println("Nama Pemesan      : " + name);
                System.out.println("Pesanan           : Bakso Urat");
                System.out.println("Harga             : Rp. 13.0000");
                System.out.println("Jumlah Pesan      : " + order);
                System.out.println("Total Bayar       : Rp. " + order*13000);
                break;
            case 3:
                System.out.println("Nama Pemesan      : " + name);
                System.out.println("Pesanan           : Bakso Telur");
                System.out.println("Harga             : Rp. 15.0000");
                System.out.println("Jumlah Pesan      : " + order);
                System.out.println("Total Bayar       : Rp. " + order*15000);
                break;
            case 4:
                System.out.println("Nama Pemesan      : " + name);
                System.out.println("Pesanan           : Bakso Petir");
                System.out.println("Harga             : Rp. 15.0000");
                System.out.println("Jumlah Pesan      : " + order);
                System.out.println("Total Bayar       : Rp. " + order*15000);
                break;
            case 5:
                System.out.println("Nama Pemesan      : " + name);
                System.out.println("Pesanan           : Mie Ayam");
                System.out.println("Harga             : Rp. 10.0000");
                System.out.println("Jumlah Pesan      : " + order);
                System.out.println("Total Bayar       : Rp. " + order*10000);
                break;
        
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }
    }
}