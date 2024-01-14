package application;

import java.util.Scanner;

public class SayilariYaziyaCevirme {

	public static void main(String[] args) {
		SayiAl();

	}
	public static void SayiAl() {
		Scanner input =new Scanner(System.in);
		
		System.out.println("İki basamaklı sayi girin:");
		int sayi=input.nextInt();
		SayiyiYazıyaCevir(sayi);
		}
	
    public static void SayiyiYazıyaCevir(int bir) {
    	int birler,onlar;
    	birler=bir%10;
    	onlar=bir/10;
        
    	Onlar(onlar);
    	Birler(birler);
    	   
    }
    public static void Birler(int a) {

    	switch(a) {
    	case 1: 
    		System.out.print(" bir");
    		break;
    	case 2:
    		System.out.print(" iki");
    		break;
    	case 3:
    		System.out.print(" üç");
    		break;
    	case 4:
    		System.out.print(" dört");
    		break;
    	case 5:
    		System.out.print(" beş");
    		break;
    	case 6:
    		System.out.print(" altı");
    		break;
    	case 7:
    		System.out.print(" yedi");
    		break;
    	case 8:
    		System.out.print(" sekiz");
    		break;
    	case 9:
    		System.out.print(" dokuz");
    		break;	
    	}
    }
    
    public static void Onlar(int a) {

    	switch(a) {
    	case 1: 
    		System.out.print("on");
    		break;
    	case 2:
    		System.out.print("yirmi");
    		break;
    	case 3:
    		System.out.print("otuz");
    		break;
    	case 4:
    		System.out.print("kırk");
    		break;
    	case 5:
    		System.out.print ("elli");
    		break;
    	case 6:
    		System.out.print("altmış");
    		break;
    	case 7:
    		System.out.print("yetmiş");
    		break;
    	case 8:
    		System.out.print("seksen");
    		break;
    	case 9:
    		System.out.print("doksan");
    		break;	
    	}
    }
    
}
