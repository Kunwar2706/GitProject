package Java_practice_ty;

import java.util.LinkedHashSet;

public class Uniue_word_String {

	public static void main(String[] args) {
		String s="i am am from bettiah bettiah bihar";
		String[] st = s.split(" ");
		
		LinkedHashSet<String>set =new LinkedHashSet<String>();
		for(int i=0;i<st.length;i++)
		{
			set.add(st[i]);
		}
		for(String wd:set)
		{
			System.out.print(wd+" ");
		}

	}

}
