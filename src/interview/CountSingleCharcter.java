package interview;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CountSingleCharcter {

	public static void main(String[] args) {

		String s = "Pankaj Sharma";
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			lhs.add(s.charAt(i));
			
		}
		System.out.println(lhs);
		
	}

}
