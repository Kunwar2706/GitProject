package Java_practice_ty;

import java.util.LinkedHashSet;

public class Count_duplicate_char_In_String {

	public static void main(String[] args) {
String s="TestYantra";
String st = s.toLowerCase();
LinkedHashSet<Character>set =new LinkedHashSet<Character>();
for(int i=0;i<st.length();i++)
{
	set.add(st.charAt(i));
}
for(Character ch:set)//tesyanr
{ 
	int count=0;
	for(int i=0;i<st.length();i++) 
	{
		if(ch==st.charAt(i)) 
		{
			count++;
		}
	}
			if(count>1)
			{
				System.out.println(ch+" duplicate cha is "+count+" times");
			}
	
	
}
	}

}

