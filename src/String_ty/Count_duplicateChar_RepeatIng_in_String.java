package String_ty;

import java.util.LinkedHashSet;

public class Count_duplicateChar_RepeatIng_in_String {

	public static void main(String[] args) {
		String s="TestYantra";
		String s1=s.toLowerCase();
		LinkedHashSet<Character>set=new LinkedHashSet<>();
		for(int i=0;i<s1.length();i++)
		{
			set.add(s1.charAt(i));

		}
		for(Character cha:set)
		{ 
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(cha==s1.charAt(i))
				{
					count++;
				}

			}
			if(count>1)
			{
				System.out.println(cha+" repeats in "+count+" time");
			}
		}

	}

}
