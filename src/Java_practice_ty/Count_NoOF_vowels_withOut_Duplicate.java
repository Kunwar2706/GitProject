package Java_practice_ty;

import java.util.LinkedHashSet;

public class Count_NoOF_vowels_withOut_Duplicate {

	public static void main(String[] args) {
String s="testYantra";
char[] st = s.toCharArray();
LinkedHashSet<Character>set =new LinkedHashSet<Character>();
for(int i=0;i<st.length;i++)
{
	set.add(st[i]);
}
int count=0;
for(Character ch:set)//tesYanr
{
	

	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		count++;
		//System.out.print(ch);
	}
}
System.out.print(" no of duplicate vowels is " +count);
	}

}
