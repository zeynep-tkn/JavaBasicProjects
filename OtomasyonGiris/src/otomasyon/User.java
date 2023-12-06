package otomasyon;

import java.util.Scanner;

public class User {
    public String kullaniciAdi;
    public String sifre; 
    
     
       public User(String kullaniciAdi,String sifre) {
		this.kullaniciAdi = kullaniciAdi;
		this.sifre =sifre;
	   }
       
       
        public String getKullaniciAdi() {
    	 return kullaniciAdi;
       }
        public String getsifre() {
       	 return sifre;
          }
       
        public void bilgileriAl(Scanner input) {
        	System.out.println("Kullanici adi girin:");
        	this.kullaniciAdi=input.nextLine();
        	
        	System.out.println("Sifre girin:");
        	this.sifre=input.nextLine();
        
        }
 
}
