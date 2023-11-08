/*Girilen N tane sayma sayisindan
en büyük ve en küçük sayilari bulan bu sayilari ekrana yazan program*/

import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayi gireceksiniz: ");
        int N = input.nextInt();
        
        int min = Integer.MAX_VALUE; // En büyük integer değeri ile başlatılır
        int max = Integer.MIN_VALUE; // En küçük integer değeri ile başlatılır
        
        for (int i = 0; i < N; i++) {
            System.out.print("Sayi " + (i + 1) + ": ");
            int sayi = input.nextInt();
            if (sayi < min) {
                min = sayi;
            }
            if (sayi > max) {
                max = sayi;
            }
        }
        System.out.println("En küçük sayi: " + min);
        System.out.println("En büyük sayıi: " + max);
    }
}