import java.util.Scanner;

public class ifUygF {

	public static void main(String[] args) {
		notOrtalamasi();

	}
	
	public static void notOrtalamasi() {
		Scanner input=new Scanner(System.in);
		System.out.println("Dönem sonu ortalamanizi girin:");
		int not=input.nextInt();
	     if(not>=90){
		  System.out.println("AA ile geciyorsunuz");
	     }
	     else if(not>80 && not<90){
			System.out.println("BA ile geciyorsunuz");
		}
	     else if(not>70 && not<80){
				System.out.println("BB ile geciyorsunuz");
			}
	     else if(not>60 && not<70){
				System.out.println("CB ile geciyorsunuz");
			}
	     else if(not>50 && not<60){
				System.out.println("CC ile geciyorsunuz");
			}
	     else {
	    	 System.out.println("Kaldiniz. gecemiyorsunuz");
		}
	}
	
}
