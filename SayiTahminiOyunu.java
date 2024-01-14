package application;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminiOyunu {

	public static void main(String[] args) {
		System.out.println("Sayı tahmin etme oyununa hoş geldiniz...\n7 hakkınız bulunmaktadır");
		System.out.println("Rastgele sayi 0-50 arasındadır\nİlk denemeye başlayın");
		System.out.println("----------------------------------------");
		Rastgele();
		
	
	}
	
	public static void Rastgele() {
		Scanner input=new Scanner(System.in);
		int sayi,sayac=0;
		Random rastgele=new Random();
		sayi=1+rastgele.nextInt(49);

		for(int i=0;i<6;i++) {
			sayac++;
			System.out.println("Sayiyi giriniz: ");
			int sayi2=input.nextInt();
			  if(sayi2>sayi) 
			 	System.out.println("Sayiyi azaltın");
			  else if(sayi2<sayi)
				System.out.println("Sayiyi arttırın");
			  else {
				System.out.println("Tebrikler! Sayiyi bildiniz");
				break;
			  }
		}
		if(sayac==6)
		System.out.println("Hakkınız bitti! "+sayi+"sayisini bilemediniz");
	}

	
	
}
