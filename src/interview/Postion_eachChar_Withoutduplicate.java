package interview;

import java.util.LinkedHashSet;

public class Postion_eachChar_Withoutduplicate {

	public static void main(String[] args) {
	String s="google";
	LinkedHashSet<Character>set=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		set.add(s.charAt(i));
	}
	for(Character ch:set)//gole
	{
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				System.out.println(ch+" is in "+ (i+1)+" postion");
				break; 
			}
		}
	}

	}

}
