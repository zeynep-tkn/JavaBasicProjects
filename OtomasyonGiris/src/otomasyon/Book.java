package otomasyon;

import java.util.Scanner;

public class Book {
public String kitapAdi;
public String yazar;
public String yayinAdi;
public int sayfaSayisi;
   
   public Book(String kitapAdi,String yazar,String yayinAdi,int sayfaSayisi) {
	   this.kitapAdi=kitapAdi;
	   this.yazar=yazar;
	   this.yayinAdi=yayinAdi;
	   this.sayfaSayisi=sayfaSayisi;
   }
   
   public String getKitapAdi() {
	   return kitapAdi; 
   }
   public String getYazar() {
	   return yazar; 
   }
   public String getYayinAdi() {
	   return yayinAdi; 
   }
   public int getSayfaSayisi() {
	   return sayfaSayisi; 
   }
   
   
   
   public void bilgileriAl(Scanner input) {
	   
       System.out.print("Kitap Adı: ");
       this.kitapAdi = input.nextLine();

       System.out.print("Yazar: ");
       this.yazar = input.nextLine();

       System.out.print("Yayin Adi: ");
       this.yayinAdi = input.nextLine();

       System.out.print("Sayfa Sayısı: ");
       this.sayfaSayisi = input.nextInt();
       input.nextLine();
   }
   
   
   
}
