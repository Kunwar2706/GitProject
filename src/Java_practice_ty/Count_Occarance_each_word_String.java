package Java_practice_ty;

import java.util.LinkedHashSet;

public class Count_Occarance_each_word_String {

	public static void main(String[] args) {
		String s="welcome to TestYantra to  Testaantra india";
		String[] st = s.split(" ");
		LinkedHashSet<String>set =new LinkedHashSet<String>();
		for(int i=0;i<st.length;i++)
		{
			set.add(st[i]);
		}
		for(String st1:set)//welcome to Testyantra in india
		{     int count=0;
			for(int i=0;i<st.length;i++)
			{
				if(st1.equals(st[i]))
				{
					count++;
				}
			}
			System.out.println(st1+" =---is repeating = "+count+ " times");
		}

	}

}
