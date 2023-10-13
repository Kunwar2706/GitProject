package interview;

import java.util.LinkedHashSet;

public class Unique_Word_InString {

	public static void main(String[] args) {
String s=" welcome to to india";
String st[]=s.split(" ");
LinkedHashSet<String> set=new LinkedHashSet<String>();
for (int i= 0; i< st.length; i++) 
{
	set.add(st[i]);
}
for (String s1 : set) {
	System.out.print(s1+" ");
	
}
	}

}
