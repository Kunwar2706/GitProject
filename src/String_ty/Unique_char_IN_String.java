package String_ty;

import java.util.LinkedHashSet;

public class Unique_char_IN_String {

	public static void main(String[] args) {
//String s="TestYantra";
//char[] ch = s.toCharArray();
//LinkedHashSet<Character>set=new LinkedHashSet<>();
//
//for(int i=0;i<s.length();i++) {
//	set.add(ch[i]);
//}
//for(Character cha:set)
//{
//	System.out.println(cha);
//}
		
		
		
		//2 by sir
		
		String s="TestYantra";
		String st=s.toLowerCase();
		LinkedHashSet<Character>set=new LinkedHashSet<>();
		for(int i=0;i<st.length();i++)
		{
			set.add(st.charAt(i));
		}
		
		for(Character ch:set)
		{
			System.out.print(ch+" ");
		}
	}

}
