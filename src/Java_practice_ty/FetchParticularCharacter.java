package Java_practice_ty;

import java.util.ArrayList;

public class FetchParticularCharacter {

	public static void main(String[] args) {
String s="AmitSingh";//o/p  o/p= AiSnh=8           0,2,4,6,8
char[] ch = s.toCharArray();
for(int i=0;i<ch.length;i++)
{
	if(i%2==0)
	{
		
		System.out.print(ch[i]);
	}


	
	
}
System.out.println();
System.out.println(s.length()-1);
	}

}
