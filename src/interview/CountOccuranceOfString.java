package interview;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class CountOccuranceOfString {

	public static void main(String[] args) {
String s="The grass is green";
//String[] st = s.split(" ");
LinkedHashSet<Character> list=new LinkedHashSet<Character>();
for (int i = 0; i < s.length(); i++)
{
	list.add(s.charAt(i));
}
for( Character ch:list)
{
	int count=0;
	for (int i = 0; i < s.length(); i++)
	{
		if(ch==s.charAt(i))
		{
			count++;
		}
		
	}
	System.out.println(ch+" occurs in "+ count+" times");
}
	}

	
	}
