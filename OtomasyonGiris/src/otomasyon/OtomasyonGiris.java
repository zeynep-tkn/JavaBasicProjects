package otomasyon;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.util.Scanner;

public class OtomasyonGiris {

    private static final Path dosyaYolu = Paths.get("dosya.txt");

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kutuphane Otomasyonuna hoş geldiniz...");
        System.out.println("1-Uye girisi yap");
        System.out.println("2-Uye ol");
        System.out.println("3-Cikis yap");

        System.out.println("İslem secin:");
        int secim = input.nextInt();

        switch (secim) {
            case 1:
                girisYap();
                break;
            case 2:
                uyeOl();
                break;
            case 3:
                System.out.println("Çıkış yapılıyor. İyi günler!");
                break;
            default:
                System.out.println("Geçersiz seçenek. Tekrar deneyin.");
                break;
        }

        input.close();
    }

    private static void girisYap() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adı: ");
        String kullaniciAdi = input.next();
        System.out.print("Şifre: ");
        String sifre = input.next();
        
        if (uyeKontrolu(kullaniciAdi, sifre)) {
            System.out.println("Giriş yapılıyor...");
        } else {
            System.out.println("Üyeliğiniz bulunmamaktadır. Lütfen önce üye olun!");
        }
    }

    private static void uyeOl() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adı: ");
        String kullaniciAdi = input.next();

        System.out.print("Şifre: ");
        String sifre = input.next();


        // Kullanıcı bilgilerini dosyaya yazma
        try{
            if (uyeKontrolu(kullaniciAdi, sifre)) {
                System.out.println("Üyeliğiniz zaten var. Giriş yapabilirsiniz.");
            } 
            else {
                String yeniUyeBilgisi = kullaniciAdi + "," + sifre;
                Files.writeString(dosyaYolu, yeniUyeBilgisi + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
               
                System.out.println("Üye olunuyor...");
                }  
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static boolean uyeKontrolu(String arananKullaniciAdi, String arananSifre) {
        try {
            return Files.lines(dosyaYolu)
                    .anyMatch(line -> {
                        String[] kullaniciBilgileri = line.split(",");
                        
                        return kullaniciBilgileri.length == 2 && kullaniciBilgileri[0].equals(arananKullaniciAdi) && kullaniciBilgileri[1].equals(arananSifre);
                    });
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
 

}


