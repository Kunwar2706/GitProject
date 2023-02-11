package Java_practice_ty;

import java.util.LinkedHashSet;

public class UniueChar_of_eacha_string {

	public static void main(String[] args) {
		String s="TestYantra";
		String ch = s.toLowerCase();
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for(int i=0;i<ch.length();i++)
		{
			set.add(ch.charAt(i));
		}
		for(Character cha:set)//tesyanr
		{
			System.out.print(cha);
		}
	}

}
