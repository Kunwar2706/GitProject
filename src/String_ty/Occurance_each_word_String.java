package String_ty;

import java.util.LinkedHashSet;

public class Occurance_each_word_String {

	public static void main(String[] args) {
		String s="Welcome to city to Bengluru city ";
		String[] st = s.split(" ");
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		
		for(int i=0;i<st.length;i++)
		{
			set.add(st[i]);
		}
for(String ch:set)
{
	int count=0;
	for(int i=0;i<st.length;i++)
	{
		if(ch.equals(st[i]))
		{
			count++;
		}
	}
	System.out.println(ch+" is repeating "+count+" times ");
}
	}

}
