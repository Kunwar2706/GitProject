package String_ty;

import java.util.LinkedHashSet;

public class Unique_words_String {

	public static void main(String[] args) {
		String s="I am from from am Testyantra";
		String[] s1 = s.split(" ");
		LinkedHashSet<String>set=new LinkedHashSet<>();
		for(int i=0;i<s1.length;i++)
		{
			set.add(s1[i]);
		}
for(String cha:set)
{
	System.out.print(cha+" ");
}
	}

}
