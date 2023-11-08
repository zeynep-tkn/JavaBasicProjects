import java.util.Scanner;

public class KupAl {

	public static void main(String[] args) {
	  Scanner input=new Scanner(System.in);
	  System.out.println("Sayi girin:");
	  int sayi=input.nextInt();
	  System.out.println(sayi+" sayisinin kubu="+kupFonk(sayi));
	}
    
	public static int kupFonk(int a) {
		return a*a*a;
	}
}
