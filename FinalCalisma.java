package application;

import java.util.Scanner;

public class FinalCalisma {

	public static void main(String[] args) {
		//Bu bizim main metodumuz
	   System.out.println("--------------------------------------------");
       System.out.println("Final Çalışma Sorularını bu sınıfa yazacağız");
       
       ArtikYilHesap();
       BasamakToplam(1350);
       FibonacciBul();
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
	
	public static void FibonacciBul() {
		int s1=0,s2=1,gecici;
		Scanner scan= new Scanner(System.in);
		System.out.println("Fibonacci dizisi...\n");
		System.out.printf("lutfen dizinin son elemanını belirleyin:");
        int n=scan.nextInt();
        
		for(int i=1;i<=n;i++) {
			if(n<s1) {
			break;
			}
			System.out.println(s1+", ");
			int toplam=s1+s2;
			s1=s2;
			s2=toplam;	
		}
		// sayi:n  n,(n-1)+n,3n-1,5n-2,
		//1,1,2,3,5,8
	}
	
	public static void BasamakToplam(int bir) {
		int toplam=0;
		while(bir !=0){
		toplam=(bir%10)+toplam;
		bir=bir/10;
		}
		System.out.println("Basamak Toplamı= "+toplam);
		//195  195%10=5  19%10=9  19/10=1
	}
	
	public static void ArtikYilHesap() {
		//4 veya 100 e bolunebilen yillar artik yildir
		int yil=2018;
		
		if(yil%4==0) {
		  System.out.println("Artik yildir");

		}
		
		else if(yil%100==0) {
			  System.out.println("Artik yildir");
 
		} 
		 else {
			System.out.println("Artik yil degildir2");
		 } 
		
		
	}

}
