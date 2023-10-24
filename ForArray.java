package Arrays;

public class ForArray {

	public static void main(String[] args) {
		int myArray[]= {12,15,18,21};
		int x,i;
		
		for(i=0;i<myArray.length;i++) {
		x=myArray[i]/3*4;
		
		System.out.println("sonuc="+x);
		}
		
		//kisa yoldan islem
		for(int number :myArray) {
			System.out.println("son:"+number/3*4);
		}
		
		
	}
}
