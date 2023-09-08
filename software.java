//hesap makinesi (switch fonksiyonu ile)
import java.util.Scanner;
public class software {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
        int sayi1,sayi2,islem;
        System.out.println("ilk sayiyi girin:");
        sayi1=input.nextInt();
        System.out.println("ikinci sayiyi girin:");
        sayi2=input.nextInt();
        System.out.println("1-toplama");
        System.out.println("2-cikarma");
        System.out.println("3-carpma");
        System.out.println("4-bolme");
        System.out.println("5-mod alma");
        
        System.out.println("istediginiz islem numarasi girin:");
        islem=input.nextInt();
        switch(islem){
            case 1:
                System.out.println("sonuc="+(sayi1+sayi2));
                break;
            case 2:    
                System.out.println("sonuc="+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("sonuc="+(sayi1*sayi2));   
                break;
            case 4:
                System.out.println("sonuc="+(sayi1/sayi2));  
                break;
            case 5:
                System.out.println("sonuc="+(sayi1%sayi2));  
                break;
            default:
                System.out.println("lutfen gecerli numara girin");
                break;
        }	
		
		
		
		
		
		
		
		
	}

}
