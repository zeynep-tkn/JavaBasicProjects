package application;

import java.util.Scanner;

public class FinalCalisma2 {

	public static void main(String[] args) {
		IkiBoyutluDizi();
		TekSayilariYeniDiziyeAt();
		DizininOrtBul();
		SayiAl();
		
		
	}
	public static void SayiAl() {
		Scanner input =new Scanner(System.in);
		
		System.out.println("Sayi girin:");
		int sayi=input.nextInt();
		System.out.println("Sayi girin:");
		int sayi2=input.nextInt();
		
		
		
		KareleriBul(sayi);
		UcveBesKatlari(sayi, sayi2);
		Ebob(sayi, sayi2);
		Ekok(sayi, sayi2);
		MukemmelSayi(sayi);
		}
	
	//Girilen sayiya kadarki sayilarin karelerini Bul
	public static void KareleriBul(int bir) {
		int i=1,karesi;
		while(i<=bir) {
			karesi=i*i;
			System.out.println(i+". sayinin karesi: "+karesi);
			i++;
		}
		
	}
	//girilen iki sayi arasindaki 3 ve 5e bolunebilenleri yaz
	//15 20 
	public static void UcveBesKatlari(int bir,int iki) {
		System.out.println("3 ve 5'in katlari:");
		if(bir>iki) {
			 for(int i=iki;i<=bir;i++) {
				  if(i%3==0 && i%5==0) 
					 System.out.println(i+", ");
			 }
		}
		else {
			for(int i=bir;i<=iki;i++) {
				  if(i%3==0 && i%5==0) 
					 System.out.println(i+", ");
			 }
		}
		
	}
	
	public static void Ebob(int bir,int iki) {
		if(bir>iki) {
		for(int i=iki;i>0;i--) {
			if(bir%i==0 && iki%i==0) {
				System.out.println("Ebob:"+i);
				break;
			}
		}
		}
		else {
			for(int i=bir;i>0;i--) {
				if(bir%i==0 && iki%i==0) {
					System.out.println("Ebob:"+i);
					break;
				}
			}
		}
		
	}
	
	public static void Ekok(int bir,int iki) {
		if(bir>iki){
		for(int i=bir;i<=bir*iki;i++) {
			if(i%bir==0 && i%iki==0) {
				System.out.println("Ekok:"+i);
				break;
			}
		}
		}
		else {
			for(int i=iki;i<=bir*iki;i++) {
				if(i%bir==0 && i%iki==0) {
					System.out.println("Ekok:"+i);
					break;
				}
			}
			}
		
	}
	//sayinin bolenleri toplamının iki kati sayiya esitse
	public static void MukemmelSayi(int bir) {
		System.out.print("Pozitif bolenleri: ");
		int toplam=0;
		for(int i=bir;i>0;i--) {
				if(bir%i==0) {
					System.out.print(i+", ");
					toplam=toplam+i;
				}
		}
		
		if(toplam==bir*2) {
			System.out.println("\nMukemmel sayidir");
		}
		else {
			System.out.println("\nMukemmel sayi degildir");
		}
			
			
	}
	//15 20 5 30 30    20
	public static void DizininOrtBul() {
		Scanner input= new Scanner(System.in);
		System.out.println("dizi boyutunu girin:");
		int boyut=input.nextInt();
		
		int dizi[]=new int[boyut];
		int toplam=0;
		for(int i=0;i<boyut;i++) {
			System.out.println("dizinin "+i+". elemanı gir:");
			dizi[i]=input.nextInt();

			toplam=toplam+dizi[i];
		}
		float ort=toplam/boyut;
		System.out.println("dizinin ortalamasi: "+ort);
	}
	
	
	
	public static void TekSayilariYeniDiziyeAt() {
		Scanner input= new Scanner(System.in);

		int dizi[]=new int[10];
		int dizi2[]=new int[10];
        int sayac=0;
		for(int i=0;i<10;i++) {
			System.out.println(i+". elemanı girin: ");
			dizi[i]=input.nextInt();
			
			if(dizi[i]%2==1) {
				dizi2[sayac]=dizi[i];
				sayac++;
			}
			
		}
		System.out.println("tek sayi dizisi:");
		
		for(int i=0;i<sayac;i++) {
			System.out.println(dizi2[i]+", ");
		}
		
	}
	
	public static void IkiBoyutluDizi() {
		Scanner input= new Scanner(System.in);
		System.out.println("dizi eleman sayisini girin:");
		int boyut=input.nextInt();
		
		int dizi[][]=new int[3][2];
	
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("sayi girin:");
				dizi[i][j]=input.nextInt();
			}
		
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(dizi[i][j]+" ");
				
			}
			System.out.print("\n");
		}
	}
	

}
