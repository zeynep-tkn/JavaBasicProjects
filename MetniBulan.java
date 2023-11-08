import java.util.Scanner;

public class MetniBulan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin girin: ");
        String metin = input.nextLine();

        int uzunluk = metin.length();

        if (uzunluk % 2 == 0) {
            
            int orta1 = uzunluk / 2 - 1;
            int orta2 = uzunluk / 2;
            char harf1 = metin.charAt(orta1);
            char harf2 = metin.charAt(orta2);
            System.out.println("Metin:"+metin);
            System.out.println("Metnin uzunluğu:"+metin.length());
            System.out.println("Orta harf: " + harf1 + harf2);
        }
        else {
           
            int orta = uzunluk / 2;
            char harf = metin.charAt(orta);
            System.out.println("Metin:"+metin);
            System.out.println("Metnin uzunluğu:"+metin.length());
            System.out.println("Orta harf: " + harf);
        }
    }
}
