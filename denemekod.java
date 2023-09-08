//ortalama hesaplama

import java.util.Scanner;
public class OrtHesaplama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int vize,finall,quiz;
        float ort;
        System.out.println("quiz notu girin:");
        quiz=input.nextInt();
        System.out.println("vize notu girin:");
        vize=input.nextInt();
        System.out.println("final notu girin:");
        finall=input.nextInt();
        ort=(finall+vize+quiz)/3;
        System.out.println("ortalamaniz:"+ort);
    }
}
