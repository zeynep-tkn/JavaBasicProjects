//f(n)=f(n-1)+n girilen n sayisina kadar toplamini bul

import java.util.Scanner;

public class RecursiveFonk {
   
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("sayi girin:");
		int n=input.nextInt();
		System.out.println("sonuc="+f(n));
		
	}
	
	
	public static int f(int n) {
		
	System.out.println("n->"+n);
	
		if(n==1) {
			return 1 ;	
		}
		
		int fonk=f(n-1)+n;
		System.out.println("fonk->"+fonk);
		return fonk;
		
	}
	

}
