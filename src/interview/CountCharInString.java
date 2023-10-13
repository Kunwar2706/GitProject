package interview;

import java.util.LinkedHashSet;

public class CountCharInString {

	public static void main(String[] args) {
String s="Malayalam";
String st = s.toLowerCase();//malayam
LinkedHashSet<Character>set=new LinkedHashSet<Character>();
for (int i = 0; i < st.length(); i++)//maly
{
	set.add(st.charAt(i));
	
}
for(Character ch:set)//
{   int count=0;
	for (int i = 0; i < st.length(); i++)
	{
		if(ch==st.charAt(i))
		{
			count++;
		}
		
	}
	System.out.print(ch+":"+count);
}
	}

}
