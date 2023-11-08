import java.util.Scanner;

public class ifUygD {

	public static void main(String[] args) {
		Cikis();

	}
	
	public static void Cikis() {
		String cikis="q";
		String giris="f";
		Scanner input=new Scanner(System.in);
		System.out.println("cikmak icin q ya bas:");
		String tus=input.nextLine();
	     if(cikis.equals(tus)){
		  System.out.println("Çıkış yapılıyor...");
	     }
	     else if(cikis.equals(giris)){
			System.out.println("Giriş yapılıyor...");
		}
	     else {
	    	 System.out.println("Tekrar deneyiniz...");
	     }
	    	 
	     
	}
	
}
