import java.util.Scanner;

public class TekCiftSayilarinToplamiFonk {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("bir sayi girin: ");
		int sayi=input.nextInt();

		System.out.println("cift-sonuc: "+CiftFonk(sayi));
		System.out.println("tek-sonuc: "+TekFonk(sayi));
	}
	

	public static int CiftFonk(int x){
	int toplam=0;
	if(x%2==0){ 
	   for(int i=0;i<=x;i=i+2){
          toplam=toplam+i;
	    }
    }
	else{
	   for (int i=0;i<x;i=i+2){
	       toplam=toplam+i;
	    }
	}
	  return toplam;
	}

 public static int TekFonk(int x){
	int toplam=0; 
	if(x%2==0){
	   for(int i=1;i<x;i=i+2){
	      toplam=toplam+i;
	   }
	}
	else{
		for(int i=1;i<=x;i=i+2){
	       toplam=toplam+i;
	    }
	}
	  return toplam;
 }

}

