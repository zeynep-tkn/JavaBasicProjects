//0 girilene kadar sayilari toplayan program
import java.util.Scanner;

public class kodOrnekleri {

	public static void main(String[] args) {
		System.out.println("");
		Scanner scan = new Scanner(System.in);
        int sayi,sum=0;
        
        while(true) {
          System.out.println("bir sayi girin: ");
          sayi= scan.nextInt();
          
          if(sayi==0) {
        	  System.out.println("toplam: "+sum);
        	  break;
          }
          
         sum= sayi+sum;
        }
        
	}

}
