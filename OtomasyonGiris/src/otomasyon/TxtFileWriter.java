//Uye giris bilgilerini yaz
package otomasyon;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TxtFileWriter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Metin dosyasını oluşturmak ve yazma islemleri
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("dosya.txt", true))) {
            

            // Dosyaya yazılacak veri
        	
        	    User myUser=new User("Varsayilan kullanici Adi","Varsayilan sifre");
        	    myUser.bilgileriAl(input);
        	    
                bw.write(String.format("| %-20s | %-20s |%n", "Kullanici Adi", "Sifre"));
                bw.write(String.format("| %-20s | %-20s |%n", myUser.getKullaniciAdi(), myUser.getsifre()));
                bw.newLine();
                
                System.out.println("Uye bigileri dosyaya yazildi.");

     
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
