//Listeye kitap ekle
package otomasyon;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Scanner;

public class BookListWriter {
    public static void main(String[] args) {
    	
    	
    	
    	boolean ilkSefer = true;
        try (Scanner input = new Scanner(System.in);
             BufferedWriter bw = new BufferedWriter(new FileWriter("kitapListe.txt", true))) {
        	
        	if (ilkSefer) {
                bw.write("KITAP LISTEMIZ");
                bw.newLine();
                bw.write(String.format("| %-20s | %-20s | %-20s | %-20s |%n", "Kitap", "Yazar","Yayin Adi", "Sayfa Sayisi"));
                bw.write(String.format("---------------------------------------------------------------------------------------------"));
                bw.newLine();
                ilkSefer = false;
                
            }
                
              
                System.out.println("Eklemek istediğiniz kitabın bilgilerini girin:");
         
                Book myBook=new Book("Varsayılan Kitap", "Varsayılan Yazar","varsayilan yayin", 100);
               
                myBook.bilgileriAl(input);
                
         
                
                bw.write(String.format("| %-20s | %-20s | %-20s | %-20s |%n",myBook.getKitapAdi(),myBook.getYazar(),myBook.getYayinAdi(), myBook.getSayfaSayisi()));
                

                System.out.println("Kitap listeye eklendi.");

                
            } 
            catch (IOException e) {
              e.printStackTrace();
              }
    }
}
