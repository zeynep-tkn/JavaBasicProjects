//HashSet-HashMap
package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
       //HashSet
	    HashSet<String> mySet=new  HashSet<String>();
	    
	    mySet.add("James");
	    mySet.add("Kevin");
	    mySet.add("James");
        
	    System.out.println("set sayisi="+mySet.size());
	    
	    //HashMap: Anahtar kelime ile deger cekme
	    
	    //Ornek1
	    HashMap<String, String> myHashMap=new HashMap <String, String>();
	    
	    myHashMap.put("sayi", "dort");
	    myHashMap.put("renk", "mavi");
	    
	    System.out.println(myHashMap.get("sayi"));
	    System.out.println(myHashMap.get("renk"));
	    
	    //Ornek2
	    HashMap<String, Integer> myHashMap2=new HashMap<String ,Integer>();
	    
	    myHashMap2.put("run", 100);
	    myHashMap2.put("basketball", 200);
	    
	    System.out.println(myHashMap2.get("run"));
	    System.out.println(myHashMap2.get("basketball"));
	}

}
