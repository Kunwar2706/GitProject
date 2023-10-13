package String_ty;

import java.util.LinkedHashSet;

public class CountNo_vowels_isInString_without_Duplicate {

	public static void main(String[] args) {
		String s="testyantra"; //ae =2
		//char[] ch = s.toCharArray();
		LinkedHashSet<Character>set=new LinkedHashSet<>();
				for(int i=0;i<s.length();i++)
				{
					set.add(s.charAt(i));
				}   
	int count=0;
	for(Character ch:set)
	
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			count++;
			System.out.println(ch);
		}
	}
System.out.println("no of vowels in a string  without duplicate are = "+ count);
	}

}
