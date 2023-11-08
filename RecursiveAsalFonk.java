import java.util.Scanner;
public class RecursiveAsalFonk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();
        if (isAsal(sayi, 2)) {
            System.out.println(sayi + " bir asal sayidir.");
        } else {
            System.out.println(sayi + " bir asal sayi değildir.");
        }
    }
    
    public static boolean isAsal(int sayi, int bolen) {
        if (sayi <= 1) 
            return false;
        if (bolen * bolen > sayi) 
            return true;
        if (sayi % bolen == 0)
            return false;
        return isAsal(sayi, bolen + 1);
    }
}

