import java.util.Scanner;

public class ifUygB {

	public static void main(String[] args) {
		Cikis();

	}
	
	public static void Cikis() {
		String cikis="q";
		Scanner input=new Scanner(System.in);
		System.out.println("cikmak icin q ya bas:");
		String tus=input.nextLine();
	     if(cikis.equals(tus)){
		  System.out.println("Çıkış yapılıyor...");
	     }
	     else {
			System.out.println("Tekrar deneyiniz...");
		}
	     
	}
	
}
