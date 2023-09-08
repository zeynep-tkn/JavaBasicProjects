//girilen asal sayi mi kontrol programi
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
public class dene2 {

	public static void main(String[] args) {
	System.out.println("");
    Scanner scan = new Scanner(System.in);
   
       int sayi,i,kontrol=0;
       System.out.println("sayi girin: ");
       sayi = scan.nextInt();
       for(i=2;i<30;i++) {
    	   if(sayi%i==0)
    	   kontrol=1;
       }
       if(kontrol==1)
       System.out.println("sayi asal degildir");
       else 
    	System.out.println("sayi asaldir");   
	}

}
