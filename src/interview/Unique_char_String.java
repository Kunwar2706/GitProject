package interview;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Unique_char_String {

	public static void main(String[] args) {
       String s="google";
       LinkedHashSet<Character>set=new LinkedHashSet<Character>();
       for (int i = 0; i < s.length(); i++) {
    	   set.add(s.charAt(i));
		
	}
       for (Character ch : set) //gole
       {
		System.out.println(ch);
	   }
       
       
	}

}
