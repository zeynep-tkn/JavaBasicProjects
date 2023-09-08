//fonksiyon deneme
public class fonk2 {
    static int power(int a,int b) {
    	int res= 1,i;
    	for(i=1;i<=b;i++)
    		res=res*a;
    	
    	System.out.println("ilk:"+res);
    	return res;
    }
	
    
	public static void main(String[] args) {
		int r2=power(10,2);
		System.out.println("ikinci:"+r2);

	}

}
