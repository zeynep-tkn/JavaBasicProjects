import java.util.Scanner;
public class FactFonk {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("faktoriyelini alacağimiz sayiyi girin:");
		int sayi=input.nextInt();
		
		System.out.println(sayi+"!="+factBul(sayi));
	}
	
	public static int factBul(int x) {
		int fact=1,sonuc;
		for (int i=x;i>0;i--) {
			fact=fact*i;
			
		}
		
		sonuc=fact;
		return sonuc;
	}

}
