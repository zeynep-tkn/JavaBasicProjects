package application;

import java.util.Scanner;

public class finalCalisma {

	public static void main(String[] args) {
		//Bu bizim main metodumuz
	   System.out.println("--------------------------------------------");
       System.out.println("Final Çalışma Sorularını bu sınıfa yazacağız");
       
       ondaliksayiAl();
	}
	
	public static void ondaliksayiAl() {
		Scanner input= new Scanner(System.in);
		System.out.println("Lutfen sayi girin:");
		float sayi3=input.nextFloat();
		
		System.out.println("Lutfen sayi girin:");
		float sayi4=input.nextFloat();
		
	    Carp(sayi3, sayi4);
	    Topla(sayi3, sayi4);
	    BolumKalanBul(sayi3, sayi4);
	    
	   SayiDegistirme();
	   isTekOrCift(sayi3, sayi4);
	   CarpimTablo(sayi3);
	   
	    input.close();
	}

	public static void Topla(float bir, float iki) {
		float toplam= bir+iki;
		System.out.println("toplam: "+toplam);
	}
	
	
	public static void Carp(float bir, float iki) {
		float carpim=bir*iki;
		System.out.println("çarpım="+carpim);
	}
	
	
	public static void BolumKalanBul(float bir, float iki) {
		if(bir>iki) {
			float kalan=bir%iki;
			float bolum=bir/iki;
			System.out.println("kalan:"+ kalan+ "\nBölüm:" +bolum);
			
		}
		else {
			float kalan=iki%bir;
			float bolum=iki/bir;
			System.out.println("kalan:"+ kalan+ "\nBölüm:" +bolum);
		}
	}
	
	public static void SayiDegistirme() {
	int birinci=12,ikinci=7;
	System.out.println("degisimden once->1:"+birinci+"\n2:"+ikinci);
	int gecici=ikinci;
	ikinci=birinci;
	birinci=gecici;
		System.out.println("degisimden sonra->1:"+ birinci+ "\n2:"+ikinci);
	}
	
	public static void isTekOrCift(float bir,float iki) {
		if(bir%2==0 && iki%2==0) {
			System.out.println(bir+"ve"+iki+"sayisi cifttir");
		}
		else {
			System.out.println(bir+"ve"+iki+"sayisi tektir");
		}
	}
	
	public static void CarpimTablo(float bir) {
		System.out.println("Çarpım Tablosu:::\n");
		for(int i=1;i<10;i++) {
			float sonuc=i*bir;
			System.out.printf("%f * %d = %f\n ",bir,i,sonuc);
		}
	
	}
	

}
