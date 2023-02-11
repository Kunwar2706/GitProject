
package String_ty;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Postion_of_each_Character_without_duplicate {

	public static void main(String[] args) {
		//				String s="TestYantra";
		//				char[] ch=s.toCharArray(); 
		//				LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		//				for(int i=0;i<s.length();i++) 
		//				{
		//					set.add(ch[i]);
		//				}
		//				System.out.println(set);
		//		
		//		
		//				for( Character cha:set)//T,e,s,t,y,a,n.r
		//				{
		//					for(int i=0;i<s.length();i++)
		//					{
		//						if(cha==ch[i]) //T,e,s,t,Y,a,n,t,r,a
		//						{
		//							System.out.println(ch[i]+" is in "+(i+1)+" postion");
		//							break;
		//						}
		//					}
		//				}
		//		
		//  method 2by sir
		String s="TestYantra";
		String st = s.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<st.length();i++)
		{
			set.add(st.charAt(i));
		}


		for(Character ch:set)
		{
			for(int i=0;i<st.length();i++)
			{
				if(ch==st.charAt(i));

				System.out.println(ch+" is in "+(i+1)+" postion");
				break;
			}
		}


	}

}
