package duapuluh;
import java.util.Scanner;
   
class PersegiPanjangBintang {
  public static void main(String args[]){
            
    Scanner in = new Scanner(System.in);
       
    System.out.println("##  Program Java Persegi Panjang Bintang ##");
    System.out.println();
     
    int tinggi,lebar,i,j;
  
    System.out.print("Input tinggi persegi: ");
    tinggi = in.nextInt();
    
    System.out.print("Input lebar persegi: ");
    lebar = in.nextInt();
     
    System.out.println();
    
    for(i=1; i<=tinggi; i++) {
      for(j=1; j<=lebar; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }
     
  }
}