package Java_practice_ty;

import java.util.LinkedHashSet;

public class Count_unique_word_in_String {

	public static void main(String[] args) {
String s="Welcome to bettiah to bettiah city city";
String[] st = s.split(" ");
LinkedHashSet<String>set =new LinkedHashSet<String>();
for(int i=0;i<st.length;i++)
	{
		set.add(st[i]);
	}

	for(String s1:set)//welcome
	{
		int count=0;
		 for(int i=0;i<st.length;i++)
		 {
			 if(s1.equals(st[i]))
					 {
				 count++;
					 }
		 }
		 if(count==1)
			System.out.println(s1+"    "+ count);
	}

	
	}
}
