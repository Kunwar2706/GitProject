package interview;

import java.util.LinkedHashSet;

public class Count_Duplicate_charRepeating_in_String {

	public static void main(String[] args) {
	String s="google";
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for (int i = 0; i <s.length(); i++) 
	{
		set.add(s.charAt(i)); 
  	} 
for (Character ch: set)
{
	int count =0;
	for(int i=0;i<s.length();i++)
	{
		if(ch==s.charAt(i))
		{
			count++;
		}
		if(count>1)
		{
			
		}
		
	}
	System.out.println(ch+" reapting "+count+ " times");
}
	}

}
