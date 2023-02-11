 package String_ty;

import java.util.LinkedHashSet;

public class Occurance_of_each_char_In_String {

	public static void main(String[] args) {
//		String s="TestYantra";
//		char[] ch=s.toCharArray();
//		LinkedHashSet<Character>set=new LinkedHashSet<>();
//		for(int i=0;i<s.length();i++)
//		{
//			set.add(ch[i]);
//		}
//		for(Character cha:set)//TestYanr
//		{
//			int count=0;
//			for(int i=0;i<s.length();i++)
//			{
//				if( cha==ch[i])
//				{
//					count++;
//				}
//				
//			}
//			System.out.println(cha+" appear in " +count+" times");
//		}
//		
		
		//
		
		String s="TestYantra";
		String st=s.toLowerCase();
		
		LinkedHashSet<Character>set=new LinkedHashSet<>();
		for(int i=0;i<st.length();i++)
		{
			set.add(st.charAt(i));
		}
		for(Character cha:set)//TestYanr
		{
			int count=0;
			for(int i=0;i<st.length();i++)
			{
				if( cha==st.charAt(i))
				{
					count++;
				}
				
			}
			System.out.println(cha+" appear in " +count+" times");
		}
	}
}


