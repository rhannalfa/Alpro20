package duapuluh;

import java.util.Scanner;

public class reverseKata {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kata : ");
        String kata1 = input.nextLine();

        String kata2 = "";

        for(int i = kata1.length()-1; i>=0; i--){
            kata2 = kata2 + kata1.charAt(i);
        }
        
        System.out.println("Reverse dari kata '"+kata1+"' adalah " +kata2);
    }
}