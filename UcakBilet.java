import java.util.Scanner;
public class UcakBilet {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Lütfen gideceginiz mesafeyi km cinsinden girin:");
		int mesafe=input.nextInt();
		System.out.println("Lütfen yasinizi girin:");
		int yas=input.nextInt();
		double toplam=mesafe*0.1;
		if(mesafe<0 || yas<0) {
			System.out.println("Uyarı:mesafe ve yasi poziitf tam sayi girin!");
		}
		System.out.println("Yolculuk tipini girin:\n1-gidis/donus\n2-tek yon");
		int tip= input.nextInt();
		if(tip==1 || tip==2) {
		    if(yas<12 && tip==1) {
				toplam=toplam-(toplam*0.5);
			    toplam=toplam-(toplam*0.2);
			    toplam=toplam*2;
			}
			else if(yas<12 && tip==2) {
				toplam=toplam-(toplam*0.5);
			}
			else if(12<yas && yas<24 && tip==1){
				toplam=toplam-(toplam*0.1);
				toplam=toplam-(toplam*0.2);
				 toplam=toplam*2;
			}
			
			else if(12<yas && yas<24 &&tip==2){
				toplam=toplam-(toplam*0.1);
			}
			else if(65<yas &&tip==1) {
				toplam=toplam-(toplam*0.3);
				toplam=toplam-(toplam*0.2);
				 toplam=toplam*2;
				
			}
			
			else if(65<yas && tip==2) {
				toplam=toplam-(toplam*0.3);
			}
			
			
			
		}
		else {
			System.out.println("Hatalı veri girdiniz!");
		}
		
			System.out.println("Toplam Tutar="+toplam);
	}
}
