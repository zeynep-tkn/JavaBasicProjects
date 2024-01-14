package application;

import java.util.Random;
import java.util.Scanner;


public class FinalCalisma3 {

	public static void main(String[] args) {
		Random4();
		Random3();
		Random2();
		Random1();
		isArmstrongSayi();
		isPalindromikWord();
        DiziElemanSirala();
		DizideBuyukKucukBul();
	}
    
	public static void DizideBuyukKucukBul() {
		Scanner input= new Scanner(System.in);
		int dizi[]=new int[5];
		
		
		for(int i=0;i<5;i++) {
			System.out.println(i+".elemanı girin: ");
			dizi[i]=input.nextInt();
		}
		int enbuyuk=dizi[0];
		int enkucuk=dizi[0];
		
		for(int i=0;i<5;i++) {
			if(dizi[i]>enbuyuk) {
				enbuyuk=dizi[i];
			}
			else if(enkucuk>dizi[i]) {
				enkucuk=dizi[i];
			}	
		}
		System.out.println("en kucuk eleman:"+enkucuk);
		System.out.println("en buyuk eleman:"+enbuyuk);
	}
	
	public static void DiziElemanSirala() {
		Scanner input= new Scanner(System.in);
		int dizi[]=new int[5];
		int gecici;
		
		for(int i=0;i<5;i++) {
			System.out.println(i+".elemanı girin: ");
			dizi[i]=input.nextInt();
		}
		for(int i=0;i<4;i++) {
			for(int j=i+1;j<5;j++) {
				if(dizi[j]<dizi[i]) {
					gecici=dizi[i];
					dizi[i]=dizi[j];
					dizi[j]=gecici;
				}
			}
		}
		System.out.println("Sıralı dizi: ");
		for(int i=0;i<5;i++) {
			System.out.println("Dizinin "+i+".elemanı:"+dizi[i]);
		}
	}
	
	public static void isPalindromikWord() {
		Scanner input=new Scanner(System.in);
		System.out.println("Palindromik kontrolü için kelime girin:");
		String kelime=input.nextLine();
		String terskelime="";
		for(int i=(kelime.length()-1);i>=0;i--) {
			terskelime+=kelime.charAt(i);
		}
		if(terskelime.equals(kelime)) {
			System.out.println("palindromik kelimedir");
		}
		else {
			System.out.println("palindromik kelime değildir");
		}
	}
	
	//407=4^3 + 0^3 + 7^3 = 407 ise 
	public static void isArmstrongSayi() {
		Scanner input=new Scanner(System.in);
		System.out.println("Armstrong kontrolü için sayı girin:");
		int sayi=input.nextInt();
		int num,sayac=0;
		int gecici[]=new int[5];
		System.out.print("Sayının basamakları:");
		while(sayi>0) {
			int i=0;
			num=sayi%10;
			System.out.print(" "+num);//birler //onlar //yüzler
			sayac++;
			gecici[i]=num;
			i++;
			sayi=sayi/10;
			
		}
		int islem=1,toplam=0;
		for(int i=0;i<sayac ;i++) {
			islem=gecici[i]*islem ;
			toplam=toplam+islem;
		}
		System.out.println("toplam:"+toplam);
		
		if(sayi==toplam) {
		System.out.println("Armstrong sayidir");
		}
		else {
			System.out.println("Armstrong sayi degildir");
		}
	}
	
	public static void Random1() {
		Random rastgele=new Random();
		int sayi;
		for(int i=0;i<5;i++) {
			sayi=rastgele.nextInt(100);
			System.out.println(sayi);
		}
	}
	
	public static void Random2() {
		Random rastgele=new Random();
		int sayi,toplam=0;
		float ort;
		for(int i=0;i<5;i++) {
			sayi=rastgele.nextInt(50);
			System.out.println(sayi);
			toplam+=sayi;
		}
		ort=toplam/5;
		System.out.println("ortalaması: "+ort);
	}
	
	
	public static void Random3() {
		Random rastgele=new Random();
		int sayi,toplam=0;
		
		for(int i=0;i<5;i++) {
			sayi=rastgele.nextInt(50);
			if(sayi%2==0) {
			  System.out.println(sayi+" çift sayıdır");
			  toplam+=sayi;
			}
			else {
			  System.out.println(sayi);
			}
			
		}
		
		System.out.println("Çift sayılar toplamı: "+toplam);
	}
	
	public static void Random4() {
		Random rastgele=new Random();
		int sayi,num;
		for(int i=0;i<5;i++) {
			int toplam=0;
			sayi=rastgele.nextInt(100);
			System.out.print(sayi);
			  while(sayi>0) {
			    toplam+=sayi%10;
			    sayi=sayi/10;
			  }
			System.out.println(" rakamları toplamı: "+toplam);
		}
	}
	
	
	
}
