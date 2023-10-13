package interview;

public class RemoveWhiteSpace {
	public static void main(String[] args) 
	{
	String s="Ram is god";
	char[] ch = s.toCharArray();
	String st=" ";
	for (int i = 0; i < ch.length; i++)
	{
		if(ch[i]!=' ')
		{
			st=st+ch[i];
		}
	}
	System.out.print(st);
	}
	
	
	

}
