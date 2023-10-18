import java.util.Scanner;

public class KitleIndeksi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz:");
		Double boy= input.nextDouble();
		
		System.out.println("Lütfen kilonuzu giriniz:");
		Double kilo= input.nextDouble();
          
		double sonuc;
		  sonuc=kilo/(boy*boy);
		
		System.out.println("Vücut kitle indeksiniz:"+sonuc);
	}

}
