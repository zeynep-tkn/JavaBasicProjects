//fonksiyon deneme
public class fonkDeneme {

	public static void main(String[] args) {
		power(2,3);
		power(3,2);
		fonk(6);
		fonk(4);
	}
    
	static void fonk(int x) {
    	 int deger=(x+2)*4;
    	 System.out.println(deger+":cevap");
     }
	
	 
	 static void power(int number1,int number2) {
		int sonuc=1,i;
		for(i=1;i<=number2;i++) 
			sonuc=number1*sonuc;
		  	
		System.out.println("cevap:"+sonuc);
		
	 }
	 
}
