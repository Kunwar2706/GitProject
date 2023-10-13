package Java_practice_ty;

import java.util.LinkedHashSet;

public class Occurance_of_each_word {

	public static void main(String[] args) {
String s="i am am from from bettiah bihar";
String[] st = s.split(" ");
LinkedHashSet<String>set=new LinkedHashSet<>();
for(int i=0;i<st.length;i++)
{
	set.add(st[i]);
}
for(String w:set)//i am from bettiah bihar
{    int count=0;
	for(int i=0;i<st.length;i++)
	{
		if(w.equals(st[i]))
		{
			count++;
		}
	}
	System.out.println(w+" reapeats in " +count+" times");
}
	}

}
