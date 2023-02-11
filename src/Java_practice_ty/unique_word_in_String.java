package Java_practice_ty;

import java.util.LinkedHashSet;

public class unique_word_in_String {

	public static void main(String[] args) {
String s=" Welcome to bettiah to bettiah city";
String[] st = s.split(" ");
LinkedHashSet<String>set=new LinkedHashSet<String>();
for(int i=0;i<st.length;i++) 
{
	set.add(st[i]);
}
for(String w:set) 
{
	System.out.print(w+" ");
}

	}

}
