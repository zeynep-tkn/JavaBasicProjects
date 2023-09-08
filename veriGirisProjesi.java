//kullanici adi ve sifre giris
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String k_adi,sifre;
        System.out.println("kullanici adi girin:");
        k_adi=scan.nextLine();
        System.out.println("sifre girin:");
        sifre=scan.nextLine();
        if(k_adi.equals("java") && sifre.equals("123")){
            System.out.println("basarili giris yaptininiz");
        }
        else
        System.out.println("yanlis giris yaptiniz");
    }
}
