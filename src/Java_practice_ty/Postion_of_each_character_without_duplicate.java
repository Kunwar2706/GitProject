package Java_practice_ty;

import java.util.LinkedHashSet;

public class Postion_of_each_character_without_duplicate {

	public static void main(String[] args) {
String s="Testyantra";
LinkedHashSet<Character>set=new LinkedHashSet<Character>();
for(int i=0;i<s.length();i++)
{
	set.add(s.charAt(i));
}
for(Character cha:set)//tesyanr
{
	for(int i=0;i<s.length();i++)
	if(cha==s.charAt(i))
	{
		System.out.println(cha+" is in "+(i+1)+" postion");
		break;

	}
}

	}

}