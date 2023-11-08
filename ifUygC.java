import java.util.Scanner;

public class ifUygC {

	public static void main(String[] args) {
		notOrtalamasi();

	}
	
	public static void notOrtalamasi() {
		Scanner input=new Scanner(System.in);
		System.out.println("Dönem sonu ortalamanizi girin:");
		int not=input.nextInt();
	     if(not>=90){
		  System.out.println("Takdir belgesi almaya hak kazandiniz...");
	     }
	     else if(not<90){
			System.out.println("Takdir belgesi almaya hak kazanamadiniz...");
		}
	     
	}
	
}
