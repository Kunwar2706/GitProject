package Java_practice_ty;

import java.util.LinkedHashSet;

public class Postion_of_eachWord_without_duplicate {

	public static void main(String[] args) {
String s="i am am from bettiah bettiah  bihar";
String[] st = s.split(" ");
LinkedHashSet<String>set=new LinkedHashSet<String>();
for(int i=0;i<st.length;i++)
{
	set.add(st[i]);
}
for(String w:set)//i am from bettiah bihar.
{
	for(int i=0;i<st.length;i++)
	{
		if(w==st[i])
		{
			System.out.println(w+" is in "+(i+1)+" postrtion");
		}
	}
}
	}

}
