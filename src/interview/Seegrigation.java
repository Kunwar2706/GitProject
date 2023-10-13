package interview;

public class Seegrigation {

	public static void main(String[] args) {
String s="ab12@$cd";
char[] ch = s.toCharArray();
String alph=" ";
String space=" ";
String num=" ";
for (int i = 0; i < ch.length; i++) 
{
	if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z') 
	{
		alph=alph+ch[i];
	}
	else if(ch[i]>='0'&&ch[i]<='9')
	{
		num=num+ch[i];
	}
	else
	{
		space=space+ch[i];
	}
}
System.out.println(alph+" "+num+" "+space);
	}

}
