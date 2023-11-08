import java.util.Scanner;
public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("ilk sayiyi girin:");
		int sayi1=input.nextInt();
		System.out.println("ikinci sayiyi girin:");
		int sayi2=input.nextInt();
		
		System.out.println("Yapacaginiz islemi secin:");
		System.out.println("1-toplama\n2-Cikarma\n3-Carpma\n"
				+"4-Bolme\n5-Mod Alma\n6-Us Alma\n7-faktoriyel Bulma");
		int secenek=input.nextInt();
		
		switch (secenek) {
		case 1: {
			
			int sonuc=sayi1+sayi2;
			System.out.println("sonuc="+sonuc);
			break;
		}
        case 2: {
        	
        	int sonuc=sayi1-sayi2;
			System.out.println("sonuc="+sonuc);
			break;
		}
        case 3: {
        	
        	int sonuc=sayi1*sayi2;
			System.out.println("sonuc="+sonuc);
        	break;
        }
        case 4: {
        	
        	int sonuc=sayi1/sayi2;
			System.out.println("sonuc="+sonuc);
        	break;
        }
        case 5: {
        	
        	int sonuc=sayi1%sayi2;
			System.out.println("sonuc="+sonuc);
        	break;
        }
        case 6: {
        	int sonuc=1;
        	for(int i=sayi2;i>0;i--) {
        		sonuc=sonuc*sayi1;
        	}
        	System.out.println("sonuc="+sonuc);
        	break;
        }
        case 7: {

    		System.out.println("faktoriyelini alacağimiz sayiyi girin:");
    		int sayi=input.nextInt();
    		int fact=1,sonuc,i;
    		for (i=sayi;i>0;i--) {
    			fact=fact*i;
    		}
    		sonuc=fact;
    		
    		System.out.println(sayi+"!="+sonuc);
    	
        break;
        }
		default:
			System.out.println("Dogru sayi girin...");
		}
		

		
	}
	

}